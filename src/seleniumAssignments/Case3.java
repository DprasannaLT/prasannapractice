package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class Case3 {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\OrangeHrm\\Resourse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Prasanna@123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_Job")).click();
		driver.findElement(By.id("menu_admin_viewJobTitleList")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("jobTitle_jobTitle")).sendKeys("ORANGEHRM");
		driver.findElement(By.id("jobTitle_jobDescription")).sendKeys("Selenium Assignments");
		driver.findElement(By.id("btnSave")).click();
	}
}
		
		
		
		
		
		
		
	

		
		
		
		
		
		
		
		
	
	

