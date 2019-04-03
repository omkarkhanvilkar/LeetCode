package AllProblems;

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}

public class AddTwoNumbers {
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		ListNode dummy = new ListNode(0);
		ListNode p = l1, q = l2, current = dummy;
		int carry = 0;
		
		while(p != null || q != null) {
			int x = p != null ? p.val : 0;
			int y = q != null ? q.val : 0;
			
			int total = x + y + carry;
			carry = total / 10;
			total = total % 10;
			
			current.next = new ListNode(total);
			current = current.next;
			
			if (p != null) p = p.next;
			if (q != null) q = q.next;
		}
		
		if (carry > 0) {
			current.next = new ListNode(carry);
		}
		
		return dummy.next;				
		
	}
	
	public static void main(String[] args) {
		
	}

}
