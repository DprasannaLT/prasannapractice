package SeleniumPrograms;

public class MyInterface {

	public static void main(String[] args) {
		MyWebDriver driver = null;
		String browserName = "edge";
		if (browserName.equals("chrome"))
		{
			driver = new Mychrome();
		} else {
			driver = new MyEdge();
		}
		driver.get();
		driver.Login();
		driver.findelement();

	}

}
