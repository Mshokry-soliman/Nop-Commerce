package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UserRegisterationWithDDTAndDataProvider extends TestBase {

	@DataProvider(name = "testData")
	public static Object[][] userData() {
		return new Object[][] { { "Mahmoud", "Soliman", "a9@gmail.com", "123456" },
				{ "Ahmed", "Ali", "test9@gmail.com", "12345678" } };
	}

	@Test(priority = 1, dataProvider = "testData")
	public void UserCanRegisterSuccessfully(String firstname, String lastname, String email, String password) {

		homeObject.openRegestirationPage();
		regestierObject.userRegistration(firstname, lastname, email, password);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Assert.assertTrue(regestierObject.successMessage.getText().contains("Your registration completed"));
		regestierObject.userLogout();
		homeObject.openLoginPage();
		loginObject.userLogin(email, password);
		Assert.assertTrue(regestierObject.logoutLink.getText().contains("Log out"));
		regestierObject.userLogout();
	}
}
