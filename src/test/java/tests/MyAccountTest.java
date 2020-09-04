package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.MyAccountPage;

public class MyAccountTest extends TestBase {

	MyAccountPage myacccountObject;
	String oldPassword = "123456";
	String newPassword = "12345678";
	String firstName = "Mahmoud";
	String lastName = "Soliman";
	String email = "t2@gmail.com";

	@Test(priority = 0)
	public void UserCanRegisterSuccessfully() {

		homeObject.openRegestirationPage();
		regestierObject.userRegistration(firstName, lastName, email, oldPassword);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Assert.assertTrue(regestierObject.successMessage.getText().contains("Your registration completed"));
	}

	@Test(dependsOnMethods = "UserCanRegisterSuccessfully")
	public void RegisteredUserCanChangePassword() {

		regestierObject.openMyAccountPage();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		myacccountObject.openChangePasswordPage();
		myacccountObject.ChangePassword(oldPassword, newPassword);
		Assert.assertTrue(myacccountObject.passwordChangeMessage.getText().contains("Password was changed"));
	}

	@Test(dependsOnMethods = "RegisteredUserCanChangePassword")
	public void RegisteredUserCanLogout() {

		regestierObject.userLogout();
	}

	@Test(dependsOnMethods = "RegisteredUserCanLogout")
	public void RegisteredUserCanLogin() {

		homeObject.openLoginPage();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		loginObject.userLogin(email, oldPassword);
		Assert.assertTrue(regestierObject.logoutLink.getText().contains("Log out"));
	}
}
