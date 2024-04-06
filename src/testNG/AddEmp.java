package testNG;

import org.testng.annotations.Test;

public class AddEmp extends Annotations {
	@Test
	public void firstName() {
		System.out.println("enter Firstname");
	}

	@Test
	public void lastName() {
		System.out.println("enter Lastname");

	}

	@Test
	public void saveButton() {

		System.out.println("enter Savebutton");
	}

	@Test
	public void editbutton() {

		System.out.println("enter Editbutton");
	}

	@Test
	public void deleteButton() {

		System.out.println("enter Deletebutton");
	}
}
