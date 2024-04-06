package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class DifferntAplication {
	WebDriver driver;
	String browserName="Edge";
	
    public void LaunchBrowser() {
    	if(browserName.equals("chrome")) {
    		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\OrangeHrm\\Resourse\\chromedriver.exe");
			 driver=new ChromeDriver();
    	}
    	else if(browserName.equals("Edge")) {
    		System.setProperty("webdriver.edge.driver","D:\\Softwares\\OrangeHrm\\Resourse\\msedgedriver.exe");
			 driver=new EdgeDriver();
    	}
    		
    	}
		
		 
		 public void LaunchApplication() {
			 driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
			 }
		 public void Login(String userName, String password) {
		WebElement userName1= driver.findElement(By.id("txtUsername"));
		userName1.sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
	
		 }
		 public void DeleteEmpDetails() throws InterruptedException {
			 driver.findElement(By.id("ohrmList_chkSelectRecord_30")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.id("btnDelete")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.id("dialogDeleteBtn")).click();
		 }
		
		 public static void main(String args[]) throws InterruptedException {
			 DifferntAplication obj=new DifferntAplication();
			 obj.LaunchBrowser();
			 obj.LaunchApplication();
			 obj.Login("admin", "Prasanna@123");
			 obj.DeleteEmpDetails();
		
			 
		 
	}

	
}
