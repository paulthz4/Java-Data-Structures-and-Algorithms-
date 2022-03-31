package String_Manipulation;

public class delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// reverse string in place
		System.out.println("abcd reversed iteratively is "+reverseString("abcd"));
		System.out.println("abcd reversed using recursion is "+reverseStringRecursion("abcd"));
		System.out.println("abc "+ reverseStringRecursion(""));
	}
	public static String reverseString(String s){
		char [] a = s.toCharArray();
		for(int i=0, j=s.length()-1; i<j; i++, j--) {
			char temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		return new String(a);
	}
	
	public static String reverseStringRecursion(String s) {
		if(s == null || s.isEmpty())
			return "-1";
		String s2 = "";
		return reverseHelper(s, s2);
		
	}
	public static String reverseHelper(String str, String s) {
		if(str.length() == 1)
			return s+=str;
		s += str.charAt(str.length()-1);
		return reverseHelper(str.substring(0, str.length()-1), s);
	}
}
