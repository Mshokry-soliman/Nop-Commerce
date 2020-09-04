package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegisterationPage extends PageBase {

	public UserRegisterationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "gender-male")
	WebElement genderRadioBtn;

	@FindBy(id = "FirstName")
	public WebElement fnTxtBox;

	@FindBy(id = "LastName")
	public WebElement lnTxtBox;

	// @FindBy(name = "DateOfBirthDay")
	// WebElement day;

	// @FindBy(name = "DateOfBirthMonth")
	// WebElement month;

	// @FindBy(name = "DateOfBirthYear")
	// WebElement year;

	@FindBy(id = "Email")
	public WebElement emailTxtBox;

	@FindBy(id = "Password")
	WebElement passTxtBox;

	@FindBy(id = "ConfirmPassword")
	WebElement confirmpassTxtBox;

	@FindBy(id = "register-button")
	WebElement registerBtn;

	@FindBy(css = "div.result")
	public WebElement successMessage;

	@FindBy(linkText = "Log out")
	public WebElement logoutLink;

	@FindBy(linkText = "My account")
	WebElement myAccountLink;

	public void userRegistration(String firstname, String lastname, String email, String password) {

		clickButton(genderRadioBtn);
		setElementText(fnTxtBox, firstname);
		setElementText(lnTxtBox, lastname);
		// Select option = new Select(day);
		// option.selectByIndex(10);
		// Select option1 = new Select(month);
		// option1.selectByVisibleText("January");
		// Select option2 = new Select(year);
		// option2.selectByIndex(84);
		setElementText(emailTxtBox, email);
		setElementText(passTxtBox, password);
		setElementText(confirmpassTxtBox, password);
		clickButton(registerBtn);
	}

	public void userLogout() {

		clickButton(logoutLink);
	}

	public void openMyAccountPage() {
		clickButton(myAccountLink);
	}
}