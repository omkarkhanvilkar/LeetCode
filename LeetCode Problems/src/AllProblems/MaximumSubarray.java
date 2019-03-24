package AllProblems;

/*
 * problem : https://leetcode.com/problems/maximum-subarray/
 */

public class MaximumSubarray {
	
	public static int maxSubArray(int[] nums) {
		int[] dp = new int[nums.length];
		dp[0] = nums[0];
		int max = dp[0];
		
		
		for (int i = 1; i < nums.length; i++) {
			dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
			max = Math.max(dp[i], max);
		}
		
		return max;
	}

	public static void main(String[] args) {
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		int res = maxSubArray(arr);
		System.out.println(res);

	}

}
