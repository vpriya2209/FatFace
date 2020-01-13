package org.cts.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Zalando extends BaseClass {
	public static void main(String[] args) throws Throwable {
		launchBrowser();
		loadUrl("https://www.fatface.com/en");
		sleep(1000);
		screenShot("C:\\Users\\Vishnu Priya\\eclipse-vishnupriya\\ZalandoProject\\ScreenShot\\HomePage.png");
		WebElement search = driver.findElement(By.xpath("//input[@type='search']"));
		fill(search, getData(0, 0));
		Enter();
		screenShot("C:\\Users\\Vishnu Priya\\eclipse-vishnupriya\\ZalandoProject\\ScreenShot\\searchpage.png");
		WebElement product = driver.findElement(By.xpath("//img[@data-src='https://i1.adis.ws/s/Fat_Face/950740_Chocolate_PLP_1?%24prod-tile-lge%24']"));
		btnClick(product);
		WebElement addToBag = driver.findElement(By.xpath("//button[@id='add-to-cart']"));
		btnClick(addToBag);
		sleep(2000);
		WebElement viewbag = driver.findElement(By.xpath("//a[text()='Proceed to checkout']"));
		btnClick(viewbag);
		screenShot("C:\\Users\\Vishnu Priya\\eclipse-vishnupriya\\ZalandoProject\\ScreenShot\\Guestpage.png");
		WebElement guest = driver.findElement(By.xpath("//span[text()='Continue As Guest']"));
		btnClick(guest);
		WebElement login = driver.findElement(By.xpath("//input[@id='dwfrm_login_email']"));
		fill(login, getData(1, 0));
		WebElement checkout = driver.findElement(By.xpath("//span[text()='Checkout as Guest']"));
		btnClick(checkout);
		screenShot("C:\\Users\\Vishnu Priya\\eclipse-vishnupriya\\ZalandoProject\\ScreenShot\\addresspage.png");
		WebElement title = driver.findElement(By.xpath("//option[text()='Miss']"));
		btnClick(title);
		WebElement fName = driver.findElement(By.xpath("//input[@name='dwfrm_singleshipping_shippingAddress_addressFields_firstName']"));
		fill(fName, getData(3, 0));
		WebElement lastName = driver.findElement(By.xpath("//input[@name='dwfrm_singleshipping_shippingAddress_addressFields_lastName']"));
		fill(lastName, getData(4, 0));
		WebElement country = driver.findElement(By.xpath("//option[text()='India']"));
		btnClick(country);
		WebElement postCode = driver.findElement(By.xpath("//input[@name='dwfrm_singleshipping_shippingAddress_addressFields_postCodeAnywhere']"));
		fill(postCode, getData(6, 0));
		
		Enter();
		WebElement address = driver.findElement(By.xpath("//input[@name='dwfrm_singleshipping_shippingAddress_addressFields_address1']"));
		fill(address, getData(7, 0));
		WebElement city = driver.findElement(By.xpath("//input[@name='dwfrm_singleshipping_shippingAddress_addressFields_city']"));
		fill(city, getData(8, 0));
		WebElement phoneNo = driver.findElement(By.xpath("//input[@name='dwfrm_singleshipping_shippingAddress_addressFields_phone']"));
		fill(phoneNo, getData(9, 0));
		WebElement pay = driver.findElement(By.xpath("//span[text()='Proceed to payment']"));
		btnClick(pay);
		screenShot("C:\\Users\\Vishnu Priya\\eclipse-vishnupriya\\ZalandoProject\\ScreenShot\\paymentpage.png");
		WebElement cardName = driver.findElement(By.xpath("//input[@id='adyen_creditCard_owner']"));
		fill(cardName, getData(5, 0));
		WebElement cardNo = driver.findElement(By.xpath("//input[@id='adyen_creditCard_number']"));
		fill(cardNo, getData(2, 0));
		WebElement expMonth = driver.findElement(By.xpath("//select[@id='adyen_creditCard_month']"));
		selectByIndex(expMonth, 2);
		WebElement year = driver.findElement(By.xpath("//select[@name='adyen_creditCard_year']"));
		selectByIndex(year, 3);
		//WebElement ccv = driver.findElement(By.xpath("//input[@name='dwfrm_billing_paymentMethods_creditCard_cvn']"));
		//fill(ccv, getData(10, 0));
		quit();
	}

}

