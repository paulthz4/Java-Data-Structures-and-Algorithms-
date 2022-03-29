package String_Manipulation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,4,2,2};
		System.out.println(Arrays.toString(arr));
		System.out.println(findDuplicate(arr));
		int[] arr2 = {3,1,3,4,2};
		System.out.println(Arrays.toString(arr2));
		System.out.println(findDuplicateMap(arr2));
	}

	public static int findDuplicateMap(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<nums.length;i++) {
			if(map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i])+1);
				return nums[i];
			}
			map.put(nums[i], 1);
		}
		return -1;
	}
	
	public static int findDuplicate(int[] nums) {
		for(int i=0; i<nums.length;i++) {
			for(int j=0;j<nums.length;j++) {
				if( i != j) {
					if(nums[i] == nums[j])
						return nums[i];
				}
			}
		}
		return -1;
	}
}
