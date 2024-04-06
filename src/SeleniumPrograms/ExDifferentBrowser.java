/*package SeleniumPrograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class ExDifferentBrowser {
	MyWebDriver driver;
    public void LaunchBrowser() {
		String browserName="chrome";
		 if(browserName.equals("Edge")) {
			 System.setProperty("webdriver.chrome.driver","");
			 driver=new MyEdge();
			 }
		 else {
			 System.setProperty("webdriver.chrome.driver","D:\\Softwares\\OrangeHrm\\Resourse\\chromedriver.exe");
			 driver=new MyChrome();
		 }
		 }
		 public void LaunchApplication() {
			 driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
			 }
		 public void Login() {
			  driver.findElement(By.id("txtUsername")).sendkeys("admin");
				 driver.findElement(By.id("txtPassword"))).sendKeys("Prasanna@123");
				 driver.findElement(By.id("btnLogin")).click();
		 }
		 public static void main(String args[]) {
			 ExDifferentBrowser obj=new ExDifferentBrowser();
			 obj.LaunchBrowser();
			 obj.LaunchApplication();
			 obj.Login();
			 
		 }
	}*/


