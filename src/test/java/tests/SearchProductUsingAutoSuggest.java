package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProductUsingAutoSuggest extends TestBase {

	String productName = "Apple MacBook Pro 13-inch";

	@Test
	public void UserCanSearchUsingAutoSuggest() {

		try {
			searchObject.ProductSearchUsingAutoSuggest(searchTxt);
			Assert.assertEquals(productObject.productNameBreadCrumb.getText(), productName);
		} catch (Exception e) {
			System.out.println("Error Occured " + e.getMessage());
		}
	}
}