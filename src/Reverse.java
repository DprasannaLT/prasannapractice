
public class Reverse {
	public static void main(String[] args) {
		String str="welcome";
		String temp="";
		
		for(int i= str.length()-1;i>=0;i--) {
			temp=temp+str.charAt(i);
		}
		System.out.println(temp);
	}

}
