package org.cts.com;

public class PomInt extends BaseClass {
	static LoginPage page;
	static SearchProductPage searchPage;
	public static void main(String[] args) throws Throwable {

		launchBrowser();
		loadUrl("https://www.fatface.com/en");
		sleep(1000);
		screenShot("C:\\Users\\Vishnu Priya\\eclipse-vishnupriya\\ZalandoProject\\ScreenShot\\HomePage.png");
		page = new LoginPage();
		fill(page.getSearch(), getData(0, 0));
		Enter();
		screenShot("C:\\Users\\Vishnu Priya\\eclipse-vishnupriya\\ZalandoProject\\ScreenShot\\searchpage.png");
		searchPage = new SearchProductPage();
		
	}
}
