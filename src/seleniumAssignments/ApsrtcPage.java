package seleniumAssignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApsrtcPage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\OrangeHrm\\Resourse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.apsrtconline.in/");
		
		By HeaderBlockLocator=By.className("menu-wrap");
		WebElement HeaderBlockElement=driver.findElement(HeaderBlockLocator);
		
		By HeaderBlockLinkLocator=By.tagName("a");
		List<WebElement>HeaderBlockLinkElement=HeaderBlockElement.findElements(HeaderBlockLinkLocator);
		
		int Apsrtc_count=HeaderBlockLinkElement.size();
		System.out.println(Apsrtc_count);
		
		for(int i=0;i<Apsrtc_count;i++) {
			WebElement Apsrtc_WebElement=HeaderBlockLinkElement.get(i);
			
			String HeaderText=Apsrtc_WebElement.getText();
			System.out.println(HeaderText);
			String HeaderAttribute=Apsrtc_WebElement.getAttribute("href");
			System.out.println(HeaderAttribute);
			Apsrtc_WebElement.click();
			driver.navigate().forward();
			
			
			// again finding the properties for next links clicking so we have to reassign the properties
			 HeaderBlockLocator=By.className("menu-wrap");
			 HeaderBlockElement=driver.findElement(HeaderBlockLocator);
			
			HeaderBlockLinkLocator=By.tagName("a");
			HeaderBlockLinkElement=HeaderBlockElement.findElements(HeaderBlockLinkLocator);
			
		}
		
		
		
	}

}
