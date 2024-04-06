package hrmPOm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmpPage {
	
	@FindBy(id="menu_pim_addEmployee")
	WebElement AddEmp_link;
	
	@FindBy(id="firstName")
	WebElement Firstname_Box;
	
	@FindBy(id="lastName")
	WebElement Lastname_Box2;
	
	@FindBy(id="btnSave")
	WebElement Save_Button;
	
	public  AddEmpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void verifyAddemp() {
		AddEmp_link.click();
		Firstname_Box.sendKeys("lucky");
		Lastname_Box2.sendKeys("vaishu");
		Save_Button.click();
		
	}
	 
		
	}
	

