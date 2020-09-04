package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageBase {

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "strong.current-item")
	public WebElement productNameBreadCrumb;

	@FindBy(css = "div.email-a-friend")
	WebElement emailBtn;

	@FindBy(id = "price-value-4")
	public WebElement productPricelbl;

	@FindBy(linkText = "Add your review")
	WebElement reviewBtn;

	@FindBy(id = "add-to-wishlist-button-4")
	WebElement addtowhishlistBtn;

	@FindBy(linkText = "wishlist")
	public WebElement openWishlistPage;

	@FindBy(css = "div.compare-products")
	WebElement addToCompareBtn;

	@FindBy(linkText = "product comparison")
	WebElement openComparePage;

	@FindBy(id = "add-to-cart-button-4")
	WebElement addToCartBtn;

	@FindBy(id = "product_enteredQuantity_4")
	WebElement productQuantity;

	@FindBy(xpath = "//*[@id=\"bar-notification\"]/div/p/a")
	WebElement openShoppingCart;

	public void OpenEmailPage() {
		clickButton(emailBtn);
	}

	public void OpenReviewPage() {
		clickButton(reviewBtn);
	}

	public void AddProductToWishList() {
		clickButton(addtowhishlistBtn);
	}

	public void OpenAddToComparePage() {
		clickButton(addToCompareBtn);
	}

	public void OpenAddAnotherProduct() {
		clickButton(addToCompareBtn);
		clickButton(openComparePage);
	}

	public void AddToCart() {
		clickButton(addToCartBtn);
		// productQuantity.sendKeys(String.valueOf());
		clickButton(openShoppingCart);
	}
}
