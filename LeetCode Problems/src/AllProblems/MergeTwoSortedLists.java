package AllProblems;

import java.util.Iterator;

/*
 * problem: https://leetcode.com/problems/merge-two-sorted-lists/
 */

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class MergeTwoSortedLists {
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		ListNode head = dummy;
				
		ListNode one = l1;
		ListNode two = l2;
		
		while(one != null && two != null) {
			if (one.val <= two.val) {
				head.next = one;
				one = one.next;
			}
			else {
				head.next = two;
				two = two.next;
			}
			head = head.next;			
		}
		
		head.next = one == null ? two:one;
		
		
		return dummy.next;
	}

	public static void main(String[] args) {
		
		ListNode L1 = new ListNode(1);
		L1.next = new ListNode(2);
		L1.next.next = new ListNode(4);
		
		ListNode L2 = new ListNode(1);
		L2.next = new ListNode(3);
		L2.next.next = new ListNode(4);
		
		ListNode res = mergeTwoLists(L1, L2);
		while(res.next != null) {
			System.out.println(res.val);
			res = res.next;
		}
		
	}

}
