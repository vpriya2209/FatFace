package org.cts.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomeLoginPage extends BaseClass {
	public WelcomeLoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Continue As Guest']")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}

	
}
