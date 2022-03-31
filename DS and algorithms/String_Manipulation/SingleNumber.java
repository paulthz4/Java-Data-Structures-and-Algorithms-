package String_Manipulation;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,1,2,1,2};
		System.out.println(singleNumber(arr));
	}

	public static int singleNumber(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			}
			else map.put(nums[i], 1);
		}
		System.out.println(map);
		for (int i = 0; i < map.size(); i++) {
			if(map.get(i) != null)
				if (map.get(i).equals(1))
				return map.get(i);
		}
		return -1;
	}
}
