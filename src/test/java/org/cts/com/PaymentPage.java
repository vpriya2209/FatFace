package org.cts.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends BaseClass {
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//input[@id='adyen_creditCard_owner']")
	private WebElement cardName;
	@FindBy (xpath = "//input[@id='adyen_creditCard_number']")
	private WebElement cardNo;
	@FindBy (xpath= "//select[@id='adyen_creditCard_month']")
	private WebElement cardMonth;
	@FindBy (xpath = "//select[@name='adyen_creditCard_year']")
	private WebElement cardYear;
	public WebElement getCardName() {
		return cardName;
	}
	public WebElement getCardNo() {
		return cardNo;
	}
	public WebElement getCardMonth() {
		return cardMonth;
	}
	public WebElement getCardYear() {
		return cardYear;
	}
	
	

}
