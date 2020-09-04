package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingCartTest extends TestBase {

	@Test(priority = 1)
	public void ProductSearchUsingAutoSuggest() {
		searchObject.ProductSearchUsingAutoSuggest(searchTxt);
	}

	@Test(dependsOnMethods = "ProductSearchUsingAutoSuggest")
	public void UserCanUpdateTheCart() {
		cartObject.QuantityTxt.clear();
		cartObject.QuantityTxt.sendKeys(String.valueOf(5));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		productObject.AddToCart();
	}

	@Test(dependsOnMethods = "UserCanUpdateTheCart")
	public void UserCanRemoveProductFromCart() {
		cartObject.RemoveProductFromCart();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Assert.assertTrue(cartObject.messageafterremoveproduct.getText().contains("Your Shopping"));
	}
}
