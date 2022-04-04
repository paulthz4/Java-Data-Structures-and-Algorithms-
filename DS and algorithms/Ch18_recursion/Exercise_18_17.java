package Ch18_recursion;

import java.util.Arrays;

public class Exercise_18_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chars = { 'a', 'f', 'A','i', 'j', 'E', 'U', 'i' };
		char[] arr = Arrays.copyOfRange(chars, 1, chars.length);
		System.out.println(arr);
		System.out.println(count(chars, 'i'));
	}

	public static int count(char[] chars, char ch) {
		return count(chars, ch, 0);
	}

	public static int count(char[] chars, char ch, int high) {
		if (chars.length == 1) {
			if (chars[0] == ch)
				return high+1;
			else
				return high;
		}
		if (chars[0] == ch)
			high++;
		return count(Arrays.copyOfRange(chars, 1, chars.length), ch, high);
	}
}
