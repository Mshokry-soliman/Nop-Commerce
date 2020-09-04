package steps;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CheckOutPage;
import pages.OrderDetailsPage;
import pages.ProductDetailsPage;
import pages.SearchPage;
import pages.ShoppingCartPage;
import tests.TestBase;

public class End2End_Test extends TestBase {

	SearchPage searchObject;
	ProductDetailsPage productDetails;
	ShoppingCartPage cartObject;
	CheckOutPage checkoutObject;
	OrderDetailsPage orderObject;
	String productName = "Apple MacBook Pro 13-inch";

	@Given("^user is in Home page$")
	public void user_is_in_Home_page() {
		Assert.assertTrue(driver.getCurrentUrl().contains("demo.nopcommerce.com"));
	}

	@When("^He search for \"([^\"]*)\"$")
	public void he_search_for(String productName) {
		searchObject = new SearchPage(driver);
		searchObject.ProductSearchUsingAutoSuggest(productName);
	}

	@When("^choose to buy two items$")
	public void choose_to_buy_two_items() {
		productDetails = new ProductDetailsPage(driver);
		productDetails.AddToCart();
	}

	@When("^moves to checkout cart and enter personal details on check outpage and place the order$")
	public void moves_to_checkout_cart_and_enter_personal_details_on_check_outpage_and_place_the_order()
			throws Throwable {
		cartObject = new ShoppingCartPage(driver);
		cartObject.OpenCheckOutPage();
		cartObject.openCheckoutPageAsGuest();
		checkoutObject = new CheckOutPage(driver);
		checkoutObject.CheckoutProduct("test", "test1", "Egypt", "test1@yahoo.com", "new cairo", "123456",
				"321564879456", "cairo", productName);
		checkoutObject.confirmOrder();
	}

	@Then("^he can view the order and download the invoice$")
	public void he_can_view_the_order_and_download_the_invoice() {
		orderObject = new OrderDetailsPage(driver);
		checkoutObject = new CheckOutPage(driver);
		checkoutObject.OpenOderDetailsPage();
		orderObject.DownloadPdfInvoice();
	}
}
