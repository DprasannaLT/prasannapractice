package pom;

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
	@FindBy(id="menu_pim_viewPimModule")
	WebElement Title_Click;
	@FindBy(id="menu_pim_addEmployee")
	WebElement AddempTitle_Click2;


public OrangeLogin(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}
public void  OrangeAddemp(){
	TextBox_Msg.sendKeys("admin");
	TextBox_Msg2.sendKeys("Prasanna@123");
	Button_Box.click();
}
	public void Pimmodule() {
		Title_Click.click();
		AddempTitle_Click2.click();
		
	
}
}
