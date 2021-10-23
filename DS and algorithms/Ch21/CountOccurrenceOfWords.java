package Ch21;

import java.util.*;
public class CountOccurrenceOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Good morning. Have a good class. " +
			      "Have a good visit. Have fun!";
		
		Map<String, Integer> map = new TreeMap<>();
		String[] words = text.split("[\\s+\\p{P}]");
		for(int i=0; i<words.length;i++) {
			String key = words[i].toLowerCase();
			if(key.length() >0) {
				if(!map.containsKey(key)) {
					map.put(key, 1);
				}else {
					int value = map.get(key);
					value++;
					map.put(key,  value);
				}
			}
		}
		System.out.println("Each word and its occurence:\n"+map);
	}

}
