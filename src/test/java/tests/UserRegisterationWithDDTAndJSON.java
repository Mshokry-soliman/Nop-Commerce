package tests;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import data.JsonDataReader;

public class UserRegisterationWithDDTAndJSON extends TestBase {

	@Test
	public void UserCanRegisterSuccessfully() throws IOException, ParseException {

		JsonDataReader jsonReader = new JsonDataReader();
		jsonReader.JsonReader();

		homeObject.openRegestirationPage();
		regestierObject.userRegistration(jsonReader.firstname, jsonReader.lastname, jsonReader.email,
				jsonReader.password);
		Assert.assertTrue(regestierObject.successMessage.getText().contains("Your registration completed"));
		regestierObject.userLogout();
		homeObject.openLoginPage();
		loginObject.userLogin(jsonReader.email, jsonReader.password);
		Assert.assertTrue(regestierObject.logoutLink.getText().contains("Log out"));
		regestierObject.userLogout();
	}
}
