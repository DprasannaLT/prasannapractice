package assignments;

public class ArmStrong1to100 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=500;i++) {
			int n=i;
			int sum=0;
			int temp=n;
			while(n>0) {
				int r=n%10;
				sum=sum+(r*r*r);
				n=n/10;
				
			}
				if(sum==temp)
					//if(sum==n)
					System.out.println(i);
				
				
				
			}
			
		}
		
	}


