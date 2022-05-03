package leetcode;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,7};
		rotate(a, 3);
//		rotate(a, 1);
//		rotate(a, 2);
	}
	
	public static void rotate(int[] nums, int k) {
		int[] temp = new int[nums.length];
		int lastIndex = nums.length-1;
		for(int i=0; i<nums.length; i++) {
			if(i+k > nums.length-1)
				temp[(k-1) - (lastIndex-i)] = nums[i];
			else 
				temp[i+k] = nums[i];
		}
		System.out.println(Arrays.toString(temp));
	}
}
