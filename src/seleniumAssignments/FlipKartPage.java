package seleniumAssignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKartPage {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\OrangeHrm\\Resourse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement Fashions=driver.findElement(By.xpath("//img[@alt='Fashion']"));
		Actions action=new Actions(driver);
		action.moveToElement(Fashions).perform();
		driver.findElement(By.linkText("Kids")).click();
		driver.findElement(By.name("q")).sendKeys("kids girls dress");
		Robot robo=new Robot();
	 robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease	(KeyEvent.VK_ENTER);
        WebElement Brand=driver.findElement(By.xpath("//*[text()='Brand']"));
        Actions obj=new Actions(driver);
        obj.moveToElement(Brand).build().perform();
        driver.findElement(By.xpath("//*[text()='MAX']")).click();
      
        driver.findElement(By.xpath("//img[@class='_2r_T1I _396QI4']")).click();
		driver.get("https://www.flipkart.com/max-girls-calf-length-casual-dress/p/itma9ade9ab17db7?pid=KDEGB5DZFGUWTVEZ&lid=LSTKDEGB5DZFGUWTVEZQMYEOX&marketplace=FLIPKART&q=kids+girls+dress&store=clo%2Fodx%2Fmaj%2Fzc1&srno=s_1_6&otracker=search&otracker1=search&fm=Search&iid=2babdde0-d7ae-4678-9b89-253a2e5e9038.KDEGB5DZFGUWTVEZ.SEARCH&ppt=sp&ppn=sp&ssid=iwej22aadc0000001688052028081&qH=6c3e5322df7a30cc");
	    driver.findElement(By.xpath("//*[text()='Add to cart']")).click();
	   driver.findElement(By.xpath("//*[text()='2 - 3 Years']")).click();
	
	
	
	}

}
