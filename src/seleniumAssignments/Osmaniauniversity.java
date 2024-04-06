package seleniumAssignments;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Osmaniauniversity {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\OrangeHrm\\Resourse\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.osmania.ac.in/");

		By LanguagesLocator=By.id("gtranslate_selector");
		WebElement SelectLanguages=driver.findElement(LanguagesLocator);

		By LanguagesList=By.tagName("option");
		List<WebElement>AllLanguages=SelectLanguages.findElements(LanguagesList);

		int	AllLanguages_count=AllLanguages.size();
		System.out.println(AllLanguages_count);

		for(int i=0;i<AllLanguages_count;i++) {

			String Nooflanguages=AllLanguages.get(i).getText();
			System.out.println(Nooflanguages);

			Select obj=new Select(SelectLanguages);
			obj.selectByVisibleText(Nooflanguages);

			Thread.sleep(5000);
			

			TakesScreenshot ts=(TakesScreenshot)driver;
			File screenshot=ts.getScreenshotAs(OutputType.FILE);
			Files.copy(screenshot,new File("./Osmaniascreenshot/"+Nooflanguages+".png"));

		}



	}

}
