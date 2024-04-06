package interviewtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class page117 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\OrangeHrm\\Resourse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.youtube.com/");
	driver.navigate().to("https://demo.opencart.com/");
		WebElement obj=driver.findElement(By.xpath("//*[@id='menu']"));
				String s=obj.getCssValue("background-color");
				System.out.print(s);
	}

}
