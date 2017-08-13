/**
 * 
 */
package weekly_contests_45;

/**
 * @author Shaishav Jogani 
 * <br/>
 * Created on Aug 12, 2017
 * <br/>
 * 
 *  Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.

The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.
<br/>
<b>Example 1:</b>
<br/>
Input: "UD"<br/>
Output: true<br/>
<br/>
<b>Example 2:</b><br/>

Input: "LL"<br/>
Output: false<br/>

 *
 */
public class Judge_Route_Circle {

	public class Solution {
	    public boolean judgeCircle(String moves) {
	        int countTop = 0;
	        int countSide = 0;
	        int length = moves.length();
	        for ( int i = 0; i< length ; i++) {
	            if(moves.charAt(i) == 'U')
	            	countTop = countTop +1;
	            if(moves.charAt(i) == 'D')
	            	countTop = countTop -1;
	            else if( moves.charAt(i) == 'L')
	            	countSide = countSide +1;
	            else if(moves.charAt(i) == 'R')
	            	countSide = countSide -1;
	        }
	        
	        if(countTop == 0 && countSide==0)
	        	return true;
	        else return false;
	    }
	}
	
	
}
