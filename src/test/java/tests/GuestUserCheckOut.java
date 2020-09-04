package tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class GuestUserCheckOut extends TestBase {

	String productName = "Apple MacBook Pro 13-inch";

	@Test(priority = 1)
	public void ProductSearchUsingAutoSuggest() {
		searchObject.ProductSearchUsingAutoSuggest(searchTxt);
	}

	@Test(dependsOnMethods = "ProductSearchUsingAutoSuggest")
	public void UserCanUpdateTheCart() {
		cartObject.QuantityTxt.clear();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		cartObject.QuantityTxt.sendKeys(String.valueOf(5));
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@Test(dependsOnMethods = "UserCanUpdateTheCart")
	public void UserCanAddProductToShoppingcCart() throws InterruptedException {
		productObject.AddToCart();
		cartObject.OpenCheckOutPage();
		System.out.println(cartObject.conditionOfUserMessage.getText());
	}

	@Test(dependsOnMethods = "UserCanAddProductToShoppingcCart")
	public void UserCanCheckOutTheProduct() throws InterruptedException {

		checkoutObject.CheckOutProducttotal("Mahmoud", "Soliman", "a1@gmail.com", "Gardinia", "12345", "01148976587",
				"Cairo", productName, "Mahmoud Soliman", "371934372120304", "123");
		checkoutObject.OpenOderDetailsPage();
		orderObject.DownloadPdfInvoice();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		orderObject.PrintOderDetails();
	}
}
