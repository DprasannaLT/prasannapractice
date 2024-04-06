package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPage {
	@FindBy(xpath="//a[text()=' Electronics ']")
	WebElement Link_Click;
	@FindBy(xpath="//div[@id='nav-subnav']//a[8]/span[1]")
	WebElement Link_Click2;
	@FindBy(xpath="//img[@alt='Smart TVs']")
	WebElement Link_Click3;


public AmazonLoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void AmazonElectronics() {
	Link_Click.click();
	Link_Click2.click();
	Link_Click3.click();
}
}
