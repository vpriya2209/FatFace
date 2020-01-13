package org.cts.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	static WebDriver driver;

	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vishnu Priya\\eclipse-vishnupriya\\ZalandoProject\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void quit() {
		driver.quit();
	}
	public static void Enter() throws AWTException {
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
	}
	public static void screenShot(String path) throws IOException {
		TakesScreenshot tk =(TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileUtils.copyFile(src, dest);
		

	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static void btnClick(WebElement btn) {
		btn.click();
	}

	public static void fill(WebElement e, String name) {
		e.sendKeys(name);

	}

	public static void selectByIndex(WebElement e, int no) {
		Select s = new Select(e);
		s.selectByIndex(no);
	}

	public static String getData(int rowNo, int cellNo) throws Throwable {

		File loc = new File("C:\\Users\\Vishnu Priya\\eclipse-vishnupriya\\ZalandoProject\\excel\\Excel sheet.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("data");
		Row r = s.getRow(rowNo);
		Cell c = r.getCell(cellNo);
		int type = c.getCellType();
		String name = "";
		if (type == 1) {
			name = c.getStringCellValue();
			System.out.println();

		} else if (type == 0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date date = c.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("dd-MMM-YYYY");
				name = sim.format(date);

			} else {
				double d = c.getNumericCellValue();
				long l = (long) d;
				name = String.valueOf(l);
			}

		}
		return name;

	}

	public static void sleep(int sec) throws Throwable {
		Thread.sleep(sec);
	}
}
