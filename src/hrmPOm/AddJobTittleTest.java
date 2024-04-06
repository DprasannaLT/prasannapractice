package hrmPOm;

import org.testng.annotations.Test;

public class AddJobTittleTest extends BasePage{

	@Test
	public void verifyjobtest() {
		launchBrowser();
		launchApplication();
		
		OrangeLogin sos=new OrangeLogin(driver);
		sos.OrangeHomepage();
		//sos.Pimmodule();
		
		AddJobTittlePage obj=new AddJobTittlePage (driver);
		obj.verifyjob();
		obj.verifyDelete();
	}
}
