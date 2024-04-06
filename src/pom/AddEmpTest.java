package pom;

import org.testng.annotations.Test;

public class AddEmpTest extends Base{
	@Test
	public void VerifyAddEmpTest() {
		launchBrowser();
		launchApplication();
		OrangeLogin obj=new OrangeLogin(driver);
		obj.OrangeAddemp();
		obj.Pimmodule();
		AddEmpPage sub=new AddEmpPage(driver);
		sub.verifyAddemp();
		
		
	}

}
