package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExTextmethod {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\OrangeHrm\\Resourse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Prasanna@123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		driver.findElement(By.id("firstName")).sendKeys("prasanna");
		driver.findElement(By.id("lastName")).sendKeys("Dodu");
		driver.findElement(By.id("chkLogin")).click();
		driver.findElement(By.id("user_name")).sendKeys("Laxmi");
		driver.findElement(By.id("user_password")).sendKeys("Laxmi@123");
		driver.findElement(By.id("re_password")).sendKeys("Laxmi@123");
		Select dropdown=new Select(driver.findElement(By.id("status")));
		dropdown.selectByValue("Enabled");
		driver.findElement(By.id("btnSave")).click();
	}
		
		

}
