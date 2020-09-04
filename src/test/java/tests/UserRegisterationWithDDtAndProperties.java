package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import data.LoadProperties;

public class UserRegisterationWithDDtAndProperties extends TestBase {

	String firstname = LoadProperties.userData.getProperty("firstname");
	String lastname = LoadProperties.userData.getProperty("lastname");
	String email = LoadProperties.userData.getProperty("email");
	String password = LoadProperties.userData.getProperty("password");

	@Test(priority = 1)
	public void UserCanRegisterSuccessfully() throws InterruptedException {
		homeObject.openRegestirationPage();
		regestierObject.userRegistration(firstname, lastname, email, password);
		Assert.assertTrue(regestierObject.successMessage.getText().contains("Your registration completed"));
		regestierObject.userLogout();
		homeObject.openLoginPage();
		Thread.sleep(2000);
		loginObject.userLogin(email, password);
		Assert.assertTrue(regestierObject.logoutLink.getText().contains("Log out"));
	}
}
