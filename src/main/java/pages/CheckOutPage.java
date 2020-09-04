package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage extends PageBase {

	public CheckOutPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "input.button-1.checkout-as-guest-button")
	WebElement guestBtn;

	@FindBy(id = "BillingNewAddress_FirstName")
	WebElement fnTxt;

	@FindBy(id = "BillingNewAddress_LastName")
	WebElement lnTxt;

	@FindBy(id = "BillingNewAddress_Email")
	WebElement emailTxt;

	@FindBy(id = "BillingNewAddress_CountryId")
	WebElement selectcounrtybillingaddress;

	@FindBy(id = "BillingNewAddress_City")
	WebElement cityTxt;

	@FindBy(id = "BillingNewAddress_Address1")
	WebElement address1Txt;

	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	WebElement zipcodeTxt;

	@FindBy(id = "BillingNewAddress_PhoneNumber")
	WebElement phoneTxt;

	@FindBy(css = "input.button-1.new-address-next-step-button")
	WebElement continueToShippingAddress;

	@FindBy(id = "shippingoption_1")
	WebElement nextDayAirRadio;

	@FindBy(css = "input.button-1.shipping-method-next-step-button")
	WebElement continueToPayementMethod;

	@FindBy(id = "paymentmethod_1")
	WebElement creditcardRadio;

	@FindBy(css = "input.button-1.payment-method-next-step-button")
	WebElement continueToPaymentInfo;

	@FindBy(id = "CreditCardType")
	WebElement selectcreditcard;

	@FindBy(id = "CardholderName")
	WebElement cardHolderNameTxt;

	@FindBy(id = "CardNumber")
	WebElement cardNumberTxt;

	@FindBy(id = "ExpireMonth")
	WebElement expirationMonth;

	@FindBy(id = "ExpireYear")
	WebElement expirationYear;

	@FindBy(id = "CardCode")
	WebElement cardCodeTxt;

	@FindBy(css = "input.button-1.payment-info-next-step-button")
	WebElement continueTOConfirmOrder;

	@FindBy(css = "input.button-1.confirm-order-next-step-button")
	WebElement confirmBtn;

	@FindBy(css = "div.title")
	public WebElement ConfirmationMessage;

	@FindBy(linkText = "Click here for order details.")
	public WebElement orderDetails;

	public void BillingAddressPage(String city, String Address1, String ZipPostalCode, String PhoneNumber)
			throws InterruptedException {
		Thread.sleep(2000);
		select = new Select(selectcounrtybillingaddress);
		select.selectByValue("123");
		setElementText(cityTxt, city);
		setElementText(address1Txt, Address1);
		setElementText(zipcodeTxt, ZipPostalCode);
		setElementText(phoneTxt, PhoneNumber);
		clickButton(continueToShippingAddress);
		Thread.sleep(2000);
	}

	public void ShippingMethod() {
		clickButton(nextDayAirRadio);
		clickButton(continueToPayementMethod);
		clickButton(creditcardRadio);
		clickButton(continueToPaymentInfo);
	}

	public void PaymentInfoPage(String CardHolderName, String CardNumber, String CardCode) {
		select = new Select(selectcreditcard);
		select.selectByIndex(3);
		setElementText(cardHolderNameTxt, CardHolderName);
		setElementText(cardNumberTxt, CardNumber);
		select = new Select(expirationMonth);
		select.selectByIndex(5);
		select = new Select(expirationYear);
		select.selectByIndex(2);
		setElementText(cardCodeTxt, CardCode);
		clickButton(continueTOConfirmOrder);
	}

	public void confirmOrder() throws InterruptedException {
		clickButton(confirmBtn);
		Thread.sleep(2000);
	}

	public void OpenOderDetailsPage() {
		clickButton(orderDetails);
	}

	public void CheckoutProduct(String firstName, String lastName, String countryName, String email, String address,
			String postcode, String phone, String city, String productName) throws InterruptedException {
		setElementText(fnTxt, firstName);
		setElementText(lnTxt, lastName);
		setElementText(emailTxt, email);
		select = new Select(selectcounrtybillingaddress);
		select.selectByVisibleText(countryName);
		setElementText(cityTxt, city);
		setElementText(address1Txt, address);
		setElementText(zipcodeTxt, postcode);
		setElementText(phoneTxt, phone);
		clickButton(continueToShippingAddress);
		clickButton(nextDayAirRadio);
		clickButton(continueToPayementMethod);
		Thread.sleep(2000);
		clickButton(continueToPaymentInfo);
		Thread.sleep(2000);
		clickButton(continueTOConfirmOrder);
	}

	public void CheckOutProducttotal(String firstName, String lastName, String email, String address, String postCode,
			String phone, String City, String productName, String CardHolderName, String CardNumber, String CardCode)
			throws InterruptedException {

		scrollToButtom();
		clickButton(guestBtn);
		setElementText(fnTxt, firstName);
		setElementText(lnTxt, lastName);
		setElementText(emailTxt, email);
		select = new Select(selectcounrtybillingaddress);
		select.selectByValue("123");
		setElementText(cityTxt, City);
		setElementText(address1Txt, address);
		setElementText(zipcodeTxt, postCode);
		setElementText(phoneTxt, phone);
		clickButton(continueToShippingAddress);
		Thread.sleep(1000);
		clickButton(nextDayAirRadio);
		clickButton(continueToPayementMethod);
		Thread.sleep(1000);
		clickButton(creditcardRadio);
		Thread.sleep(1000);
		clickButton(continueToPaymentInfo);
		select = new Select(selectcreditcard);
		select.selectByIndex(3);
		setElementText(cardHolderNameTxt, CardHolderName);
		setElementText(cardNumberTxt, CardNumber);
		select = new Select(expirationMonth);
		select.selectByIndex(5);
		select = new Select(expirationYear);
		select.selectByIndex(2);
		setElementText(cardCodeTxt, CardCode);
		clickButton(continueTOConfirmOrder);
		clickButton(confirmBtn);
	}
}
