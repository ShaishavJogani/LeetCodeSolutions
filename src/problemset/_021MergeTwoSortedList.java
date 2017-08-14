/**
 * 
 */
package problemset;

import java.util.ArrayList;

/**
 * @author Shaishav Jogani 
 * <br/>
 * Created on Aug 13, 2017
 *
 */
public class _021MergeTwoSortedList {
	
	 // Definition for singly-linked list.
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	 
	public class Solution {
	    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        ArrayList<ListNode> merger = new ArrayList();
	        
	        if(l1 == null && l2 == null)  return null;
	        if(l1 == null) return l2;
	        if(l2 == null) return l1;
	        
	        
	        if(l1.val <= l2.val) {
	            merger.add(new ListNode(l1.val));
	            l1 = l1.next;
	        } else {
	            merger.add(new ListNode(l2.val));
	            l2 = l2.next;
	        }
	        
	        for(int i = 1; ; i++) {
	            if(l1 == null && l2 == null)    
	                break;
	            
	            if(l1 == null) {
	                merger.add(i, new ListNode(l2.val));
	                merger.get(i-1).next = merger.get(i);
	                l2 = l2.next;
	            } else if(l2 == null) {
	                merger.add(i, new ListNode(l1.val));
	                merger.get(i-1).next = merger.get(i);
	                l1 = l1.next;
	            } else {
	                if(l1.val <= l2.val) {
	                    merger.add(i, new ListNode(l1.val));
	                    merger.get(i-1).next = merger.get(i);
	                    l1 = l1.next;
	                } else {
	                    merger.add(i, new ListNode(l2.val));
	                    merger.get(i-1).next = merger.get(i);
	                    l2 = l2.next;
	                }
	            }
	            
	        }
	        
	        return merger.get(0);
	        
	    }
	}

}
