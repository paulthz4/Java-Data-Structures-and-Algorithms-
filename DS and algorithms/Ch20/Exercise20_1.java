package Ch20;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*********************************************************************************
* (Display words in ascending alphabetical order) Write a program that reads     *
* words from a text file and displays all the words (duplicates allowed) in      *
* ascending alphabetical order. The words must start with a letter. The text     *
* file is passed as a command-line argument.                                     *
*********************************************************************************/
public class Exercise20_1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		if(args.length != 1) {
			System.out.println("Usage: java Exercise_20_01 TextFile");
			System.exit(1);
		}
		File textfile = new File(args[0]);
		if(!textfile.exists()) {
			System.out.println("The file " + args[0] + " does not exist.");
			System.exit(2);
		}
		List<String> list = new ArrayList<>();
		Scanner input = new Scanner(textfile);
		while(input.hasNext()) {
			String[] line = input.nextLine().split(" ");
			for(String i: line) {
				if(Character.isLetter(i.charAt(0))) {
					list.add(i);
				}
			}
		}
		input.close();
		Collections.sort(list);
		System.out.println(list);
	}

}
