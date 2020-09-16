package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class LoginPage extends BaseClass {
	
	 public LoginPage() {
		
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "username")
	private WebElement txtusername;
	
	@FindBy(id = "password")
	private WebElement txtpassword;
	
	@FindBy(name = "login")
	private WebElement btnLogin;
	
	public WebElement getTxtusername() {
		return txtusername;
	}
	public WebElement getTxtpassword() {
		return txtpassword;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	
	
	

}
