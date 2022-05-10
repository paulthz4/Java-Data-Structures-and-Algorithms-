package leetcode;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class FirstUniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstUniqChar("leetcode"));
	}

	public static int firstUniqChar(String s) {
		char[] arr = s.toCharArray();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for(Character c: arr) {
			if(!map.containsKey(c))
				map.put(c, 1);
			else if(map.containsKey(c))
				map.put(c, map.get(c)+1);
		}
		System.out.println(map.toString());
		for(Character c : arr){
			if(map.get(c) == 1)
				return s.indexOf(c);
		}
		
		return s.indexOf(' ');
	}
}
