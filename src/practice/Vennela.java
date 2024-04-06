package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Vennela {
public static void main(String[] args) throws IOException, AWTException, InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement all=driver.findElement(By.id("searchDropdownBox"));
	all.click();
	//WebElement books=driver.findElement(By.linkText("Books"));
	Select select=new Select(all);
	select.selectByVisibleText("Books");
	Robot robo=new Robot();
	robo.keyPress(KeyEvent.VK_TAB);
	robo.keyRelease(KeyEvent.VK_TAB);
driver.get("https://www.flipkart.in/");
	robo.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
	robo.keyRelease(KeyEvent.VK_ENTER);
	System.out.println("complete");
/*List<WebElement>allLinks=driver.findElements(By.tagName("select"));
for(WebElement ele:allLinks) {
	System.out.println(ele.getText());
}
	driver.navigate().back();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	driver.switchTo().frame(0);
	WebElement draggable=driver.findElement(By.id("draggable"));
	WebElement droppable=driver.findElement(By.id("droppable"));
	Actions action=new Actions (driver);
	action.dragAndDrop(draggable, droppable).build().perform();
	action.moveToElement(droppable).perform();
	action.contextClick(draggable).perform();
	action.click(draggable).perform();
	File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//TakesScreenshot ts=(TakesScreenshot)driver;
	//File f=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f,new File("D:\\Softwares\\OrangeHrm\\Screenshots.png"));*/
	

}
}
