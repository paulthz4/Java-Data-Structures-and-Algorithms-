package Exercise_20_4;

import java.util.Arrays;

public class FindtheDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findTheDifference("abcd","abcde"));
	}
	public static char findTheDifference(String s, String t) {
		char[] char1 = s.toCharArray();
		Arrays.sort(char1);
		char[] char2 = t.toCharArray();
		Arrays.sort(char2);
		System.out.println(Arrays.toString(char1)+"\n"+Arrays.toString(char2));
        int size = s.length() > t.length() ? s.length() : t.length();
        for(int i=0; i<size;i++){
        	
	        	if(i == char1.length-1 || i == char2.length-1)
	        		return char1[i];
	        	else if(char1[i] != char2[i]){
	        			return char1[i];
	        		}
        }
        return '!';
	}
}
