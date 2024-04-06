package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Base {
	public WebDriver driver;

	
	public void launchBrowser() {
		//String path = System.getProperty("user.dir");
		String browserName = "chrome";
		if (browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\OrangeHrm\\Resourse\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\Softwares\\OrangeHrm\\Resourse\\msedgedriver.exe");
			driver = new EdgeDriver();
		}

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	
	public void launchApplication() {
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
	}
	
	
}
