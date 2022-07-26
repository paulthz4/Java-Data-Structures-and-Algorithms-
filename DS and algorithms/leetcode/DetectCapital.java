package leetcode;

public class DetectCapital {
//	We define the usage of capitals in a word to be right when one of the following cases holds:
//
//		All letters in this word are capitals, like "USA".
//		All letters in this word are not capitals, like "leetcode".
//		Only the first letter in this word is capital, like "Google".
//		Given a string word, return true if the usage of capitals in it is right.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "FlaG";
		System.out.println(a.substring(1).equals(a.substring(1).toLowerCase()));
		System.out.println(detectCapital("FlaG"));
	}

	public static boolean detectCapitalUse(String word) {
		// wrong
		boolean first = false;
		boolean second = false;
		char[] arr = word.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 91) {
				first = true;
			}
			else {
				first = false;
			}
			if(i == 0)
				second = first;
			if( arr.length == 2)
				if(arr[1] < 91 && arr[0] > 91)
					return false;
			if(first != second && i > 1)
				return false;
			 
				second = first;
		}
		return (first == second);
	}
	
	public static boolean detectCapital(String word) {
		if(word.length() <= 1) return true;
		if(word.equals(word.toUpperCase())) {
			return true;
		}
		else if(word.substring(1).equals(word.substring(1).toLowerCase())) {
			System.out.println(word);
			return true;
		}
		else return false;
	}
	
	public static boolean detectCapitalCount(String word) {
		int capitals = 0;
		for(int i=0; i<word.length(); i++) {
		}
		return false;
	}
}
