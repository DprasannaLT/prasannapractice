package hrmPOm;

import org.testng.annotations.Test;

public class OrangeLoginTest extends BasePage{
	@Test
	public void verifyOrangeAddemp() {
		launchBrowser();
		launchApplication();
		OrangeLogin obj=new OrangeLogin(driver);
		obj.OrangeHomepage();
		obj.Pimmodule();
		
	}

	
	
	

}
