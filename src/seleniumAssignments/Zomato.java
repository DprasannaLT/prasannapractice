package seleniumAssignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\OrangeHrm\\Resourse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/hyderabad");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//*[text()='Inspiration for your first order']
		
		By ItemsLocator=By.xpath("//*[text()='Inspiration for your first order']");
		WebElement Select=driver.findElement(ItemsLocator);
		
		By ItemsName=By.tagName("div");
		List<WebElement>ItemHeder=Select.findElements(ItemsName);
		
		int name_count=ItemHeder.size();
		System.out.println(name_count);
		Select.click();
		
		
		
		
	}

}
