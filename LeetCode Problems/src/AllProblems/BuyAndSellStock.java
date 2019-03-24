package AllProblems;

/*
 * problem: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */

public class BuyAndSellStock {
	
	public static int maxProfit(int[] prices) {
		int min = Integer.MAX_VALUE;
		int profit = 0;
		
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < min) {
				min = prices[i];
			}
			else if (prices[i] - min > profit){
				profit = prices[i] - min;
			}			
		}
		
		return profit;
		
	}

	public static void main(String[] args) {
		int[] arr = {7,1,5,3,6,4};
		System.out.println(maxProfit(arr));
		
		int[] arr1 = {7,6,4,3,1};
		System.out.println(maxProfit(arr1));
		
		int[] arr2 = {1,2};
		System.out.println(maxProfit(arr2));

	}

}
