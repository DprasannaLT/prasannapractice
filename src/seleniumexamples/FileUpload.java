package seleniumexamples;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\OrangeHrm\\Resourse\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Prasanna@123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		driver.findElement(By.id("firstName")).sendKeys("laxmi");
		driver.findElement(By.id("lastName")).sendKeys("prasanna");
		WebElement photoUpload = driver.findElement(By.id("photofile"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", photoUpload);

		Runtime.getRuntime()
				.exec(System.getProperty("user.dir") + "./Resourse/FileUploadScript.exe");
		Thread.sleep(5000);

		driver.findElement(By.id("btnSave")).click();

	}

}
