/**
 * 
 */
package problemset;

/**
 * @author Shaishav Jogani 
 * <br/>
 * Created on Aug 13, 2017
 *
 */
public class _035SearchInsertPosition {
	
	public class Solution {
	    public int searchInsert(int[] nums, int target) {
	        for(int i=0 ; i<nums.length ; i++) {
	            if(nums[i] >= target)
	                return i;
	        }
	        return nums.length;
	    }
	}

}
