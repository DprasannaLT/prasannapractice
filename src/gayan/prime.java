package gayan;

public class prime {
	public static void main(String[] args) {
		int n=3,i,fact=0;
		for(i=1;i<=n;i++) {
			if(n%i==0)
			{
			System.out.println(i);
			fact++;
	}
		}
		
		
	
	if(fact==2) 
		System.out.println("prime");
	
	else
		System.out.println("not prime");
		
		}
	}



