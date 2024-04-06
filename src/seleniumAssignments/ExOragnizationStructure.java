package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExOragnizationStructure {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\OrangeHrm\\Resourse\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Prasanna@123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Organization"))).moveToElement(driver.findElement(By.id("menu_admin_viewCompanyStructure"))).click().build().perform();
		driver.findElement(By.id("btnSetOrganizationName")).click();
	}

}