package AllProblems;

import java.util.HashSet;
import java.util.Set;

/*
 * 
 * problem : https://leetcode.com/problems/jewels-and-stones/
 */

public class JewelsAndStones {
	public static int numJewelsInStones(String J, String S) {
		
		int count = 0;
		Set<Character> set = new HashSet<Character>();

		for(char ch : J.toCharArray()) set.add(ch);
		
		for(char ch : S.toCharArray()) {
			if(set.contains(ch)) {
				count++;
			}
		}
		
		return count;
		
	}
	
	public static void main(String[] args) {
		System.out.println(numJewelsInStones("aA", "aAAbbbb"));
		System.out.println(numJewelsInStones("z", "ZZ"));
	}
}
