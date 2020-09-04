package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegisterationTest extends TestBase {

	@Test(priority = 1)
	public void UserCanRegisterSuccessfully() {

		homeObject.openRegestirationPage();
		regestierObject.userRegistration("Mahmoud", "Soliman", "t3@gmail.com", "123456");
		regestierObject.userRegistration("Ali", "Ahmed", "t5@gmail.com", "123456");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Assert.assertTrue(regestierObject.successMessage.getText().contains("Your registration completed"));
	}

	@Test(dependsOnMethods = "UserCanRegisterSuccessfully")
	public void RegisteredUserCanLogout() {

		regestierObject.userLogout();
	}

	@Test(dependsOnMethods = "RegisteredUserCanLogout")
	public void RegisteredUserCanLogin() {

		homeObject.openLoginPage();
		loginObject.userLogin("t3@gmail.com", "123456");
		Assert.assertTrue(regestierObject.logoutLink.getText().contains("Log out"));
	}
}
