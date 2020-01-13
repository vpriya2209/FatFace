package org.cts.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProductPage extends BaseClass {
	public SearchProductPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@data-src='https://i1.adis.ws/s/Fat_Face/950740_Chocolate_PLP_1?%24prod-tile-lge%24']")
	private WebElement product;
	@FindBy (xpath = "//button[@id='add-to-cart']")
	private WebElement addToCart;
	@FindBy (xpath ="//a[text()='Proceed to checkout']")
	private WebElement viewBag;
	public WebElement getProduct() {
		return product;
	}
	public WebElement getAddToCart() {
		return addToCart;
	}
	public WebElement getViewBag() {
		return viewBag;
	}
	
	
}
