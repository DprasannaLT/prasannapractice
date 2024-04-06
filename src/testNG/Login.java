package testNG;

import org.testng.annotations.Test;

public class Login extends Annotations {
	@Test
	public void username() {
		System.out.println("enter the Username");
	}

	@Test
	public void password() {
		System.out.println("enter the Password ");
	}

	@Test
	public void login() {
		System.out.println("enter the Login ");
	}

}
