import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingAddtoCart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\OrangeHrm\\Resourse\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		Set<String>handles=driver.getWindowHandles();
		Iterator it=handles.iterator();
		String parent=(String) it.next();
		String child=(String) it.next();
		driver.switchTo().window(child);		
	    driver.findElement(By.id("add-to-cart-button")).click();
	   //Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")).click();
	    driver.navigate().refresh();
	
	
	}

}
