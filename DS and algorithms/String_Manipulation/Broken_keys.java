package String_Manipulation;
// leetcode question "Maximum Number of Words You Can Type"
import java.util.*;

public class Broken_keys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		String text = "hello world";
		String brokenLetters = "ad";
		System.out.println("Number of formable words " + formableWords(text, brokenLetters));
		
	}
	
	public static int formableWords(String text, String brokenLetters) {
//		Set<String> words = new HashSet<>();
		int count = 0;
		String[] words = text.split(" ");
        for(int i=0;i<text.split(" ").length;i++){
        	for(int j=0; j<brokenLetters.length();j++){
        		if(words[i].contains(brokenLetters.charAt(j)+""))
        			count++;
        	}
        }
        return count;
	}

}
