package org.cts.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage extends BaseClass {
	public AddressPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//option[text()='Miss']")
	private WebElement title;
	@FindBy(xpath = "//input[@name='dwfrm_singleshipping_shippingAddress_addressFields_firstName']")
	private WebElement fname;
	@FindBy(xpath = "//input[@name='dwfrm_singleshipping_shippingAddress_addressFields_lastName']")
	private WebElement lname;
	@FindBy(xpath = "//option[text()='India']")
	private WebElement country;
	@FindBy(xpath = "//input[@name='dwfrm_singleshipping_shippingAddress_addressFields_postCodeAnywhere']")
	private WebElement postCode;
	@FindBy(xpath = "//input[@name='dwfrm_singleshipping_shippingAddress_addressFields_address1']")
	private WebElement addressLineOne;
	@FindBy(xpath = "//input[@name='dwfrm_singleshipping_shippingAddress_addressFields_city']")
	private WebElement city;
	@FindBy(xpath = "//input[@name='dwfrm_singleshipping_shippingAddress_addressFields_phone']")
	private WebElement phNo;
	@FindBy(xpath = "//span[text()='Proceed to payment']")
	private WebElement proceed;

	public WebElement getTitle() {
		return title;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getPostCode() {
		return postCode;
	}

	public WebElement getAddressLineOne() {
		return addressLineOne;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getPhNo() {
		return phNo;
	}

	public WebElement getProceed() {
		return proceed;
	}

}
