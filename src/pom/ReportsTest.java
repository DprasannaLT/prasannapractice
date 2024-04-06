package pom;

import org.testng.annotations.Test;

public class ReportsTest extends Base {
	@Test
	public void VerifyReport() {
		launchBrowser();
		launchApplication();
		Loginpage obj1=new Loginpage(driver);
		obj1.Login("admin","Prasanna@123");
		ReportsPage obj=new ReportsPage(driver);
		obj.Report();
		
	}

	
	}


