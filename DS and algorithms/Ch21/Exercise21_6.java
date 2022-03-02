package Ch21;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/**********************************************************************************
* (Count the occurrences of numbers entered) Write a program that reads an        *
* unspecified number of integers and finds the one that has the most occurrences. *
* The input ends when the input is 0. For example, if you entered 2 3 40 3 5 4 –3 *
* 3 3 2 0, the number 3 occurred most often. If not one but several numbers have  *
* the most occurrences, all of them should be reported. For example, since 9 and  *
* 3 appear twice in the list 9 30 3 9 3 2 4, both occurrences should be reported. *
**********************************************************************************/
import java.util.Scanner;

public class Exercise21_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number of intevers. Input ends when the input is 0.");
		Integer input;
		Map<Integer, Integer> map = new HashMap<>();

		do {
			input = in.nextInt();
			// checks if value is already in the map and increases the count if it is
			if (map.containsKey(input)) {
				map.put(input, map.get(input) + 1);
			} else
				map.put(input, 1);
		} while (input != 0);

		int max = Collections.max(map.values());
		System.out.println("The highest number of occurence is ");
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == max)
				System.out.println(entry.getKey() + " ");
		}
	}

}
