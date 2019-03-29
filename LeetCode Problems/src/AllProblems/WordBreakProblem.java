package AllProblems;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/*
 * Problem Statement:
 * Given an input string and a dictionary of words, 
 * find out if the input string can be segmented into a space-separated sequence of dictionary words. 
 * See following examples for more details. 
 * This is a famous Google interview question, also being asked by many other companies now a days. *
 * 
 *  https://leetcode.com/problems/word-break/
 */

public class WordBreakProblem {
	
	public static boolean findWord(String S, List<String> dict) {
		Set<String> set = new HashSet(dict);
		
		boolean[] dp = new boolean[S.length() + 1];
		
		dp[0] = true;
		
		for(int i = 1; i <= S.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (dp[j] && set.contains(S.substring(j, i))) {
					dp[i] = true;
					break;
				}
				
			}
		}
		
		return dp[S.length()];	
		
	}

	public static void main(String[] args) {
		String s= "leetcode";
		List<String> dict = new LinkedList<String>();
		dict.add("leet");
		dict.add("code");
		
		System.out.println(findWord(s, dict));

	}

}
