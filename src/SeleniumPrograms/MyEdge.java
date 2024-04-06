package SeleniumPrograms;

public class MyEdge implements MyWebDriver{

	@Override
	public void get() {
		
		System.out.println("get edge");
	}

	@Override
	public void Login() {
		
		System.out.println("Login edge");
	}

	@Override
	public void findelement() {
		System.out.println("findelement edge");
	}

	@Override
	public void quit() {
		System.out.println("quit edge");
	}

}
