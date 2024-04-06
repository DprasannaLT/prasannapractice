package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "./Resourse/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books");
		
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_ENTER);
		
		
	}

}
