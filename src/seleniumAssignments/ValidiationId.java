package seleniumAssignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidiationId {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\OrangeHrm\\Resourse\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Prasanna@123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		driver.findElement(By.id("firstName")).sendKeys("VishnuVardhan");
		driver.findElement(By.id("lastName")).sendKeys("Reddy");
		String expectedId = driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		List<WebElement> ids=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
		boolean status=false;
		
		String actualId = null;
		for (int i = 0; i < ids.size(); i++) {
			actualId = ids.get(i).getText();
			if (expectedId.equals(actualId)) {
				status = true;
				break;
			}

		}

		if (status) {
			System.out.println(
					"Verify Record: \nExpected Id: " + expectedId + "\nActual Id: " + actualId + "-->Test Pass");
		} else {
			System.out.println(
					"Verify Record: \nExpected Id: " + expectedId + "\nActual Id: " + actualId + "-->Test Fail");
	}
	}

}
