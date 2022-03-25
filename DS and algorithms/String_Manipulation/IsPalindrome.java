package String_Manipulation;

public class IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t = "raceecaer";
		System.out.println(isPalindrome(t));
	}
	
	public static boolean isPalindrome(String s) {
		for(int i=0, j=s.length()-1; i<s.length(); i++, j--) {
			if(s.charAt(i) != s.charAt(j))
				return false;
		}			
		return true;
	}
}
