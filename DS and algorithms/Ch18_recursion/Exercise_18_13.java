package Ch18_recursion;

public class Exercise_18_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,4,1,9};
		System.out.println(maxInt(nums));
	}

	public static int maxInt(int[] nums) {
		return max(nums, nums.length-1, 0);
	}
	
	public static int max(int[] nums, int length, int max) {
		if(length == -1)
			return max;
		if(nums[length] > max)
			max = nums[length];
		return max(nums, length-1, max);
	}
}
