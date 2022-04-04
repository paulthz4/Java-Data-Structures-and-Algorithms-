package Ch18_recursion;

import java.util.Arrays;

public class Exercise_18_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[]  chars = {'a', 'f','A', 'j','E','U', 'i','P'};
		char[] arr = Arrays.copyOfRange(chars, 1,chars.length);
		System.out.println(arr);
		System.out.println(count(chars));
	}
	
	public static int count(char[] chars) {
		return count(chars, 0);
	}
	
	public static int count(char[] chars, int high) {
		if(chars.length == 1) {
			if(Character.isUpperCase(chars[0]))
				return high+1;
			else return high;
		}
		if(Character.isUpperCase(chars[0]))
			high++;
		return count(Arrays.copyOfRange(chars, 1, chars.length),high);
	}

}
