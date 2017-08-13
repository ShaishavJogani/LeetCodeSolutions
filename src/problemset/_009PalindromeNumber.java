/**
 * 
 */
package problemset;

/**
 * @author Shaishav Jogani 
 * <br/>
 * Created on Aug 12, 2017
 *
 */
public class _009PalindromeNumber {
	
	public class Solution {
	    public boolean isPalindrome(int number) {
	        int x = number;
	        boolean isNegative = (x>=0) ? false : true;
		        
		        if(isNegative) return false;
		        
		        int reverse = 0;
		        while(x!=0) {
		            int temp = x%10;
		            if (reverse != 0 && 10 > Integer.MAX_VALUE / reverse) {
		                // Overflow 
		                return false;
		            }
		            reverse = reverse*10 + temp;
		            x = x/10;
		        }
		               
		        if(reverse == number)  
	                return true;
	            else 
	                return false;
	    }
	}

}
