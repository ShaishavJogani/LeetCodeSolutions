/**
 * 
 */
package problemset;

/**
 * @author Shaishav Jogani 
 * <br/>
 * Created on Aug 10, 2017
 *
 */
public class _004MedianOfTwoSortArray {
	
	public class Solution {
	    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        int l1 = nums1.length;
	        int l2 = nums2.length;
	        int[] sorted = new int[l1+l2];
	        int maxSize = (l1 > l2) ? l1 : l2;
	        int leftindex = 0, rightindex = 0;
	        for(int i = 0; i < l1+l2 ; i++) {
	            if(leftindex>=l1)
	                sorted[i] = nums2[rightindex++];
	            else if(rightindex>=l2)
	                sorted[i] = nums1[leftindex++];
	            else
	                sorted[i] = (nums1[leftindex] < nums2[rightindex]) ? nums1[leftindex++] : nums2[rightindex++];
	        }
	        for(int i = 0; i< sorted.length;i++){
	            System.out.print(" "+sorted[i]);
	        }
	        
	        return median(sorted);
	    }
	    
	    public double median(int[] sorted) {
	        int max = sorted.length;
	        if(max == 1) return sorted[0];
	        if(max%2 == 1)
	            return (double)sorted[(0+max-1+1)/2];
	        else
	            return (double)(sorted[(0+max)/2 - 1] + sorted[(max-1)/2 + 1])/2.0;
	    }
	    
	}

}
