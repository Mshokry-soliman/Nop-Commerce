package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeCurrencyTest extends TestBase {

	String searchTxt = "MacB";
	String productName = "Apple MacBook Pro 13-inch";

	@Test(priority = 1)
	public void UserCanChangeCurrency() {
		homeObject.ChangeCurrency();
	}

	@Test(priority = 2)
	public void UserCanSearchUsingAutoSuggest() {

		try {
			searchObject.ProductSearchUsingAutoSuggest(searchTxt);
			Assert.assertEquals(productObject.productNameBreadCrumb.getText(), productName);
			Assert.assertTrue(productObject.productPricelbl.getText().contains("€"));
			System.out.println(productObject.productPricelbl.getText());
		} catch (Exception e) {
			System.out.println("Error Occured " + e.getMessage());
		}
	}
}
