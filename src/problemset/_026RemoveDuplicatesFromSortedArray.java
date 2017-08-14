/**
 * 
 */
package problemset;

/**
 * @author Shaishav Jogani <br/>
 *         Created on Aug 13, 2017
 *
 */
public class _026RemoveDuplicatesFromSortedArray {

	public class Solution {
		public int removeDuplicates(int[] A) {
			int length = A.length;
			if (length == 0 || length == 1)
				return length;
			int i = 1;
			for (int j = 1; j < length; j++) {
				if (A[j] != A[j - 1]) {
					A[i] = A[j];
					i++;
				}
			}
			if (i < length)
				A[i] = '\0';
			return i;
		}
	}

}
