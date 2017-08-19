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
public class _066PlusOne {
	
	public class Solution {
	    public int[] plusOne(int[] digits) {
	        if(digits == null) return null;
	            
	        int carry=0;
	        digits[digits.length-1] = digits[digits.length-1]+1;
	        
	        for(int i= digits.length-1 ; i>=0; i--) {
	            int temp = carry + digits[i];
	            
	            if(temp>=10) {
	                carry = 1;
	            } else {
	                carry = 0;
	            }
	            digits[i] = temp%10;
	        }
	        
	        
	        if(carry == 0)
	            return digits;
	        
	        int answer[] = new int[digits.length+1];
	        for(int i = 0 ; i<digits.length ; i++) {
	            answer[i+1] = digits[i];
	        }
	        answer[0]=carry;
	        
	        
	     
	        
	        return answer;
	    }
	}

}
