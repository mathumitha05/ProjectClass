import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.test.LoginPage;
import org.test.Registration;
import org.test.SearchHotel;

import Base.BaseClass;

public class main extends BaseClass {
	
	public static void main(String[] args) throws IOException, InterruptedException {

		getdriver();
		loadUrl("http://adactinhotelapp.com/HotelAppBuild2/");
		
		LoginPage l = new LoginPage();
		type(l.getTxtusername(), getData(1, 0));
		type(l.getTxtpassword(), "Naini@123");
		btnclick(l.getBtnLogin());
		
		//Search Hotel
		
		SearchHotel s = new SearchHotel();
		SelectByVisibleText(s.getLocation(), "Melbourne");
		SelectByValue(s.getHotels(), "Hotel Creek");
		SelectByVisibleText(s.getRoomType(), "Standard");
		SelectByValue(s.getRoom_nos(), "2");
		SelectByValue(s.getAdult_room(), "2");
		btnclick(s.getSubmit());
		
	    boolean b	=isDisplayed(s.getRadiobutton_1());
	    System.out.println(b);
		btnclick(s.getRadiobutton_1());
		btnclick(s.getContinuebtn());
		
		//Book a Hotel
		
		type(s.getFirstname(), "Mathumitha");
		type(s.getLastname(), "AshokKumar");
		type(s.getAddress(),"24 cross street vadapalani");
		type(s.getCard_num(),"1234123412341234");
		SelectByVisibleText(s.getCard_type(), "American Express");
		SelectByValue(s.getExp_month(), "2");
		SelectByValue(s.getExp_year(), "2022");
		type(s.getCc_cvv(), "231");
		btnclick(s.getBook_now());
		
		Thread.sleep(5000);
		
		String orderno = getAttribute(s.getOrder_no(), "value");
		System.out.println(orderno);
		
				
		
		
		
		//driver.navigate().back();
		 

		// Calling Registration Page

		/*Registration r = new Registration();
		btnclick(r.getCreateAccountbtn());
		Thread.sleep(2000);
		type(r.getFisrtname(), getData(2, 0));
		type(r.getSurname(), getData(2, 1));
		type(r.getMobilnum(), getData(2, 2));
		type(r.getPassword(), getData(2, 3));
		SelectByIndex(r.getDay(), 13);
		SelectByValue(r.getMonth(), "2");
		SelectByVisibleText(r.getYear(), "2020");
		boolean b = isDisplayed(r.getGender());
		System.out.println(b);
		btnclick(r.getGender());
		boolean b1 = isSelected(r.getGender());
		System.out.println(b1);*/
	}

}
