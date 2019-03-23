package AllProblems;

import java.util.HashMap;
import java.util.Map;

/*
 * 
 * Problem: https://leetcode.com/problems/two-sum/
 */

public class TwoSum {
	
	public static int[] twoSum(int[] nums, int target) {
		Map <Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i};
			}
			map.put(nums[i], i);
			
		}
		
        throw new IllegalArgumentException("No two sum found");
    }

	public static void main(String[] args) {
		int[] arr = {2,7,11,15};
		int[] res = twoSum(arr, 9);
		System.out.println(res[0] + ", " + res[1] );
		
		arr = new int[] {4,17,21,30};
		res = twoSum(arr, 51);
		System.out.println(res[0] + ", " + res[1] );

	}

}
