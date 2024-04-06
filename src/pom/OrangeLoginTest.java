package pom;

import org.testng.annotations.Test;

public class OrangeLoginTest extends Base{
	@Test
	public void verifyOrangeAddemp() {
		launchBrowser();
		launchApplication();
		OrangeLogin obj=new OrangeLogin(driver);
		obj.OrangeAddemp();
		obj.Pimmodule();
		
	}

	
	
	

}
