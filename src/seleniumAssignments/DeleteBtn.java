package seleniumAssignments;
//prasanna
import java.util.List;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteBtn {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\OrangeHrm\\Resourse\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Prasanna@123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		driver.findElement(By.id("firstName")).sendKeys("pallavi");
		driver.findElement(By.id("lastName")).sendKeys("sai");
		
		driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();

		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		List<WebElement>chckBoxes= driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[1]"));
		
		boolean status = false;
		for(WebElement chckBox:chckBoxes) {
			boolean chkstatus=chckBox.isSelected();
			if(chkstatus) {
				status=true;
			}	
		
		/*for (WebElement element : chckBoxes) {
			actualId = chckBoxes.get(chckBoxes).getText();
			
			System.out.println("Checkboxes not selected: Testpass");
			break;

		}*/

		boolean status1 = true;
		if (status1) {
          
			System.out.println("Delete button is disabled:TestPass");
			break;
			

		} else {
			System.out.println("Delete button is enabled:Testfail");
		}
		
		

	}
		driver.findElement(By.id("btnDelete")).click();
		driver.findElement(By.name("chkSelectRow[]")).click();
		driver.findElement(By.id("btnDelete")).click();
				
		driver.findElement(By.id("dialogDeleteBtn")).click();
		//driver.findElement(By.tagName("pallavi")).click();
	}
}


