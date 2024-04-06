package hrmPOm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeLogin{
	@FindBy(id="txtUsername")
	WebElement TextBox_Msg;
	
	@FindBy(id="txtPassword")
	WebElement TextBox_Msg2;
	
	@FindBy(id="btnLogin")
	WebElement Button_Box;
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement Admin_link;
	
	@FindBy(id="menu_pim_viewPimModule")
	WebElement pim_link;
	


public OrangeLogin(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}

public void  OrangeHomepage(){
	TextBox_Msg.sendKeys("admin");
	TextBox_Msg2.sendKeys("Prasanna@123");
	Button_Box.click();
}
	public void Pimmodule() {
		Admin_link.click();
		//pim_link.click();
		
		
	
}
}
