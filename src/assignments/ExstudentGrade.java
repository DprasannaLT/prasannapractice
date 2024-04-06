package assignments;

public class ExstudentGrade {
	public static void main(String[] args) {
		/*for(int i=35;i>=100;i++)
		{
			System.out.println("pass");
		}
		
		{
			System.out.println("fail");
		}*/
		int marks =50;
		switch(marks) {
		case  90:
		System.out.println("A grade");break;
		case  80:
			System.out.println("B grade");break;
		case  70:
			System.out.println("C grade");break;
		case  50:
			System.out.println("D grade");break;
			default:
				System.out.println("fail");break;	
				}
	}
}
