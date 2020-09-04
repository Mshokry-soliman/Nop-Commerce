package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProductTest extends TestBase {

	String productName = "Apple MacBook Pro 13-inch";

	@Test
	public void UserCanSearchForProduct() {

		searchObject.OpenProductDetailsPage();
		// Assert.assertTrue(detailsObject.productNameBreadCrumb.getText().equalsIgnoreCase(productName));
		Assert.assertEquals(productObject.productNameBreadCrumb.getText(), productName);
	}
}
