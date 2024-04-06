package seleniumexamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AmazonLoginpage {
	public WebDriver driver;
	public AmazonLoginpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@Test
	public void LaunchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\OrangeHrm\\Resourse\\chromedriver.exe");
	}
	@Test
	public void LaunchApplication() {
		
	}
	
	

}
