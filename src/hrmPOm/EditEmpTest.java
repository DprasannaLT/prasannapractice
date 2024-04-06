package hrmPOm;

import org.testng.annotations.Test;

public class EditEmpTest extends BasePage{
	@Test
	public void verifyEditEmp() {
		launchBrowser();
		launchApplication();
		OrangeLogin obj=new OrangeLogin(driver);
		obj.OrangeHomepage();
		obj.Pimmodule();
		EditEmppage sub=new EditEmppage(driver);
		sub.verifyEditEmp();
		
	}

}
