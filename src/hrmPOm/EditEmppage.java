package hrmPOm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  EditEmppage {
	
	@FindBy(id="menu_pim_viewPimModule")
	WebElement pim_link;
	
	@FindBy(id="menu_pim_viewEmployeeList")
	WebElement Emp_link;
	
	@FindBy(id="btnDelete")
	WebElement but_link;
	
	@FindBy(id="firstName")
	WebElement Firstname_Box;
	
	@FindBy(id="lastName")
	WebElement Lastname_Box2;
	
	@FindBy(id="btnSave")
	WebElement Save_Button;
	
	public EditEmppage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void verifyEditEmp() {
		pim_link.click();
		Emp_link.click();
		but_link.click();
		//Firstname_Box.sendKeys("lucky");
		//Lastname_Box2.sendKeys("prasanna");
		//Save_Button.click();
	}
	

}
