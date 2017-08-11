/**
 * 
 */
package problemset;

/**
 * @author Shaishav Jogani 
 * <br/>
 * Created on Aug 11, 2017
 *
 */
public class _007ReverseInteger {
	
	public class Solution {
	    public int reverse(int x) {
	        
	        boolean isNegative = (x>=0) ? false : true;
	        
	        if(isNegative) x = x* (-1);
	        
	        int reverse = 0;
	        while(x!=0) {
	            int temp = x%10;
	            if (reverse != 0 && 10 > Integer.MAX_VALUE / reverse) {
	                // Overflow 
	                return 0;
	            }
	            reverse = reverse*10 + temp;
	            x = x/10;
	        }
	        
	        
	        if(isNegative) reverse = reverse* (-1);
	        
	        return reverse;
	        
	    }
	}

}
