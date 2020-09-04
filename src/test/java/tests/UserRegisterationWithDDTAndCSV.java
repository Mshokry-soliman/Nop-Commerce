package tests;

import java.io.FileReader;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class UserRegisterationWithDDTAndCSV extends TestBase {

	CSVReader reader;

	@Test
	public void UserCanRegisterSuccessfully() throws CsvValidationException, IOException {

		// get path for CSV file
		String csvfile = System.getProperty("user.dir") + "/src/test/java/data/userdata.csv";
		reader = new CSVReader(new FileReader(csvfile));
		String[] csvCell;
		// while loop will be executed till the lastvalue in CSV file
		while ((csvCell = reader.readNext()) != null) {
			String firstname = csvCell[0];
			String lastname = csvCell[1];
			String email = csvCell[2];
			String password = csvCell[3];

			homeObject.openRegestirationPage();
			regestierObject.userRegistration(firstname, lastname, email, password);
			Assert.assertTrue(regestierObject.successMessage.getText().contains("Your registration completed"));
			regestierObject.userLogout();
			homeObject.openLoginPage();
			loginObject.userLogin(email, password);
			Assert.assertTrue(regestierObject.logoutLink.getText().contains("Log out"));
			regestierObject.userLogout();
		}
	}
}