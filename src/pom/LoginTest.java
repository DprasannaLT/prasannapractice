package pom;

import org.testng.annotations.Test;

public class LoginTest extends Base {
	@Test
	public void verifylogin() {
		
		launchBrowser();
		launchApplication();
		Loginpage obj=new Loginpage(driver);
		obj.Login("admin","Prasanna@123");
		
		
	}
	
	

}
