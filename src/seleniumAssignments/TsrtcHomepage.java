package seleniumAssignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TsrtcHomepage {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\OrangeHrm\\Resourse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.tsrtconline.in/");
		WebElement hometext=driver.findElement(By.linkText("Home"));
		//Actions home=new Actions(driver);
		//home.moveToElement(hometext).build().perform();
		//WebElement home=driver.findElement(By.xpath("//div[@class='home-bot-wrap']/div/ul/li[1]//following::a[1]"));
	
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_ENTER);
		
		
		 
		 //date1.isSelected();
		
		  WebElement home=driver.findElement(By.xpath("//div[@class='home-bot-wrap']/div/ul/li[1]//following::a[1]"));
			home.click();
			 WebElement date=driver.findElement(By.id("txtJourneyDate")); date.click();
			 WebElement date1= driver.findElement(By.linkText("24"));
			 date1.click();
		 Thread.sleep(200);
		 // driver.findElement(By.id("searchBtn")).click();
		  
		  
		  
		 
	}

}


