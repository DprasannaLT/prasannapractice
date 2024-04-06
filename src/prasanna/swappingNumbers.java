package prasanna;

public class swappingNumbers {
public static void main(String[] args) {
	int a=45,b=30;//temp;
	System.out.println("Before swapping:");
	System.out.println(a+" "+b);
	a=a+b;//temp=a;
	b=a-b;//a=b;
	a=a-b;//b=temp;
	System.out.println("after swapping:");
	System.out.println(a+" "+b);
}
}
