package gayan;

public class swapping {
	public static void main(String[] args) {
		int a=10,b=5,temp;
		System.out.println("before swapping:");
	System.out.println(a);
	System.out.println(b);
	
	/*System.out.println("after swapping:");
	 temp=a;
	 a=b;
	 b=temp;
	System.out.println(a);
	System.out.println(b);
	*/
	System.out.println("after swapping:");
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a);
	System.out.println(b);
	}

}
