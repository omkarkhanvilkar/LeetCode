package AllProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
 * Problem: https://leetcode.com/problems/valid-parentheses/
 */

public class ValidParentheses {
	
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put(')', '(');
		map.put('}', '{');
		map.put(']', '[');
		
		for(char ch : s.toCharArray()) {
			
			if (map.containsKey(ch)) {
				char tos = stack.isEmpty() ? '#': stack.pop();
				if (tos != map.get(ch)) {
					return false;
				}
			}
			else {
				stack.push(ch);
			}
		}
		
		return stack.isEmpty();		
		
	}

	public static void main(String[] args) {
		System.out.println(isValid("()"));
		System.out.println(isValid("()[]{}"));
		System.out.println(isValid("(]"));
		System.out.println(isValid("([)]"));
		System.out.println(isValid("{[]}"));
		
	}

}
