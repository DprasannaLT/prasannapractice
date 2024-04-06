package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShowBase {
	public WebDriver driver;
	public  void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\OrangeHrm\\Resourse\\chromedriver.exe");
		driver=new ChromeDriver();
		}
	public void launchApplication() {
		driver.get("https:/in.bookmyshow.com");
	}

}
