package String_Manipulation;

public class delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// reverse string in place
		System.out.println("abcd reversed iteratively is " + reverseString("abcd"));
		System.out.println("abcd reversed using recursion is " + reverseStringRecursion("abcd"));
		System.out.println("abc " + reverseStringRecursion(""));
		System.out.println("number of v owels in hello there: " + countVowels("hello there"));
	}

	public static String reverseString(String s) {
		char[] a = s.toCharArray();
		for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
			char temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		return new String(a);
	}

	public static String reverseStringRecursion(String s) {
		if (s == null || s.isEmpty())
			return "-1";
		String s2 = "";
		return reverseHelper(s, s2);

	}

	public static String reverseHelper(String str, String s) {
		if (str.length() == 1)
			return s += str;
		s += str.charAt(str.length() - 1);
		return reverseHelper(str.substring(0, str.length() - 1), s);
	}

	public static int countVowels(String input) {
		int count = 0;
		char[] letters = input.toCharArray();
		for (char c : letters) {
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
			}
		}
		return count;
	}

	public static boolean helper(String newPass, String oldPass) {
		if (newPass.length() <= 3)
			return true;

		String s1 = newPass.substring(0,4);

		for (int i = 0; i < oldPass.length(); i++) {
			if (i + 4 >= oldPass.length())
				break;
			else {
				String s2 = oldPass.substring(i, i + 4);
				if(s1.equals(s2))
					return false;
			}

		}
		return helper(newPass.substring(1), oldPass);
	}
}
