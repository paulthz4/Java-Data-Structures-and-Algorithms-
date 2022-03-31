package String_Manipulation;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse("Have a nice day"));
		System.out.println(reverseRecursively("Have a nice day"));
	}

	public static String reverse(String s) {
		if (s.equals(""))
			return "";
		char[] chars = s.toCharArray();
		for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
			char t = s.charAt(i);
			chars[i] = chars[j];
			chars[j] = t;
		}
		return new String(chars);
	}

	public static String reverseRecursively(String str) {
		// base case to handle one char string and empty string
		if (str.length() < 2) {
			return str;
		}

		return reverseRecursively(str.substring(1)) + str.charAt(0);

	}
}
