package prasanna;

public class fibnacoiSeries {
public static void main(String[] args) {
	int x=1,y=2,count=20;
	System.out.print(x+" "+y);
	
	for(int i=3;i<=count;i++) {
		
		int z=x+y;
		System.out.print(" "+z);
				
				
				
		x=y;
		y=z;
	}
}
}
