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
public class _053LengthOfSubArray {
	
	public class Solution {
	    public int lengthOfLastWord(String s) {
	        
	        if(s == null) return 0;
	        
	        s=s.trim();
	        String[] words = s.split(" ");
	        return words[words.length-1].length();
	        
	    }
	}

}
