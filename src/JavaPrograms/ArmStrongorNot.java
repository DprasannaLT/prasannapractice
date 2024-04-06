package JavaPrograms;




public class ArmStrongorNot {
	public static void main(String[] args) {
		int n=153;
		int r;
		int sum=0;
		int temp=n;
		while(n>0) {
			r=n%10;//1)1 2)2 3)0
			sum=sum+(r*r*r);//1)1 2)8+1 3)0
			n=n/10;//1)12 2)2 3)0
		}
		
		if(sum==temp)
		{
			System.out.println("it is armstrong");
		}
		else {
			System.out.println("it is  not armstrong");
		}
		
		}
		
	}


		
	


