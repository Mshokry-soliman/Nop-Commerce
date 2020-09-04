package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCartPage extends PageBase {

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "product_enteredQuantity_4")
	public WebElement QuantityTxt;

	@FindBy(name = "updatecart")
	WebElement updatescartBtn;

	@FindBy(id = "itemquantity11218")
	public WebElement QuantityTxt2;

	@FindBy(css = "td.subtotal")
	public WebElement totalLbl;

	@FindBy(id = "checkout_attribute_1")
	WebElement selectGiftWrapping;

	@FindBy(name = "removefromcart")
	WebElement removefromcart;

	@FindBy(css = "div.no-data")
	public WebElement messageafterremoveproduct;

	@FindBy(id = "read-terms")
	WebElement readTerms;

	@FindBy(css = "div.page-body")
	public WebElement conditionOfUserMessage;

	@FindBy(css = "button.ui-button.ui-corner-all.ui-widget.ui-button-icon-only.ui-dialog-titlebar-close")
	WebElement conditionOfUserMessageBtn;

	@FindBy(id = "termsofservice")
	WebElement checkBoxBtn;

	@FindBy(id = "checkout")
	WebElement checkoutBtn;

	@FindBy(id = "termsofservice")
	WebElement agreeCheckbox;

	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/input[1]")
	WebElement guestCheckoutBtn;

	public void UpdateProductQuantityInCart(String Quantity) {
		ClearText(QuantityTxt);
		setElementText(QuantityTxt, Quantity);
		clickButton(updatescartBtn);
	}

	public void RemoveProductFromCart() {
		clickButton(removefromcart);
		clickButton(updatescartBtn);
	}

	public void OpenCheckOutPage() throws InterruptedException {
		select = new Select(selectGiftWrapping);
		select.selectByIndex(1);
		clickButton(readTerms);
		action = new Actions(driver);
		action.moveToElement(readTerms).click(readTerms).perform();
		clickButton(conditionOfUserMessageBtn);
		Thread.sleep(1000);
		clickButton(checkBoxBtn);
		clickButton(checkoutBtn);
	}

	public void openCheckoutPageAsGuest() {
		clickButton(guestCheckoutBtn);
	}
}
