package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class QualificationTestpage extends Base {
	@Test
	public void VerifyQualification() {
		launchBrowser();
		launchApplication() ;
		
		OrangeLogin obj=new OrangeLogin(driver);
		obj.OrangeAddemp();
		Qualificationspage sub=new Qualificationspage(driver);
		sub.verifyQualifications();
		
	}

}
