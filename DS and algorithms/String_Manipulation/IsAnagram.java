package String_Manipulation;

public class IsAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAnagram("anagram", "nagaram"));
//		System.out.println(isAnagramRec("abc", "abc", 0));
		String a = "abcde";
		System.out.println(a.substring(4, 4));
	}

	public static boolean isAnagram(String word, String anagram) {
		if (word.length() != anagram.length()) {
			return false;
		}

		char[] chars = word.toCharArray();

		for (char c : chars) {
			int index = anagram.indexOf(c);
			if (index != -1) {
				anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
			} else {
				return false;
			}
		}

		return anagram.isEmpty();
	}

	public static boolean isAnagramRec(String a, String b, int i) {
		// not finished
		//isAnagramRec(a, b.substring(0, i) + b.substring(i + 1, b.length()), i++);

		return b.isEmpty();
	}

	private static void permutation(String perm, String word) {
		if (word.isEmpty()) {
			System.err.println(perm + word);

		} else {
			for (int noMore = 0; noMore <= 1; noMore++) {
				if (noMore == 0) {
					for (int i = 0; i < word.length(); i++) {
						permutation(perm + word.charAt(i), word.substring(i + 1, word.length()));
					}
				} else {
					permutation(perm, "");
				}
			}
		}
	}
}
