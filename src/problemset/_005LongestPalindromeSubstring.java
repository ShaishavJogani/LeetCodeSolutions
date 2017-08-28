/**
 * 
 */
package problemset;

/**
 * @author Shaishav Jogani 
 * <br/>
 * Created on Aug 27, 2017
 *
 */
public class _005LongestPalindromeSubstring {
	
	class Solution {
	    int max=0, li=0;
	    public String longestPalindrome(String s) {
	        
	        if(s == null) return null;
	        if(s.length() == 1) return s;
	        
	        int length = s.length();
	        
	        for(int i=0 ; i<length ; i++) {
	            extend(i, i, s);
	            extend(i, i+1, s);
	        }
	        
	        return s.substring(li, li+max);
	    }
	    
	    
	    private void extend(int lower, int upper, String s) {
	        
	        while(lower >=0 && upper<s.length() && s.charAt(lower)==s.charAt(upper)) {
	            lower--;
	            upper++;
	        }
	        
	        if(max < upper - lower -1) {
	            li = lower+1;
	            max = upper - lower -1;
	        }
	        
	    }
	    
	}

}
