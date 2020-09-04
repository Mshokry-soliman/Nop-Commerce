package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ContactUsPage;

public class ContactUsTest extends TestBase {

	ContactUsPage contactObject;
	String fullName = "Mahmoud Soliman";
	String email = "T@test.com";
	String message = "Hello Admin , This is the test case ";
	String successmessage = "Your enquiry has been successfully sent to the store owner.";

	@Test
	public void UserCanUseContactUs() {
		homeObject.OpenContactUsPage();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		contactObject = new ContactUsPage(driver);
		contactObject.ContactUs(fullName, email, message);
		Assert.assertEquals(contactObject.sucessMessage.getText(), successmessage);
	}
}
