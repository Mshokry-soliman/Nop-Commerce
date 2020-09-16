package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.HomePage;
import pages.LoginPage;
import pages.UserRegisterationPage;

public class UserRegisterationParallelTetsing extends TestBase2 {

	HomePage homeObject;
	UserRegisterationPage regestierObject;
	LoginPage loginObject;

	Faker fakedata = new Faker();
	String firstname = fakedata.name().firstName();
	String lastname = fakedata.name().lastName();
	String email = fakedata.internet().emailAddress();
	String password = fakedata.number().digits(8).toString();

	@Test(priority = 1)
	public void UserCanRegisterSuccessfully() {
		homeObject = new HomePage(getDriver());
		homeObject.openRegestirationPage();
		regestierObject = new UserRegisterationPage(getDriver());
		regestierObject.userRegistration(firstname, lastname, email, password);
		Assert.assertTrue(regestierObject.successMessage.getText().contains("Your registration completed"));
	}

	@Test(dependsOnMethods = "UserCanRegisterSuccessfully")
	public void RegisteredUserCanLogout() {
		regestierObject = new UserRegisterationPage(getDriver());
		regestierObject.userLogout();
	}

	@Test(dependsOnMethods = "RegisteredUserCanLogout")
	public void RegisteredUserCanLogin() {
		loginObject = new LoginPage(getDriver());
		regestierObject = new UserRegisterationPage(getDriver());
		homeObject.openLoginPage();
		loginObject.userLogin(email, password);
		Assert.assertTrue(regestierObject.logoutLink.getText().contains("Log out"));
	}
}
