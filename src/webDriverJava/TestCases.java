package webDriverJava;

public class TestCases {
	public static void main(String[] args) throws InterruptedException {
		Login obj=new Login();
		
		
		
		
		//TC4
		obj.LaunchBrowser();
		obj.LaunchApplication();
		
		obj.login("admin","Prasanna@123");
		
		obj.Welcome("Welcome Admin");
		obj.pim();
		obj.pimvalidation();
		//obj.CloseBrowser();*/
	}
	}
	


