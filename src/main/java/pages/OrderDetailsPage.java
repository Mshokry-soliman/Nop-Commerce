package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderDetailsPage extends PageBase {

	public OrderDetailsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "a.button-2.print-order-button")
	WebElement printInvoiceBtn;

	@FindBy(linkText = "PDF Invoice")
	WebElement pdfInvoiceBtn;

	public void PrintOderDetails() {
		clickButton(printInvoiceBtn);
	}

	public void DownloadPdfInvoice() {
		clickButton(pdfInvoiceBtn);
	}
}
