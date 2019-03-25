package AllProblems;

/*
 * problem: https://leetcode.com/problems/reverse-string/
 */

public class ReverseString {

	public static void main(String[] args) {
		char[] s = {'p','h','e','l','l','o'};
		int i = 0;
		int j = s.length -1;
		
		while (i <= j) {
			char tmp = s[j];
			s[j--] = s[i];
			s[i++] = tmp;
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		System.out.println(sb.toString());
	}

}
