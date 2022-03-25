package String_Manipulation;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t = "aba";
		System.out.println(validPalindrome(t));
	}

	public static boolean validPalindrome(String s) {
		String temp = s;
		boolean isValid = false;
		for (int i = 0; i < s.length(); i++) {
			 temp = s.substring(0, i + 1) + s.substring(i, s.length() - 1);
			isValid = isPalindrome(temp);
		}
		return isValid;
	}

	public static boolean isPalindrome(String s) {
		for (int i = 0, j = s.length() - 1; i < s.length(); i++, i--) {
			if (s.charAt(i) != s.charAt(j))
				return false;
		}
		return true;

	}
}
