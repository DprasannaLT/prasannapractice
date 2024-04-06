package seleniumAssignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\OrangeHrm\\Resourse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.xpath(" //*[text()='Hyderabad to Bangalore Bus']")).click();
		By BusLocator=By.id("pills-tab");
		WebElement Buslist=driver.findElement(BusLocator);
		
		By HederBlock=By.tagName("a");
		List<WebElement>BusName=Buslist.findElements(HederBlock);
		
	int	list_count=BusName.size();
	System.out.println(list_count);
	
	for(int i=0;i<list_count;i++) {
		
		WebElement abhibustext=BusName.get(i);
		String AbhitextElement=abhibustext.getText();
		
		System.out.println(AbhitextElement);
		
		
		
		
		By BusLocatortext=By.id("pills-tab");
		WebElement Buslist1=driver.findElement(BusLocator);
		
		By HederBlocktext=By.tagName("a");
		List<WebElement>BusName1=Buslist.findElements(HederBlock);
		
		
	}
		
	}

}
