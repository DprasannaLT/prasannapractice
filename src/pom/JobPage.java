package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class JobPage extends Base {
	
	
	/*@FindBy(id = "txtUsername")
	WebElement textbox_username;
	@FindBy(id = "txtPassword")
	WebElement textbox_Password;
	@FindBy(id = "btnLogin")
	WebElement button_login;*/
    @FindBy(id = "menu_admin_viewAdminModule")		
	WebElement Tittle_admin;
	@FindBy(id = "menu_admin_Job")
	WebElement Tittle_job;
	@FindBy(id = "menu_admin_viewJobTitleList")
	WebElement Tittle_jobList;
	@FindBy(id = "btnAdd")
	
	WebElement button_Add;
	public JobPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	

	/*public void Login(String username, String upassword) {
		
		textbox_username.sendKeys(username);
		textbox_Password.sendKeys(upassword);
		button_login.click();
	}*/
		public void job() {
			
		
		Tittle_admin.click();
		Tittle_job.click();
		Tittle_jobList.click();
		button_Add.click();
	}
	







	




 
}

