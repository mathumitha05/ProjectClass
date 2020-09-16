package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import Base.BaseClass;

public class Registration extends BaseClass {

	public Registration() {
		PageFactory.initElements(driver, this);
	}

	//@FindBy (xpath = "//input[@name = 'firstname']")
	@FindAll({ @FindBy(name="firstname"), @FindBy(id="name")})
	private WebElement fisrtname;

	@FindAll({ @FindBy(name="lastname"), @FindBy(id="name")})
	private WebElement surname;

	@FindBy(name = "reg_email__")
	private WebElement mobilnum;

	@FindBy(name = "reg_passwd__")
	private WebElement password;

	@FindBy(id="day")
	private WebElement day;

	@FindBy(id="month")
	private WebElement month;

	@FindBy(id="year")
	private WebElement year;

	@FindAll({ @FindBy(xpath="//input[@value='-1']"), @FindBy(name="sex"), @FindBy(id="u_6_6")})
	private WebElement gender;
	
	@FindBy(xpath = "//a[@id=\"u_0_2\"]")
	private WebElement createAccountbtn;
	
	public WebElement getCreateAccountbtn() {
		return createAccountbtn;
	}

	public WebElement getFisrtname() {
		return fisrtname;
	}

	public WebElement getSurname() {
		return surname;
	}

	public WebElement getMobilnum() {
		return mobilnum;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getGender() {
		return gender;
	}

}
