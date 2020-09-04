package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ProductDetailsPage;
import pages.SearchPage;
import pages.WishListPage;

public class AddProductToWishListTest extends TestBase {

	SearchPage searchObject;
	ProductDetailsPage productObject;
	WishListPage wishListObject;
	String productName = "Apple MacBook Pro 13-inch";

	@Test(priority = 1)
	public void UserCanSearchUsingAutoSuggest() {

		searchObject = new SearchPage(driver);
		searchObject.ProductSearchUsingAutoSuggest("MacB");
		productObject = new ProductDetailsPage(driver);
		Assert.assertTrue(productObject.productNameBreadCrumb.getText().contains(productName));
	}

	@Test(priority = 2)
	public void UserCanAddProductToWishList() {
		productObject = new ProductDetailsPage(driver);
		productObject.AddProductToWishList();
		productObject.openWishlistPage.click();
		wishListObject = new WishListPage(driver);
		Assert.assertTrue(wishListObject.productcell.getText().contains(productName));
	}

	@Test(priority = 3)
	public void UserCanRemoveFromWishList() {
		wishListObject = new WishListPage(driver);
		wishListObject.RemoveProductFromCart();
	}
}
