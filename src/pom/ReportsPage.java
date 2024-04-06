package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportsPage {
	@FindBy(id="menu_pim_viewPimModule")
	WebElement Link_Click;
	@FindBy(id="menu_core_viewDefinedPredefinedReports")
	WebElement Link_Click2;
	@FindBy(id="btnAdd")
	WebElement Button_Click;
	@FindBy(id="report_report_name")
	WebElement TextBox_Msg;
	
	//@FindBy(id="btnSave")
	//WebElement Button_Save;
	
	public ReportsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void Report() {
		Link_Click.click();
		Link_Click2.click();
		Button_Click.click();
		TextBox_Msg.sendKeys("Prasanna");
		//Button_Save.click();
	}
}