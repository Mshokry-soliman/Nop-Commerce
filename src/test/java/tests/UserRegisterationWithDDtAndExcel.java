package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcelReader;

public class UserRegisterationWithDDtAndExcel extends TestBase {

	@DataProvider(name = "ExcelData")
	public Object[][] userRegisterData() throws IOException {

		// get data from Excel reader class
		ExcelReader ER = new ExcelReader();
		return ER.getExcelData();
	}

	@Test(dataProvider = "ExcelData")
	public void UserCanRegisterSuccessfully(String firstname, String lastname, String email, String password) {

		homeObject.openRegestirationPage();
		regestierObject.userRegistration(firstname, lastname, email, password);
		Assert.assertTrue(regestierObject.successMessage.getText().contains("Your registration completed"));
		regestierObject.userLogout();
		homeObject.openLoginPage();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		loginObject.userLogin(email, password);
		Assert.assertTrue(regestierObject.logoutLink.getText().contains("Log out"));
		regestierObject.userLogout();
	}
}