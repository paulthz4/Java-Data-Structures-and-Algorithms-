package String_Manipulation;

public class InteviewHelcim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("old password: qweijsdfpok(*8*213 \t new password: asdq123jsdfasd12**&@^%$ \n"
				+ checkConsecutiveCharacters("qweijsdfpok(*8*213", "asdq123jsdfasd12**&@^%$"));
	}

	public static boolean checkConsecutiveCharacters(String newPass, String oldPass) {
		if (newPass.length() <= 3)
			return true;

		String s1 = newPass.substring(0, 4);

		for (int i = 0; i < oldPass.length(); i++) {
			if (i + 4 >= oldPass.length())
				break;
			else {
				String s2 = oldPass.substring(i, i + 4);
				if (s1.equals(s2)) {
					System.out.println("new password contains 4 consectutive character from old password");
					return false;
				}
			}

		}
		return checkConsecutiveCharacters(newPass.substring(1), oldPass);
	}
}
