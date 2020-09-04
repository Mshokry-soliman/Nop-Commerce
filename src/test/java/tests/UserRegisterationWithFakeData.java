package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class UserRegisterationWithFakeData extends TestBase {

	Faker fakedata = new Faker();
	String firstname = fakedata.name().firstName();
	String lastname = fakedata.name().lastName();
	String email = fakedata.internet().emailAddress();
	String password = fakedata.number().digits(8).toString();

	@Test(priority = 1)
	public void UserCanRegisterSuccessfully() {

		homeObject.openRegestirationPage();
		regestierObject.userRegistration(firstname, lastname, email, password);
		Assert.assertTrue(regestierObject.successMessage.getText().contains("Your registration completed"));
	}

	@Test(dependsOnMethods = "UserCanRegisterSuccessfully")
	public void RegisteredUserCanLogout() {

		regestierObject.userLogout();
	}

	@Test(dependsOnMethods = "RegisteredUserCanLogout")
	public void RegisteredUserCanLogin() {

		homeObject.openLoginPage();
		loginObject.userLogin(email, password);
		Assert.assertTrue(regestierObject.logoutLink.getText().contains("Log out"));
	}
}
