package interviewprograms;

import java.util.Scanner;

public class fibnacoiseries {
	public static void main(String[] args) {
		int term,a=0,b=1,c;
		System.out.print("enter the term:");
	Scanner scan=new Scanner(System.in);
	term=scan.nextInt();
	for(int i=1;i<term;i++) {
		
		System.out.print(a+" ");
		c=a+b;
		a=b;
		b=c;
	}
}
}



