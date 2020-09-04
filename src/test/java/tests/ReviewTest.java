package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReviewTest extends TestBase {

	String productName = "Apple MacBook Pro 13-inch";
	String reviewTitle = "This is my feedback about this device";
	String reviewMessage = "Good quality laptop";

	@Test(priority = 0)
	public void UserCanRegisterSuccessfully() {

		homeObject.openRegestirationPage();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		regestierObject.userRegistration("Mahmoud", "Soliman", "1@gmail.com", "123456");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Assert.assertTrue(regestierObject.successMessage.getText().contains("Your registration completed"));
	}

	@Test(priority = 1)
	public void UserCanSearchUsingAutoSuggest() {

		try {
			searchObject.ProductSearchUsingAutoSuggest(searchTxt);
			Assert.assertEquals(productObject.productNameBreadCrumb.getText(), productName);
		} catch (Exception e) {
			System.out.println("Error Occured " + e.getMessage());
		}
	}

	@Test(dependsOnMethods = "UserCanSearchUsingAutoSuggest")
	public void UserCanAddReview() {
		productObject.OpenReviewPage();
		reviewObject.AddReview(reviewTitle, reviewMessage);
		Assert.assertTrue(reviewObject.reviewNotification.getText().contains("review"));
	}

	@Test(dependsOnMethods = "UserCanAddReview")
	public void RegisteredUserCanLogout() {

		regestierObject.userLogout();
	}
}
