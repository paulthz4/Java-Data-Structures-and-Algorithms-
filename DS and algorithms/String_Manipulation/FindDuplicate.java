package String_Manipulation;

import java.util.Arrays;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,4,2,2};
		System.out.println(Arrays.toString(arr));
		System.out.println(findDuplicate(arr));
		int[] arr2 = {3,1,3,4,2};
		System.out.println(Arrays.toString(arr2));
		System.out.println(findDuplicate(arr2));
	}

	public static int findDuplicate(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i != j)
					if (nums[i] == nums[j])
						return nums[j];
			}
		}
		return -1;
	}
}
