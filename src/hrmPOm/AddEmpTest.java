package hrmPOm;

import org.testng.annotations.Test;

public class AddEmpTest extends BasePage{
	@Test
	public void VerifyAddEmpTest() {
		launchBrowser();
		launchApplication();
		OrangeLogin obj=new OrangeLogin(driver);
		obj.OrangeHomepage();
		obj.Pimmodule();
		AddEmpPage sub=new AddEmpPage(driver);
		sub.verifyAddemp();
		
		
	}

}
