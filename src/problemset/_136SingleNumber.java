/**
 * 
 */
package problemset;

/**
 * @author Shaishav Jogani 
 * <br/>
 * Created on Aug 14, 2017
 *
 */
public class _136SingleNumber {
	
	public class Solution {
	    public int singleNumber(int[] nums) {
	        if(nums == null) return 0;
	        int result = 0;
	        
	        for(int i = 0 ; i<nums.length ; i++) {
	            result = result^nums[i];
	        }
	        
	        return result;
	    }
	}

}
