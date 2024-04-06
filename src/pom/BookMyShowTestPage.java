package pom;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;



public class BookMyShowTestPage extends BookMyShowBase{
	@Test
	public void verifyBase() {
		LaunchBrowser();
		launchApplication();
		
	}

}
