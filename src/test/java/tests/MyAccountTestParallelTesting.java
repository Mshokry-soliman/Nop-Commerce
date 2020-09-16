package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.UserRegisterationPage;

public class MyAccountTestParallelTesting extends TestBase2 {

	HomePage homeObject;
	UserRegisterationPage regestierObject;
	LoginPage loginObject;
	MyAccountPage myacccountObject;

	String oldPassword = "123456";
	String newPassword = "12345678";
	String firstName = "Mahmoud";
	String lastName = "Soliman";
	String email = "t2@gmail.com";

	@Test(priority = 0)
	public void UserCanRegisterSuccessfully() {
		homeObject = new HomePage(getDriver());
		homeObject.openRegestirationPage();
		regestierObject = new UserRegisterationPage(getDriver());
		regestierObject.userRegistration(firstName, lastName, email, oldPassword);
		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Assert.assertTrue(regestierObject.successMessage.getText().contains("Your registration completed"));
	}

	@Test(dependsOnMethods = "UserCanRegisterSuccessfully")
	public void RegisteredUserCanChangePassword() {
		regestierObject = new UserRegisterationPage(getDriver());
		regestierObject.openMyAccountPage();
		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		myacccountObject = new MyAccountPage(getDriver());
		myacccountObject.openChangePasswordPage();
		myacccountObject.ChangePassword(oldPassword, newPassword);
		Assert.assertTrue(myacccountObject.passwordChangeMessage.getText().contains("Password was changed"));
	}

	@Test(dependsOnMethods = "RegisteredUserCanChangePassword")
	public void RegisteredUserCanLogout() {
		regestierObject = new UserRegisterationPage(getDriver());
		regestierObject.userLogout();
	}

	@Test(dependsOnMethods = "RegisteredUserCanLogout")
	public void RegisteredUserCanLogin() {
		homeObject = new HomePage(getDriver());
		homeObject.openLoginPage();
		getDriver().manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		loginObject = new LoginPage(getDriver());
		loginObject.userLogin(email, oldPassword);
		Assert.assertTrue(regestierObject.logoutLink.getText().contains("Log out"));
	}
}
