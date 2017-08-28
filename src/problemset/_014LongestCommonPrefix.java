/**
 * 
 */
package problemset;

/**
 * @author Shaishav Jogani <br/>
 *         Created on Aug 27, 2017
 *
 */
public class _014LongestCommonPrefix {
	class Solution {
		public String longestCommonPrefix(String[] strs) {

			String lcm = "";
			int length = strs.length;
			if (length <= 0)
				return lcm;

			if (length == 1)
				return strs[0];

			for (int i = 0; i < strs[0].length(); i++) {
				char l = strs[0].charAt(i);
				boolean set = true;
				for (int j = 1; j < length; j++) {
					if (strs[j].length() == i) {
						set = false;
						break;
					}
					if (l != strs[j].charAt(i)) {
						set = false;
						break;
					}
				}
				if (!set)
					break;
				lcm += l + "";
			}
			return lcm;
		}
	}

}
