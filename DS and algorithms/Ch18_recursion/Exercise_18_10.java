package Ch18_recursion;

import java.util.Arrays;

public class Exercise_18_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Occurrnce of 'e' is "+count("welcome to the show", 'e') );
		int[] n = {1,2,3,4,5,2};
		String a = Arrays.toString(n);
		System.out.println(a);
		System.out.println(a.charAt(1));
	}
	
	public static int count(String str, char a ) {
		int count =0;
		return helper(str, a, count);
	}
	
	public static int helper(String str, char a, int count) {
		if(str.isEmpty())
			return count;
		if(str.charAt(str.length()-1) == a)
			count++;
		return helper(str.substring(0, str.length()-1), a, count);
	}
}
