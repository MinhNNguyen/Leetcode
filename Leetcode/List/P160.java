// 09/14/2017
// 160. Intersection of Two Linked Lists
// Runtime of solution: O(n+m) - Space: O(1)


public class P160 {
	
	/**
	 * Definition for singly-linked list.
	 */ 
	public class ListNode {
		int val;
	    ListNode next;
	    ListNode(int x) {
	    	val = x;
	    	next = null;
	    }
	}
	
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	     if (headA == null || headB == null)
	         return null;
	     ListNode a = headA;
	     ListNode b = headB;
	        
	     while (a != b)
         {
             a = a == null ? headB : a.next;
	         b = b == null ? headA : b.next;
	     }
	     return a;
	 }

}
