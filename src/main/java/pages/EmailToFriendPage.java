package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailToFriendPage extends PageBase {

	public EmailToFriendPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "FriendEmail")
	WebElement emailfriendTxt;

	@FindBy(id = "PersonalMessage")
	WebElement personalmessage;

	@FindBy(css = "input.button-1.send-email-a-friend-button")
	WebElement sendemailBtn;

	@FindBy(css = "div.result")
	public WebElement messageNotification;

	public void EmailAFriend(String FriendEmail, String personalMessage) {
		setElementText(emailfriendTxt, FriendEmail);
		setElementText(personalmessage, personalMessage);
		clickButton(sendemailBtn);
	}

}
