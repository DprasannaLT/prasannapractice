package seleniumAssignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonBook {
		public static void main(String[] args) throws AWTException {
			System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\OrangeHrm\\Resourse\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			WebElement allbox=driver.findElement(By.id("searchDropdownBox"));
			Select AllBox_DropDown=new Select(allbox);
			AllBox_DropDown.selectByVisibleText("Books");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books");
			Robot obj=new Robot();
			obj.keyPress(KeyEvent.VK_ENTER);
			obj.keyRelease(KeyEvent.VK_ENTER);
			driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div")).click();
			
			Set<String>AddToacart= driver.getWindowHandles();
			Iterator it=AddToacart.iterator();
			String Parent=(String) it.next();
			String Child=(String) it.next();
			driver.switchTo().window(Child);
			driver.findElement(By.id("add-to-cart-button")).click();
			driver.findElement(By.linkText("Go to Cart")).click();
			
		}
	}


