/*
 *  10/03/2017
 *  Problem 83. Remove Duplicates from Sorted List
 *  Runtime O(n) Space O(1)
 */

public class P83 {
	/**
	 * Definition for singly-linked list.
	 */
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	class Solution {
	    public ListNode deleteDuplicates(ListNode head) {
	        if (head == null || head.next == null)
	            return head;
	        ListNode prev = head;
	        ListNode cur = head.next;
	        while (cur != null) {
	            if (cur.val != prev.val) {
	                prev.next = cur;
	                prev = cur;
	            }
	            cur = cur.next;
	        }
	        prev.next = null;
	        return head;
	    }
	}
}
