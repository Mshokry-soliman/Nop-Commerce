package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.EmailToFriendPage;

public class EmailToFriendTest extends TestBase {

	String productName = "Apple MacBook Pro 13-inch";
	EmailToFriendPage emailObject;
	String FriendEmail = "t1@test.com";
	String personalMessage = " This is a new test case ";

	@Test
	public void UserCanRegisterSuccessfully() {
		homeObject.openRegestirationPage();
		regestierObject.userRegistration("Mahmoud", "Soliman", "q1@gmail.com", "123456");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Assert.assertTrue(regestierObject.successMessage.getText().contains("Your registration completed"));
	}

	@Test(enabled = false)
	public void UserCanSearchUsingAutoSuggest() {

		try {
			searchObject.ProductSearchUsingAutoSuggest(searchTxt);
			Assert.assertEquals(productObject.productNameBreadCrumb.getText(), productName);
		} catch (Exception e) {
			System.out.println("Error Occured " + e.getMessage());
		}
	}

	@Test(enabled = false)
	public void UserCanEmailAFriend() {
		productObject.OpenEmailPage();
	}

	@Test(enabled = false)
	public void UserCanSendEmail() throws InterruptedException {
		Thread.sleep(3000);
		emailObject.EmailAFriend(FriendEmail, personalMessage);
		Assert.assertTrue(emailObject.messageNotification.getText().contains(("Your message has been sent")));
		System.out.print(emailObject.messageNotification.getText());
	}

	@Test(enabled = false)
	public void RegisteredUserCanLogout() {
		regestierObject.userLogout();
	}
}
