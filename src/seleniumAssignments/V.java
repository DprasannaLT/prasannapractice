package seleniumAssignments;

public class V {
	public static void main(String[] args) {
		
		//String str="I win 15 times and but may fail 999 times";
		int output=0;
		String str2= "I win all times and but may zero times";
		int len=str2.length();
		for(int i=0;i<str2.length();i++) {
			if(Character.isDigit(str2.charAt(i))) {
				
		//	if(str2.charAt(i)!=str2.charAt(i)) {
				output=output+Character.getNumericValue(str2.charAt(i));
				break;
				
			}
		}
		System.out.println(output);
	}

}
