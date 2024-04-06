package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAddtocart {
//https://www.amazon.in/OnePlus-Nord-Lite-128GB-Storage/dp/B09WQYFLRX?ref_=Oct_d_otopr_d_1389432031_0&pd_rd_w=lnYJb&content-id=amzn1.sym.cb97c3fe-bb9e-4404-a654-f560f300976b&pf_rd_p=cb97c3fe
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\OrangeHrm\\Resourse\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();	
	driver.get("https://www.amazon.in/");
	//Thread.sleep(3000);
	driver.findElement(By.xpath("//*[text()='Mobiles']")).click();
	driver.findElement(By.xpath("//*[text()='Smartphones & Basic Mobiles']")).click();
	driver.get("https://www.amazon.in/OnePlus-Nord-Lite-128GB-Storage/dp/B09WQYFLRX?ref_=Oct_d_otopr_d_1389432031_0&pd_rd_w=lnYJb&content-id=amzn1.sym.cb97c3fe-bb9e-4404-a654-f560f300976b&pf_rd_p=cb97c3fe");
	driver.findElement(By.xpath("//*[@id='add-to-cart-button']")).click();
}
}
