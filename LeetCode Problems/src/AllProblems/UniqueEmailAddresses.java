package AllProblems;

import java.util.HashSet;
import java.util.Set;

/*
 * Problem: https://leetcode.com/problems/unique-email-addresses/
 */

public class UniqueEmailAddresses {
	
	public static int numUniqueEmails(String[] emails) {
		Set<String> set = new HashSet<String>();
		
		for(String s : emails) {
			int index = s.indexOf('@');
			String pre = s.substring(0, index);
			String post = s.substring(index);
			
			if (pre.contains("+")) {
				pre = pre.substring(0, pre.indexOf('+'));
			}
			pre = pre.replaceAll("\\.", "");
			set.add(pre + post);
		}
		
		
		return set.size();
		
	}
	
	public static void main(String[] args) {
		String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		
//		System.out.println("Count: " + numUniqueEmails(emails));
		
		emails = new String[] {"testemail@leetcode.com","testemail1@leetcode.com","testemail+david@lee.tcode.com"};
		System.out.println("Count: " + numUniqueEmails(emails));
	}

}
