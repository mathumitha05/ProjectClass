package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Reg1 {

	@FindBy(xpath = "//a[@id=\"u_0_2\"]")
	private WebElement createAccountbtn;
	
	@FindBy (id = "u_k_b")
	private WebElement fisrtname;

}
