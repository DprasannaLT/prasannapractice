package hrmPOm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddJobTittlePage {

	@FindBy(linkText="Job")
	WebElement Job_link;
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement Jobtitle_link;
	
	@FindBy(id="btnAdd")
	WebElement add_btn;
	
	@FindBy(id="menu_admin_Job")
	WebElement text_box;
	
	@FindBy(id="btnSave")
	WebElement save_btn;
	
	@FindBy(xpath=" ")
	WebElement list_link;
	
	@FindBy(id="btnDelete")
	WebElement Delete_btn;
	
	@FindBy(id="dialogDeleteBtn")
	WebElement Ok_link;
	
	
	
	public AddJobTittlePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void verifyjob() {
		//Job_link.click();
		Jobtitle_link.click();
		//add_btn.click();
		text_box.sendKeys("QC Engineer");
		save_btn.click();
	}
		
		public void verifyDelete() {
			//list_link.click();
			Delete_btn.click();
			Ok_link.click();
			
		}
	
}
