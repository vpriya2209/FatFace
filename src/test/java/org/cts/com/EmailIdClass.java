package org.cts.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailIdClass extends BaseClass {
	public EmailIdClass() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='dwfrm_login_email']")
	private WebElement enterEmail;

	@FindBy (xpath = "//span[text()='Checkout as Guest']")
	private WebElement clickEmail;
	public WebElement getClickEmail() {
		return clickEmail;
	}
	public WebElement getEnterEmail() {
		return enterEmail;
	}

}
