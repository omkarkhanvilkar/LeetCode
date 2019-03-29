package AllProblems;

/*
 * Problem: https://leetcode.com/problems/backspace-string-compare/
 */

public class BackspaceStringCompare {
	
	public static String CleanString(String S) {
		char[] arr = S.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < arr.length -1; i++) {
			if(arr[i] == '#' || arr[i+1] == '#') {
				continue;
			}
			else {
				sb.append(arr[i]);
			}
		}
		
		return sb.length() > 0 ? sb.toString(): "";
	}

	public static void main(String[] args) {
		String S = "ab#c";
		String T = "ad#c";
		
		S = CleanString(S);
		T = CleanString(T);
		
		if (S == T) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		

	}

}
