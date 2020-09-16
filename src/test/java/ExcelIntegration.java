import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelIntegration extends ExcelIntegration1 {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium6768\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        WebElement  button = driver.findElement(By.xpath("//a[@id=\"u_0_2\"]"));
		button.click();
        Thread.sleep(2000);
		//To get firstname from excel
		WebElement firstname = driver.findElement(By.name("firstname"));
		//	String name =getData(0, 1);
		firstname.sendKeys(getData(1,0));
		//To get Lastname from excel
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys(getData(1,1));
        //To get Mobile_No from excel
		WebElement mobile = driver.findElement(By.name("reg_email__"));
		mobile.sendKeys(getData(1,2));
		//To get new password
		WebElement newPwd = driver.findElement(By.name("reg_passwd__"));
		newPwd.sendKeys(getData(1,3));

		Thread.sleep(5000);

		driver.quit();





	}

}
