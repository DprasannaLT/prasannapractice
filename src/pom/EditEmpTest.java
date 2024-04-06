package pom;

import org.testng.annotations.Test;

public class EditEmpTest extends Base{
	@Test
	public void verifyEditEmp() {
		launchBrowser();
		launchApplication();
		OrangeLogin obj=new OrangeLogin(driver);
		obj.OrangeAddemp();
		EditEmppage sub=new EditEmppage(driver);
		sub.verifyEditEmp();
		
	}

}
