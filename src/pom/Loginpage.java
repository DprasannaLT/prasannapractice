
package pom;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Loginpage  {
	
	@FindBy(id = "txtUsername")
	WebElement textbox_username;
	@FindBy(id = "txtPassword")
	WebElement textbox_Password;
	@FindBy(id = "btnLogin")
	WebElement button_login;
	
	//@FindBy(id = "footer")
	//WebElement errormsg_login;
	

	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void Login(String username, String upassword) {
		
		textbox_username.sendKeys(username);
		textbox_Password.sendKeys(upassword);
		button_login.click();
	}

	/*public void VerifyFootErrorMsg() {
		
		String Expectedmsg = "OrangeHRM 4.2.0.1\r\n"
				+ "© 2005 - 2023 OrangeHRM, Inc. All rights reserved.";
		String Actualmsg = errormsg_login.getText();

		if (Expectedmsg.equals(Actualmsg)) {
			System.out.println("Verify FootErrorMsg:\nExpected:" + Expectedmsg + "\nActual:" + Actualmsg + "\nTestPass");
		} else {
			System.out
					.println("Verify FootErrorMsg:\nExpected:" + Expectedmsg + "\nActual:" + Actualmsg + "\nTestFail");

		}

	}*/

	

}
