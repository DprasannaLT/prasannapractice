package pom;

import org.testng.annotations.Test;

public class JobPageTest extends Base {
	@Test
	public void verifyAdmin() {
		launchBrowser();
		launchApplication();
		

		Loginpage page$ = new Loginpage(driver);
		

		page$.Login("admin", "Prasanna@123");
		JobPage page3=new JobPage(driver);
		page3.job();

	}

}
