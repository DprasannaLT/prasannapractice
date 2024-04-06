package seleniumAssignments;

import java.util.List;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteDisable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\OrangeHrm\\Resourse\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Prasanna@123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		//driver.findElement(By.id("menu_pim_addEmployee")).click();
		//driver.findElement(By.id("firstName")).sendKeys("pallavi");
		//driver.findElement(By.id("lastName")).sendKeys("sai");
		//driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		List<WebElement> chckBoxes=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[1]"));
		boolean status=false;
		for(WebElement chckBox:chckBoxes) {
			boolean chkstatus=chckBox.isSelected();
			if(chkstatus) {
				status=true;
				
			}
			if(!status) {
				System.out.println("checkBox is not selected -->TestPass");
				boolean deleteBtnstatus=driver.findElement(By.id("btnDelete")).isSelected();
				if(!deleteBtnstatus) {
					System.out.println("Button is Disabled-->TestPass");
				}
				else {
					System.out.println("Button is Enabled-->TestFail");
				}
			}
			
			else {
				System.out.println("checkBox is  selected -->TestFail");
			}
			
		}
		
	}

}
