import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.test.LoginPage;

import Base.BaseClass;


public class Sample extends BaseClass {

	LoginPage l = new LoginPage();
	private String url;

	// each and every method 1st we have to declare one method
	// Order of annotation --> Before Class ,Before,Test,After,After Class
	//Junit will execute Ascending order /Alphabatical order
	//Assert1  is failed it will not allow to exectue other asserts
	//Assert -Verification/Validation
	//AssertEquals -Expected vs Actual
	//asserttrue -checking condition true or false
	//Public and Static -->methods only execute
	//HardSoft
	@BeforeClass

	public static void beforeClass() {

		getdriver();
		
	//	loadUrl("http://adactinhotelapp.com/HotelAppBuild2/");
		System.out.println("Before Class");
	}

	@AfterClass

	public static void afterClass() {
		System.out.println("After Class");
		quitbroswer();
	}

	@Before

	public void before() {

		Date d = new Date();
		System.out.println("starting time before" + d);

	}

	@After

	public void after() {
		Date d = new Date();
		System.out.println("Ending Time After" + d);
		System.out.println("");

	}

	@Test//Valid Username and Valid Password

	public void test1() throws IOException {
		
		loadUrl("http://adactinhotelapp.com/HotelAppBuild2/");
		
		Assert.assertTrue("Verify login URL ",driver.getCurrentUrl().contains("hotel"));
		
		WebElement name = type(l.getTxtusername(), getData(1, 0));
		Assert.assertEquals("Verify login Username ","Mathumitha", name.getAttribute("value"));
		
		WebElement pwd = 	type(l.getTxtpassword(), "Naini@123");
		Assert.assertEquals("Verify login Username ","Naini@123", pwd.getAttribute("value"));
		
		
		btnclick(l.getBtnLogin());
		System.out.println("Test1");

	}
	
	@Test//InValid Username and InValid Password

	public void test2() throws IOException {
		loadUrl("http://adactinhotelapp.com/HotelAppBuild2/");
		
		WebElement name = type(l.getTxtusername(), getData(2, 0));
		WebElement pwd = type(l.getTxtpassword(), getData(2, 1));
		
		Assert.assertEquals("Verify login Ped","Mathu@123",pwd.getAttribute("value"));
		
		Assert.assertEquals("Verify login Username ","Naini@123", pwd.getAttribute("value"));
		btnclick(l.getBtnLogin());
		System.out.println("test2");

	}
	
	@Test //button
	public void test3()  {
		loadUrl("https://www.facebook.com/");
		btnclick(l.getBtnLogin());
		System.out.println("test3");

	}


}
