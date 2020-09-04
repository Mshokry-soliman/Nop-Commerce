package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {

	protected WebDriver driver;
	public JavascriptExecutor jse;
	public Select select;
	public Actions action;

	public PageBase(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void ClearText(WebElement element) {

		element.clear();
	}

	protected static void clickButton(WebElement button) {

		button.click();
	}

	protected static void setElementText(WebElement textElement, String value) {

		textElement.sendKeys(value);
	}

	public void scrollToButtom() {

		jse = (JavascriptExecutor) driver;
		jse.executeScript("scrollBy(0,2500)");
	}
}
