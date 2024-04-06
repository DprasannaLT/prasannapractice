package prasanna;

public class palindromeNumber {
	public static void main(String[] args) {
		int n=135,rem,rev=0,temp;
		temp=n;
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
		}
		System.out.println(rev);
		if(temp==rev)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}

}
