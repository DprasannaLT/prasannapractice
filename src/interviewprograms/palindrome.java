package interviewprograms;

import java.util.Scanner;

public class palindrome {
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
			System.out.println("enter the string:");
			String str=sc.next();
			String org_str=str;
			String rev="";
			int len=str.length();
			
			for(int i=len-1;i>=0;i--) {
				rev=rev+str.charAt(i);
				
			}
			if(str.equals(rev)) {
				System.out.println("palindrome");
			}
				
			else
				System.out.println("not palindrome");
	}
	}
/*Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
int rev=0;
int temp=n;
while(n>0) {
	int rem=n%10;
	rev=rev*10+rem;
	n=n/10;
	}
System.out.println(rev);
if(temp==rev)
	System.out.println("palindrome");
else
	System.out.println("not palindrome");*/
