package assignments;

public class Pattern32 {
	public static void main(String[] args) {
		/*1
		 * 23
		 * 456
		 * 78910*/
		 
		
		int count = 1;
		for (int j = 1; j <= 4; j++) {

			for (int i = 1; i <= j; i++) {
				System.out.print(count);
				count++;
				
			}
			System.out.println();

		}

	}

}
