package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseactionFlipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\OrangeHrm\\Resourse\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();	
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
	WebElement fashion=	driver.findElement(By.xpath("//*[@alt=\"Fashion\"]"));////*[@alt='Fashion']
	
	Actions action = new Actions(driver);
	action.moveToElement(fashion).build().perform();
	WebElement kids=driver.findElement(By.xpath("//*[text()='Kids']"));
	kids.click();
	
	}

}
