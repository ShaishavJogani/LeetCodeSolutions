/**
 * 
 */
package problemset;

/**
 * @author Shaishav Jogani <br/>
 *         Created on Aug 14, 2017
 *
 */
public class _067AddBinary {

	public class Solution {
		public String addBinary(String a, String b) {
			java.math.BigInteger aInt = new java.math.BigInteger(a, 2);
			java.math.BigInteger bInt = new java.math.BigInteger(b, 2);

			return aInt.add(bInt).toString(2);
		}
	}
}
