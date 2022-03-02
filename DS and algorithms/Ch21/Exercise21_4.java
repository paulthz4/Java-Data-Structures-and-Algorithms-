package Ch21;
/*********************************************************************************
* (Count consonants and vowels) Write a program that prompts the user to enter a *
* text file name and displays the number of vowels and consonants in the file.   *
* Use a set to store the vowels A, E, I, O, and U.                               *
*********************************************************************************/
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise21_4 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a text file name:");
//		File file = new File(in.next());
//
//		if(!file.exists()) {
//			System.out.println("The file " + file + " does not exist.");
//			System.exit(1);
//		}
		String file= in.nextLine();
		int consonants = 0;
		int vowels = 0;
		Set<Character> set = new HashSet<>(Arrays.asList('A','E','I','O','U','a','e','i','o','u'));
		Scanner input = new Scanner(file);
		while(input.hasNext()) {
			String word = input.next();
			for(int i=0; i<word.length(); i++){
				if(set.contains(word.charAt(i))) {
					vowels+=1;
				}
				else consonants+=1;
			}

		}
		System.out.println("The input \"" + file+ "\" has " + vowels +
				" vowels and " + consonants + " consonants.");
	}

}
