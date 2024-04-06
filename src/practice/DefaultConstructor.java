package practice;

public class DefaultConstructor {
	private int empid;
	private String empname;
	DefaultConstructor(){
		empid=411;
		empname="prasanna";
	}
	void display()
	{
		System.out.println("EmpId:"+empid+"\nEmpname"+empname);
	}
	public static void main(String[] args) {
		DefaultConstructor vaishu=new DefaultConstructor();
		vaishu.display();
		DefaultConstructor jessy=new DefaultConstructor();
		jessy.display();
	}

}
