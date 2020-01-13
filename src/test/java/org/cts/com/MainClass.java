package org.cts.com;

public class MainClass extends BaseClass {
	static LoginPage page;
	static SearchProductPage searchPage;
	static WelcomeLoginPage login;
	static EmailIdClass email;
	static AddressPage addressPage;
	static PaymentPage pay;

	public static void main(String[] args) throws Throwable {
		launchBrowser();
		loadUrl("https://www.fatface.com/en");
		screenShot("C:\\Users\\Vishnu Priya\\eclipse-vishnupriya\\ZalandoProject\\ScreenShot\\Loginpage.png");
		page = new LoginPage();
		fill(page.getSearch(), getData(0, 0));
		screenShot("C:\\Users\\Vishnu Priya\\eclipse-vishnupriya\\ZalandoProject\\ScreenShot\\HomePage.png");
		Enter();
		searchPage = new SearchProductPage();
		btnClick(searchPage.getProduct());
		btnClick(searchPage.getAddToCart());
		sleep(2000);
		btnClick(searchPage.getViewBag());
		screenShot("C:\\Users\\Vishnu Priya\\eclipse-vishnupriya\\ZalandoProject\\ScreenShot\\searchpage.png");
		login = new WelcomeLoginPage();
		btnClick(login.getLogin());
		email = new EmailIdClass();
		fill(email.getEnterEmail(), getData(1, 0));
		screenShot("C:\\Users\\Vishnu Priya\\eclipse-vishnupriya\\ZalandoProject\\ScreenShot\\Guestpage.png");
		btnClick(email.getClickEmail());
		addressPage = new AddressPage();
		btnClick(addressPage.getTitle());
		fill(addressPage.getFname(), getData(3, 0));
		fill(addressPage.getLname(), getData(4, 0));
		btnClick(addressPage.getCountry());
		fill(addressPage.getPostCode(), getData(6, 0));
		Enter();
		fill(addressPage.getAddressLineOne(), getData(7, 0));
		fill(addressPage.getCity(), getData(8, 0));
		fill(addressPage.getPhNo(), getData(9, 0));
		btnClick(addressPage.getProceed());
		screenShot("C:\\Users\\Vishnu Priya\\eclipse-vishnupriya\\ZalandoProject\\ScreenShot\\addresspage.png");
		pay = new PaymentPage();
		fill(pay.getCardName(), getData(5, 0));
		fill(pay.getCardNo(), getData(2, 0));
		selectByIndex(pay.getCardMonth(), 3);
		selectByIndex(pay.getCardYear(), 3);
		screenShot("C:\\Users\\Vishnu Priya\\eclipse-vishnupriya\\ZalandoProject\\ScreenShot\\paymentpage.png");
		quit();
	}

}
