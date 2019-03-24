package AllProblems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * 
 * problem : https://leetcode.com/problems/subdomain-visit-count/
 * 
 */

public class SubdomainVisitCount {
	
	public static List<String> subdomainVisits(String[] cpdomains) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		List<String> res = new LinkedList<String>();
		
		for(String str: cpdomains) {
			int count = Integer.parseInt(str.split("\\s+")[0]);
			String domain = str.split("\\s+")[1];
			map.put(domain, count);
			
			while(domain.indexOf('.') != -1) {
				domain = domain.substring(domain.indexOf('.') + 1);			
				map.put(domain, map.getOrDefault(domain, 0) + count);
			}
		}
		
		for(String key : map.keySet()) {
			StringBuilder sb = new StringBuilder();
			sb.append(map.get(key));
			sb.append(" "+ key);
			res.add(sb.toString());
		}
		
		return res;
	}

	public static void main(String[] args) {
		String[] cpd = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
		subdomainVisits(cpd);
		System.out.println();

	}

}
