package String_Manipulation;

public class IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t = "racecare";
		System.out.println(validPalindrome(t));
//		System.out.println(isPalindromeRec(t));
	}

//	public static boolean isPalindrome(String s) {
//		for(int i=0, j=s.length()-1; i<s.length(); i++, j--) {
//			if(s.charAt(i) != s.charAt(j))
//				return false;
//		}			
//		return true;
//	}
	public static boolean validPalindrome(String s) {
		String temp = s;
		for (int i = 0; i < s.length(); i++) {
			String temps = s.substring(0, i) + s.substring(i + 1, s.length());
			if (isPalindrome(temps)) {
				System.out.println(i);
				return true;
			}	
		}
		return false;
	}

	public static boolean isPalindrome(String s) {
		for (int i = 0, j = s.length() - 1; i < s.length(); i++, j--) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		return true;
	}
}
