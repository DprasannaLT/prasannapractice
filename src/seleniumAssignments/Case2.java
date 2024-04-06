package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case2 {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\OrangeHrm\\Resourse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Prasanna@123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		WebElement Addemp=driver.findElement(By.name("firstName"));
		//Addemp.isDisplayed();
		Addemp.sendKeys("prasanna");
		WebElement Addemp1=driver.findElement(By.id("lastName"));
		//Addemp1.isDisplayed();
		Addemp1.sendKeys("Dodu");
		driver.findElement(By.id("btnSave")).click();
	}

}
