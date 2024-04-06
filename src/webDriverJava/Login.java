package webDriverJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Login {
	WebDriver driver;
	
	
	public void LaunchBrowser() {
		String browserName = "Edge";
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\OrangeHrm\\Resourse\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("Edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\Softwares\\OrangeHrm\\Resourse\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
	}

	public void LaunchApplication() {
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
	}

	public void login(String uname, String upassword) {
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(upassword);
		driver.findElement(By.id("btnLogin")).click();
		//String Actualmsg = driver.findElement(By.id("spanMessage")).getText();
		/*if (Expectedmsg.equals(Actualmsg)) {
			//String Actualmsg = driver.findElement(By.id("spanMessage")).getText();
			System.out.println(
					"Verify Error MsgBlankPassword:\nExpected:" + Expectedmsg + "\nActual:" + Actualmsg + "\nTestPass");
		} else {
			System.out.println(
					"Verify Error MsgBlankPassword:\nExpected:" + Expectedmsg + "\nActual:" + Actualmsg + "\nTestFail");
		}*/
	}

	public void VerifyErrorMsg(String Expectedmsg) {
		String Actualmsg = driver.findElement(By.id("spanMessage")).getText();
        
		if (Expectedmsg.equals(Actualmsg)) {
			System.out.println(
					"Verify Error MsgBlankPassword:\nExpected:" + Expectedmsg + "\nActual:" + Actualmsg + "\nTestPass");
		} else {
			System.out.println(
					"Verify Error MsgBlankPassword:\nExpected:" + Expectedmsg + "\nActual:" + Actualmsg + "\nTestFail");
		}
	}

	public void Welcome(String Expectedmsg) {
		String Actualmsg = driver.findElement(By.id("welcome")).getText();
		if (Expectedmsg.equals(Actualmsg)) {
			System.out.println(
					"Verify ValidCredintails:\nExpected:" + Expectedmsg + "\nActual:" + Actualmsg + "\nTestPass");
		} else {
			System.out.println(
					"Verify ValidCredintails:\nExpected:" + Expectedmsg + "\nActual:" + Actualmsg + "\nTestFail");
		}
	}

public void pim() {
	driver.findElement(By.id("menu_pim_viewPimModule")).click();
	driver.findElement(By.id("menu_pim_addEmployee")).click();
	driver.findElement(By.id("firstName")).sendKeys("Laxmi");
	driver.findElement(By.id("lastName")).sendKeys("Prasanna");
	
	
	
	
}
public void pimvalidation() {
	String expectedId = driver.findElement(By.id("employeeId")).getAttribute("value");
	driver.findElement(By.id("btnSave")).click();
	driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
	
	List<WebElement> ids=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
	boolean status=false;
	
	String actualId = null;
	int i=0;
	
	if(i>ids.size())
	{
		actualId = ids.get(i).getText();
		if (expectedId.equals(actualId)) {
			status = true;
			
		}

	}

	if (!status) {
		System.out.println(
				"Verify Record: \nExpected Id: " + expectedId + "\nActual Id: " + actualId + "-->Test Pass");
		driver.findElement(By.id("ohrmList_chkSelectRecord_56")).click();
		driver.findElement(By.id("btnDelete")).click();
		driver.findElement(By.id("dialogDeleteBtn")).click();
	} else {
		System.out.println(
				"Verify Record: \nExpected Id: " + expectedId + "\nActual Id: " + actualId + "-->Test Fail");
}
}

	


	public void CloseBrowser() {
		driver.close();
	}

}
