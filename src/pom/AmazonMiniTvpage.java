package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonMiniTvpage {
	@FindBy(xpath="//div[@id='nav-xshop']/a[text()='Amazon miniTV']")
	WebElement Link_Click;
	@FindBy(xpath="//h1[text()='mini Movies']")
	WebElement Link_Click2;
	@FindBy(xpath="//img[@alt='Formula Sheet - Watch Free']")
	WebElement Link_Click3;
	@FindBy(id="twotabsearchtextbox")
	WebElement TextBox_Msg;
	//@FindBy(id="twotabsearchtextbox")
	//WebElement TextBox_Msg1;
	//@FindBy(id="twotabsearchtextbox")
	//WebElement TextBox_Msg2;
	
	
	
	public  AmazonMiniTvpage(WebDriver driver) {
		PageFactory.initElements(driver ,this);
	}
	public void AmazonTv(){
		Link_Click.click();
		Link_Click2.click();
		Link_Click3.click();
		
	}
	
	public void Chocolates() {
		TextBox_Msg.sendKeys("Chocolates");
		
		//TextBox_Msg1.
		//TextBox_Msg2.
	}
	
}
