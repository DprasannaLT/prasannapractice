package pom;

import org.testng.annotations.Test;

public class AmazonMiniTvTest extends AmazonBase{
	@Test
	public void VerifyAmazonTv() {
		LaunchBrowser();
		LaunchApplication();
		AmazonMiniTvpage obj=new AmazonMiniTvpage(driver);
		obj.AmazonTv();
		closebrowser();
		
		LaunchBrowser() ;
		LaunchApplication();
		AmazonMiniTvpage obj1=new AmazonMiniTvpage(driver);
		 obj1.Chocolates();
	}

}
