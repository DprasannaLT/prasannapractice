package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Qualificationspage {
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement Title_Link;
	@FindBy(id="menu_admin_Qualifications")
	WebElement Qualification_Link2;
	@FindBy(id="menu_admin_viewLanguages")
	WebElement Languages_Link;
	@FindBy(id="btnAdd")
	WebElement Button_Box;
	@FindBy(id="language_name")
	WebElement Text_Box;
	@FindBy(id="btnSave")
	WebElement Save_Button;
	@FindBy(id="menu_admin_Qualifications")
	WebElement Languages_Link1;
	@FindBy(id="menu_admin_viewEducation")
	WebElement Education_Link;
	@FindBy(id="btnAdd")
	WebElement EducationAdd_button;
	@FindBy(id="education_name")
	WebElement EducationLevel_TextBox;
	@FindBy(id="btnSave")
	WebElement EducationSave_Button;
	
	public Qualificationspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void verifyQualifications() {
		Title_Link.click();
		Qualification_Link2.click();
		Languages_Link.click();
		 Button_Box.click();
		 Text_Box.sendKeys("English");
		 Save_Button.click();
		 Languages_Link1.click();
		 Education_Link.click();
		 EducationAdd_button.click();
		 EducationLevel_TextBox.sendKeys("Medium");
		 EducationSave_Button.click();
	}

}
