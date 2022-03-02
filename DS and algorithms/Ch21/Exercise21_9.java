package Ch21;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*********************************************************************************
* (Guess the capitals using maps) Rewrite Programming Exercise 8.37 to store     *
* pairs of each state and its capital in a map. Your program should prompt the   *
* user to enter a state and should display the capital for the state             *
*********************************************************************************/
public class Exercise21_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> capitals = new HashMap<>(getData());
		System.out.println("Enter a state:");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		if(capitals.get(input) != null)
			System.out.println("The capital of state "+input+" is "+capitals.get(input));
	}
	//method for exercise 8.37
	public static boolean isEqual(String a, String b) {
		if(a.length() != b.length())
			return false;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i) != b.charAt(i))
				return false;
		}
		return true;
	}
	public static Map<String,String> getData(){
		String[][] list = {
				{"Alabama", "Montgomery"}, {"Alaska", "Juneau"}, {"Arizona", "Phoenix"},
				{"Arkansas", "Little Rock"}, {"California", "Sacramento"},
				{"Colorado", "Denver"}, {"Connecticut", "Hartford"},
				{"Delaware", "Dover"}, {"Florida", "Tallahassee"},
				{"Georgia", "Atlanta"},{"Hawaii", "Honolulu"}, {"Idaho", "Boise"},
				{"Illinois", "Springfield"}, {"Indiana", "Indianapolis"},
				{"Iowa Des", "Moines"}, {"Kansas", "Topeka"}, {"Kentucky","Frankfort"},
				{"Louisiana", "Baton Rouge"}, {"Maine", "Augusta"},
				{"Maryland", "Annapolis"}, {"Massachusetts", "Boston"},
				{"Michigan", "Lansing"}, {"Minnesota", "Saint Paul"},
				{"Mississippi", "Jackson"}, {"Missouri", "Jefferson City"},
				{"Montana", "Helena"}, {"Nebraska", "Lincoln"},
				{"Nevada	", "Carson City"}, {"New Hampshire", "Concord"},
				{"New Jersey", "Trenton"}, {"New Mexico", "Santa Fe"},
				{"New York", "Albany"}, {"North Carolina", "Raleigh"},
				{"North Dakota", "Bismarck"},{"Ohio", "Columbus"},
				{"Oklahoma", "Oklahoma City"}, {"Oregon", "Salem"},
				{"Pennsylvania", "Harrisburg"}, {"Rhode Island", "Providence"},
				{"South Carolina", "Columbia"}, {"South Dakota", "Pierre"},
				{"Tennessee", "Nashville"}, {"Texas", "Austin"},
				{"Utah", "Salt Lake City"}, {"Vermont", "Montpelier"},
				{"Virginia", "Richmond"}, {"Washington", "Olympia"},
				{"West Virginia", "Charleston"}, {"Wisconsin", "Madison"},
				{"Wyoming", "Cheyenne"}};
		Map<String,String> map = new HashMap<>();
		for (String[] element : list) {
			map.put(element[0], element[1]);
		}
		return map;
	}
}
