package gayan;

public class fibnacoiseries {
	public static void main(String[] args) {
		
		int x=0,y=1,z,i,count=10;
		System.out.print(x+" "+y);
		for(i=2;i<count;i++
				) {
			z=x+y;
			System.out.print(" "+z);
			x=y;
			y=z;
		}
		
		
		
	}
	
	

}
