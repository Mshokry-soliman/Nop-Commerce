package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Register")
	WebElement registerLink;

	@FindBy(css = "a.ico-login")
	WebElement loginLink;

	@FindBy(linkText = "Contact us")
	WebElement contactUs;

	@FindBy(id = "customerCurrency")
	WebElement changecurrency;

	@FindBy(linkText = "Computers")
	WebElement computersMenu;

	@FindBy(linkText = "Notebooks")
	WebElement notebooks;
	
	@FindBy(css = "div.page-title")
	public WebElement pagetitle; 

	public void openRegestirationPage() {

		clickButton(registerLink);
	}

	public void openLoginPage() {
		clickButton(loginLink);
	}

	public void OpenContactUsPage() {
		scrollToButtom();
		clickButton(contactUs);
	}

	public void ChangeCurrency() {
		select = new Select(changecurrency);
		select.selectByIndex(1);
	}

	public void OpenNoteBooks() {
		action = new Actions(driver);
		action.moveToElement(computersMenu).perform();
		action.moveToElement(notebooks).click().perform();

	}
}
