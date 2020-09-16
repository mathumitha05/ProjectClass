package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class SearchHotel extends BaseClass {
	
	public SearchHotel() {
		
		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(name = "location")
	private WebElement location;
	
	@FindBy(name = "hotels")
	private WebElement hotels;
	
	@FindBy(id = "room_type")
	private WebElement roomType;
	
	@FindBy(id = "room_nos")
	private WebElement room_nos;
	
	@FindBy (id = "adult_room")
	private WebElement adult_room;
	
	@FindBy (id = "Submit")
	private WebElement Submit;
	
	@FindBy(id = "radiobutton_0")
	private WebElement radiobutton_1;
	
	@FindBy(xpath = "//input[@class ='reg_button']")
	private WebElement continuebtn;
	
	@FindBy(name = "first_name")
	private WebElement firstname;
	
	@FindBy(name = "last_name")
	private WebElement lastname;
	
	@FindBy(id = "address")
	private WebElement address;
	
	@FindBy(id = "cc_num")
	private WebElement card_num;
	
	@FindBy(id = "cc_type")
	private WebElement card_type;
	
	@FindBy(id = "cc_exp_month")
	private WebElement exp_month;
	
	@FindBy(id = "cc_exp_year")
	private WebElement exp_year;
	
	@FindBy(id = "cc_cvv")
	private WebElement cc_cvv;
	
	@FindBy(name="book_now")
	private WebElement book_now;
	
	@FindBy (name= "order_no")
	private WebElement order_no;
	
	
	@FindBy(name = "logout")
	private WebElement logout;


	public WebElement getLocation() {
		return location;
	}


	public WebElement getHotels() {
		return hotels;
	}


	public WebElement getRoomType() {
		return roomType;
	}


	public WebElement getRoom_nos() {
		return room_nos;
	}


	public WebElement getAdult_room() {
		return adult_room;
	}


	public WebElement getSubmit() {
		return Submit;
	}


	public WebElement getRadiobutton_1() {
		return radiobutton_1;
	}


	public WebElement getContinuebtn() {
		return continuebtn;
	}


	public WebElement getFirstname() {
		return firstname;
	}


	public WebElement getLastname() {
		return lastname;
	}


	public WebElement getAddress() {
		return address;
	}


	public WebElement getCard_num() {
		return card_num;
	}


	public WebElement getCard_type() {
		return card_type;
	}


	public WebElement getExp_month() {
		return exp_month;
	}


	public WebElement getExp_year() {
		return exp_year;
	}


	public WebElement getCc_cvv() {
		return cc_cvv;
	}


	public WebElement getBook_now() {
		return book_now;
	}


	public WebElement getOrder_no() {
		return order_no;
	}


	public WebElement getLogout() {
		return logout;
	}
	
	
	
	

}
