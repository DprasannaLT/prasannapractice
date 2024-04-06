package JavaPrograms;

public class MethodOverloading {
	public void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
public void add(float a,float b) {
	float c=a+b;
	System.out.println(c);
		
	}
public void add(int a,int b,int c) {
	int d=a+b+c;
	System.out.println(d);
	
}
public static void main(String[] args) {
	MethodOverloading obj=new MethodOverloading ();
	obj.add(52.0f,20.80f);
	obj.add(5, 4);
}

}
