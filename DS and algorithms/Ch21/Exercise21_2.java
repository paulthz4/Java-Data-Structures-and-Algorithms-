package Ch21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

/*********************************************************************************
 * (Display nonduplicate words in ascending order) Write a program that reads *
 * words from a text file and displays all the nonduplicate words in ascending *
 * order. The text file is passed as a command-line argument. *
 *********************************************************************************/
public class Exercise21_2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		if (args.length != 1) {
			System.out.println("Usage: java fileName");
			System.exit(1);
		}

		// Check if file exists
		File textFile = new File(args[0]);
		if (!textFile.exists()) {
			System.out.println("The file " + args[0] + " does not exist.");
			System.exit(2);
		}
		TreeSet<String> set = new TreeSet<>();
		try (
				Scanner in = new Scanner(textFile);
				) {

			while (in.hasNext()) {
				String[] words = in.nextLine().split("[ \n\t\r.,;:!?()-]");
				for (String word : words) {
					if (word.length() > 0)
						set.add(word.toLowerCase());
				}
			}
		}
	}
}
