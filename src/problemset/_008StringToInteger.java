/**
 * 
 */
package problemset;

/**
 * @author Shaishav Jogani <br/>
 *         Created on Aug 12, 2017
 *
 */
public class _008StringToInteger {

	public class Solution {
		public int myAtoi(String str) {
			double result = 0;
			double sign = 1;

			str = str.trim();

			if (str.length() == 0)
				return 0;

			if (str.charAt(0) == '-') {
				sign = -1;
				str = str.substring(1, str.length());
			} else if (str.charAt(0) == '+') {
				str = str.substring(1, str.length());
			}

			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ' ' || str.charAt(i) == '\0')
					break;
				if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
					// 48 is the ASCII value of '0'
					result = result * 10 + (str.charAt(i) - 48); 
				} else
					break;
			}

			result = result * sign;
			if (result > Integer.MAX_VALUE)
				return Integer.MAX_VALUE;
			if (result < Integer.MIN_VALUE)
				return Integer.MIN_VALUE;
			return (int) (result);

		}
	}

}
