package AllProblems;

/*
 * problem: https://leetcode.com/problems/move-zeroes/
 */

public class MoveZeroes {

	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		int count = 0;
		
		for(int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				count++;
				continue;
			}
			
			if (count > 0) {
				nums[i - count] = nums[i];
				nums[i] = 0;
			}
			
		}
		
		for(int i: nums) System.out.println(i);
		
		
		/*
		 * Other solutions:
		 * int j = 0;
		    for(int i = 0; i < nums.length; i++) {
		        if(nums[i] != 0) {
		            int temp = nums[j];
		            nums[j] = nums[i];
		            nums[i] = temp;
		            j++;
		        }
		    }
		 * 
		 * 
		 * 
		 * if (nums == null || nums.length == 0) return;        

		    int insertPos = 0;
		    for (int num: nums) {
		        if (num != 0) nums[insertPos++] = num;
		    }        
		
		    while (insertPos < nums.length) {
		        nums[insertPos++] = 0;
		    }
		 */

	}

}
