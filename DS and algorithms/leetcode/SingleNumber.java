package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.
Example 1:
Input: nums = [2,2,1]
Output: 1*/
public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {2,2,1};
		int[] arr2 = {4,1,2,1,2};
		int[] arr3 = {2,2,1,5,7,1,5};
		
		System.out.println(singleNumber(ar));
		System.out.println(singleNumber(arr2));
		System.out.println(singleNumber(arr3));
		System.out.println(isAnagram("aacc", "ccac"));
	}
	public static int singleNumber(int[] nums) {
		if(nums.length == 1)
			return nums[0];

		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i:nums) {
			if(!map.containsKey(i))
				map.put(i, 1);
			else
				map.put(i,  map.get(i)+1);
		}
		
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue() == 1)
				return entry.getKey();
		}
		return 0;
	}
	
	public static boolean isAnagram(String s, String t) {
		if(s.length() != t.length())
			return false;
		String word = s;
		for(Character c: t.toCharArray()) {
			int i = s.indexOf(c);
			if(i == -1)
				return false;
			s = s.substring(0,i) + s.substring(i+1, s.length());
		}
		return s.isEmpty();
	}
}
