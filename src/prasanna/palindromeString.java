package prasanna;

public class palindromeString {
	public static void main(String[] args) {
		String str="lolm";
		String temp="";
		for(int i=str.length()-1;i>=0;i--) {
		temp=temp+str.charAt(i);
	}
		System.out.println(temp);
		
	if(temp.equals(str))
		System.out.println("palindrome");
	else
		System.out.println("not palindrome");

}
}
