package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisteredUserCheckout extends TestBase {

	@Test(priority = 1)
	public void UserCanRegisterSuccessfully() throws InterruptedException {

		homeObject.openRegestirationPage();
		Thread.sleep(1000);
		regestierObject.userRegistration("Mahmoud", "Soliman", "1@gmail.com", "123456");
		Assert.assertTrue(regestierObject.successMessage.getText().contains("Your registration completed"));
	}

	@Test(priority = 2)
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
		checkoutObject.BillingAddressPage("Cairo", "Gardinia", "12345", "01148976448");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.navigate().to("https://demo.nopcommerce.com/onepagecheckout#opc-shipping_method");
		checkoutObject.ShippingMethod();
		checkoutObject.PaymentInfoPage("Mahmoud Shokry", "371934372120304", "123");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		System.out.println(checkoutObject.ConfirmationMessage.getText());
		checkoutObject.OpenOderDetailsPage();
		orderObject.DownloadPdfInvoice();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		orderObject.PrintOderDetails();
	}

	@Test(dependsOnMethods = "UserCanCheckOutTheProduct")
	public void RegisteredUserCanLogout() {
		regestierObject.userLogout();
	}
}
