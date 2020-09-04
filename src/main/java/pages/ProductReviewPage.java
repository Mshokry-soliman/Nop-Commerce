package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductReviewPage extends PageBase {

	public ProductReviewPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "AddProductReview_Title")
	WebElement reviewtitleTxt;

	@FindBy(id = "AddProductReview_ReviewText")
	WebElement reviewTxt;

	@FindBy(id = "addproductrating_3")
	WebElement ratingRadioBtn;

	@FindBy(name = "add-review")
	WebElement submitReviewBtn;

	@FindBy(css = "div.result")
	public WebElement reviewNotification;

	public void AddReview(String reviewTitle, String reviewMessage) {
		setElementText(reviewtitleTxt, reviewTitle);
		setElementText(reviewTxt, reviewMessage);
		clickButton(ratingRadioBtn);
		clickButton(submitReviewBtn);
	}
}
