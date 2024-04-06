package prasanna;

public class prime {
	public static void main(String[] args) {
		int n=5,fact=0;
		
				for(int i=1;i<=n;i++) {
					if(n%i==0) {
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


