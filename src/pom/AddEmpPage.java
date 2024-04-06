package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmpPage {
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
		Firstname_Box.sendKeys("lucky");
		Lastname_Box2.sendKeys("vaishu");
		Save_Button.click();
		
	}
	 
		
	}
	

