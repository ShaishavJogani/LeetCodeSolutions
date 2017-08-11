package problemset;

import java.util.ArrayList;

/**
 * 
 * @author Shaishav Jogani <br />
 *
 * Created on Aug 10, 2017
 *
 */
public class _002AddTwoNumbers {
	
	 // Definition for singly-linked list.
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	 
	public class Solution {
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ArrayList<ListNode> start = new ArrayList();
	        int carry = 0,i=0;
	        do {
	            int temp;
	            if(l1 == null && l2 !=null) {
	                temp = carry + l2.val;
	                l2 = l2.next;
	            } else if(l1 != null && l2 ==null) {
	                temp = carry + l1.val;
	                l1 = l1.next;
	            }
	            else {
	                temp = carry + l1.val + l2.val;
	                l1 = l1.next;
	                l2 = l2.next;
	            }
	            if(temp>=10) {
	                carry =(int) temp / 10;
	                temp = temp % 10;
	            } else 
	                carry = 0;
	           
	            start.add(i, new ListNode(temp));
	            if(i>=1) {
	                // ListNode tempNode = start.get(i-1);
	                // tempNode.next = start.get(i);
	                // start.set(i-1, tempNode);
	                
	                start.get(i-1).next = start.get(i);
	            }
	            i++;
	        } while( l1 != null || l2 != null );
	        
	        if(carry > 0) {
	            start.add(i, new ListNode(carry));
	            start.get(i-1).next = start.get(i);
	        }
	            
	        
	        return start.get(0);
	    }
	}
}
