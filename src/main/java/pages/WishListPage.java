package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends PageBase {

	public WishListPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "a.product-name")
	public WebElement productcell;

	@FindBy(css = "h1")
	WebElement wishlistheader;

	@FindBy(name = "removefromcart")
	WebElement removefromcart;

	@FindBy(name = "updatecart")
	WebElement updatewishlistBtn;

	@FindBy(className = "div.no-data")
	public WebElement emptycart;

	public void RemoveProductFromCart() {
		clickButton(removefromcart);
		clickButton(updatewishlistBtn);
	}
}
