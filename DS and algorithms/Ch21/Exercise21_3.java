package Ch21;

import java.io.File;
import java.util.*;

/*********************************************************************************
 * (Count the keywords in Java source code) Revise the program in Listing 21.7.
 * * If a keyword is in a comment or in a string, don’t count it. Pass the Java
 * * file name from the command line. Assume that the Java source code is
 * correct * and line comments and paragraph comments do not overlap. *
 *********************************************************************************/
public class Exercise21_3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		if (args.length != 1) {
			System.out.println("Usage: java sourceFile");
			System.exit(1);
		}

		// Check if file exists and display keyword count
		File file = new File(args[0]);
		if (file.exists()) {
			System.out.println("The number of keywords in " + args[0] + " is " + countKeywords(file));
		} else {
			System.out.println("File " + args[0] + " does not exist");
		}
	}

	public static int countKeywords(File file) throws Exception {
		// Array of all Java keywords + true, false and null
		String[] keywordString = { "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
				"const", "continue", "default", "do", "double", "else", "enum", "extends", "for", "final", "finally",
				"float", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
				"new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super",
				"switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while",
				"true", "false", "null" };

		Set<String> keywordSet = new HashSet<>(Arrays.asList(keywordString));
		int count = 0;

		Scanner input = new Scanner(file);

		while (input.hasNext()) {
			String word = input.next();
			if (word.equals("//"))
				input.nextLine();
			else if (word.contains("\"")) {
				String nextWord;
				do {
					nextWord = input.next();
				} while (!nextWord.contains("\""));
			} else if (word.contains("/*")) {
				String nextWord;
				do {
					nextWord = input.next();
				} while (!nextWord.contains("*/"));
			}
			else if (keywordSet.contains(word))
				count++;
		}

		return count;
	}
}
