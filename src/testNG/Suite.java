package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Suite {
	@Test
	public void test1() {
		System.out.println("this is case 1");
		
	}
	@Test
	public void test2() {
		System.out.println("this is case 2");
		}
	@BeforeSuite()
	public void suitetest1() {
		System.out.println("this is beforesuite");
		}
	@AfterSuite()
	public void suitetest2() {
		System.out.println("this is  aftersuite");
		}
	@BeforeTest
	public void test3() {
		System.out.println("this is beforetest");
		}
	@AfterTest
	public void test4() {
		System.out.println("this is aftertest");
		}
	@BeforeClass
	public void classtest1() {
		System.out.println("this is beforeclass");
		}
	@AfterClass
	public void classtest2() {
			System.out.println("this is afterclass");
			}
	@BeforeMethod
	public void methodtest1() {
			System.out.println("this is beforemethod");
			}
	@AfterMethod
	public void methodtest2() {
			System.out.println("this is aftermethod");
			}
	
	
	

}
