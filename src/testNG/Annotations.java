package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Annotations {
	@BeforeSuite
	public void before1() {

	}

	@AfterSuite
	public void after1() {

	}

	@BeforeTest
	public void before2() {

	}

	@AfterTest
	public void after2() {

	}

	@BeforeClass
	public void before3() {

	}

	@AfterClass
	public void after3() {

	}

	@BeforeMethod
	public void before4() {

	}

	@AfterMethod
	public void after4() {

	}

}
