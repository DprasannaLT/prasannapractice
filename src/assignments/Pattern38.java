package assignments;

public class Pattern38 {
	/*       *
	       *  *
	      *  *  *
	      * * * *
	     * * * * *    */
	public static void main(String[] args) {
		//int row=5;
		for(int j=1;j<=5;j++) {
			for(int k=1;k>=j-1;k--) 
				System.out.print("  ");
				for(int i=1;i<=j;i++)
				//System.out.print(" ");
			System.out.print(" *");
				System.out.println();
			}
		}
		
	}


