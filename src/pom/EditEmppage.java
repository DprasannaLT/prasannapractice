package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  EditEmppage {
	
	WebDriver driver;

	@FindBy(id="menu_pim_viewEmployeeList")
	WebElement Emp_link;
	
	@FindBy(xpath="//*[text()='0168']")
	WebElement list_link;
	
	
	public EditEmppage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void verifyEditEmp() {
		
		Emp_link.click();
		
		Actions action=new Actions(driver);
		action.moveToElement(list_link).build().perform();
		list_link.click();
	}
	

}
