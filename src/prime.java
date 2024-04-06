import java.util.Scanner;

public class prime {
	 static public void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number");
		int n=obj.nextInt();
		int factors=0;
		for (int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
				factors++;
			}
		}
		if(factors==2)
			System.out.println("prime");
		else
			System.out.println("not prime");
	}

	}
