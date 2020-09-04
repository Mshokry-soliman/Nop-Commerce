package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase {

	public SearchPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "small-searchterms")
	WebElement searchTxtBox;

	@FindBy(css = "input.button-1.search-box-button")
	WebElement searchBtn;

	@FindBy(id = "ui-id-1")
	List<WebElement> productList;

	@FindBy(linkText = "Apple MacBook Pro 13-inch")
	WebElement productTitle;

	public void ProductSearch(String productName) {

		setElementText(searchTxtBox, productName);
		clickButton(searchBtn);
	}

	public void OpenProductDetailsPage() {
		clickButton(productTitle);
	}

	public void ProductSearchUsingAutoSuggest(String searchTxt) {

		setElementText(searchTxtBox, searchTxt);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		productList.get(0).click();
	}
}
