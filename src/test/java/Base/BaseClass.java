package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass

{
	public static WebDriver driver;

	public static void getdriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium6768\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void loadUrl(String url) {
		driver.manage().window().maximize();
		driver.get(url);
	}

	public static WebElement type(WebElement element, String value) {
		element.sendKeys(value);
		return element;
	}

	public static void btnclick(WebElement element) {
		element.click();
	}

	public static void quitbroswer() {
		driver.quit();
	}

	public static void closebroswer() {
		driver.close();
	}

	public static String getText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public static String getAttribute(WebElement element, String value) {
		String text = element.getAttribute(value);
		return text;
	}

	public static void moveToElement(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	public static void DragAndDrop(WebElement source, WebElement destination) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source, destination);
	}

	public static void DoubleClick() {
		Actions a = new Actions(driver);
		a.doubleClick();
	}

	public static void ContextClick() {
		Actions a = new Actions(driver);
		a.contextClick();
	}

	public static void ContextClick(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element);
	}

	public static WebDriver iframesId(int id) {
		return driver.switchTo().frame(id);
	}

	public static WebDriver iframesName(String name) {
		return driver.switchTo().frame(name);
	}

	public static WebDriver iframesWebElement(WebElement element) {
		return driver.switchTo().frame(element);
	}

	public static void accept() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	public static void dismiss() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}

	public static void getScreenshotAs() throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("D:\\Selenium6768\\Screenshot\\fb.png");
		FileUtils.copyFile(src, des);
	}

	public static String getWindowHandle() {
		String parentWindow = driver.getWindowHandle();
		return parentWindow;
	}

	public static void getWindowHandles(String parentWindow)

	{
		getWindowHandle();
		Set<String> allWindowsId = driver.getWindowHandles();
		for (String string : allWindowsId) {
			if (!parentWindow.equals(string)) {
				driver.switchTo().window(string);

			}
		}

	}
	public static void jseExecuteScript(String script, WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(script, element);
	}

	public static boolean isEnabled(WebElement element)
	{
		boolean enable = element.isEnabled();
		return enable;
	}
	public static boolean isSelected(WebElement element)
	{
		boolean select = element.isSelected();
		return select;
	}
	public static boolean isDisplayed(WebElement element)
	{
		boolean display = element.isDisplayed();
		return display;
	}
	public static void SelectByIndex(WebElement element, Integer i)
	{
		Select s = new Select(element);
		s.selectByIndex(i);
	}
	public static void SelectByValue(WebElement element, String value)
	{
		Select s = new Select(element);
		s.selectByValue(value);
	}
	public static void SelectByVisibleText(WebElement element, String text)
	{
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public static String getData(int rowno, int cellno) throws IOException {
		File file = new File("D:\\Selenium6768\\Excelsheet\\excel.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(fis);
		String name = "";
		Sheet s = w.getSheet("Data");
		Row r = s.getRow(rowno);
		Cell c = r.getCell(cellno);
		int type = c.getCellType();
		if (type == 1) {
			name = c.getStringCellValue();
		} else if (type == 0) 
		{       if (DateUtil.isCellDateFormatted(c)) {
			Date date = c.getDateCellValue();
			SimpleDateFormat sf = new SimpleDateFormat("dd-MMM-yyyy");
			name = sf.format(date);
		} else {
			double d = c.getNumericCellValue();
			Long l = (long) d;
			name = String.valueOf(l);
		}
		}
		return name;
	}
}