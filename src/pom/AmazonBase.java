package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBase {
	public WebDriver driver;
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\OrangeHrm\\Resourse\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	public void LaunchApplication() {
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	public void closebrowser() {
		driver.close();
		
	}
	
	

}
