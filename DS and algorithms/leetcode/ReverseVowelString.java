package leetcode;

import java.util.ArrayList;

public class ReverseVowelString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseVowels("leetcode"));
	}
	 @SuppressWarnings("removal")
	public static String reverseVowels(String s) {
	        // iterate through string
	        String s1 = s.toLowerCase();
	        ArrayList<Character> arr = new ArrayList<>();
	         // inset the vowels in a map/array
	        
	        for( int i=0; i<s1.length(); i++){
	            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
	                arr.add(s.charAt(i));
	            
	        }
	        
	        // reverse array/map
	        
	         for(int i=0, j=arr.size()-1; i<j; i++, j--){
	             char temp = arr.get(i);
	             arr.set(i, arr.get(j));
	             arr.set(j, temp);
	         }
	        
	        // replace in string s
	        String s2 = "";
	         for( int i=0; i<s1.length(); i++){
	        	 
	            if(s1.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u'){  
	                s2 += arr.remove(0);
	            }
	            else
	                s2 += (s1.charAt(i)+"");
	                
	            
	        }
	        return s2;
	    }
}
