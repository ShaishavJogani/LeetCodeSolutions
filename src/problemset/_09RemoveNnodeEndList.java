/**
 * 
 */
package problemset;

/**
 * @author Shaishav Jogani <br/>
 *         Created on Aug 28, 2017
 *
 */
public class _09RemoveNnodeEndList {

	// Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	class Solution {
		public ListNode removeNthFromEnd(ListNode head, int n) {
			ListNode start = new ListNode(0);
			ListNode fast = start;
			ListNode slow = start;
			start.next = head;

			for (int i = 0; i < n + 1; i++)
				fast = fast.next;

			while (fast != null) {
				fast = fast.next;
				slow = slow.next;
			}

			slow.next = slow.next.next;

			return start.next;
		}
	}

}
