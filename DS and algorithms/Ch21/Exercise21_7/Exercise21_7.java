package Ch21.Exercise21_7;
/*********************************************************************************
* (Revise Listing 21.9, CountOccurrenceOfWords.java) Rewrite Listing 21.9 to     *
* display the words in ascending order of occurrence counts.                     *
*                                                                                *
* (Hint: Create a class named WordOccurrence that implements the Comparable      *
* interface. The class contains two fields, word and count. The compareTo method *
* compares the counts. For each pair in the hash set in Listing 21.9, create an  *
* instance of WordOccurrence and store it in an array list. Sort the array list  *
* using the Collections.sort method. What would be wrong if you stored the       *
* instances of WordOccurrence in a tree set?)                                    *
*********************************************************************************/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Exercise21_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set text in a string
	    String text = "Good morning. Have a good class. " +
	      "Have a good visit. Have fun!";

	    // Create a TreeMap to hold words as key and count as value
	    Map<String, Integer> map = new TreeMap<>();

	    String[] words = text.split("[\\s+\\p{P}]");
	    for (String word : words) {
	      String key = word.toLowerCase();

	      if (key.length() > 0) {
	        if (!map.containsKey(key)) {
	          map.put(key, 1);
	        }
	        else {
	          int value = map.get(key);
	          value++;
	          map.put(key, value);
	        }
	      }
	    }
	    ArrayList<WordOccurrence> list = new ArrayList<>();
	    for(Map.Entry<String,Integer> entry: map.entrySet()) {
	    	list.add(new WordOccurrence(entry.getKey(),entry.getValue()));
	    }
	    Collections.sort(list);
	    // Display key and value for each entry
	    System.out.println(list);
	}

}
