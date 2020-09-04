package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ProductDetailsPage;

public class AddProductToCompareTest extends TestBase {

	String productName1 = "Apple MacBook Pro 13-inch";
	String productName2 = "Asus N551JK-XO076H Laptot";

	@Test(priority = 1)
	public void UserCanSearchUsingAutoSuggest() {

		searchObject.ProductSearchUsingAutoSuggest("MacB");
		Assert.assertTrue(productObject.productNameBreadCrumb.getText().contains(productName1));
	}

	@Test(priority = 2)
	public void UserCanAddProductToCompare() throws InterruptedException {
		productObject.OpenAddToComparePage();
		Thread.sleep(3000);
	}

	@Test(priority = 3)
	public void UserCanSearchUsingAutoSuggestForAnotherProduct() {

		searchObject.ProductSearchUsingAutoSuggest("asus");
	}

	@Test(priority = 4)
	public void UserCanAddAnotherProductToCompare() {
		productObject = new ProductDetailsPage(driver);
		productObject.OpenAddAnotherProduct();
		Assert.assertTrue(compareObject.productName1.getText().contains("Apple MacBook Pro 13-inch"));
		Assert.assertTrue(compareObject.productName2.getText().contains("Asus"));
		compareObject.CompareProducts();
		compareObject.clearCompareList();
		Assert.assertTrue(compareObject.noDataLbl.getText().contains("You have no"));
	}
}
