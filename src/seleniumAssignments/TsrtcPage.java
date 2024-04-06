package seleniumAssignments;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TsrtcPage {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\OrangeHrm\\Resourse\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.tsrtconline.in/");
		
		By HeaderBlockL=By.className("menu-wrap");
		WebElement HeaderElement=driver.findElement(HeaderBlockL);
		 
		 
		 By HeaderLinkL=By.tagName("a");
		List<WebElement> HeaderLinkElements= HeaderElement.findElements(HeaderLinkL);
		
		int Tsrtc_count=HeaderLinkElements.size();
		System.out.println(Tsrtc_count);
		 
		for(int i=0;i<Tsrtc_count;i++) 
		{
		   WebElement tsrtcHeaderLinkElement= HeaderLinkElements.get(i);
			String HeaderBlocktext= tsrtcHeaderLinkElement.getText();
			System.out.println(HeaderBlocktext);
			
			
			String HeaderlinkAttribute=tsrtcHeaderLinkElement.getAttribute("href");
			System.out.println(HeaderlinkAttribute);
			tsrtcHeaderLinkElement.click();
			driver.navigate().forward();
			 HeaderBlockL=By.className("menu-wrap");
			 HeaderElement=driver.findElement(HeaderBlockL);
			 
			 
			  HeaderLinkL=By.tagName("a");
			HeaderLinkElements= HeaderElement.findElements(HeaderLinkL);
			
		}
		 
	}
	}


