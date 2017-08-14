/**
 * 
 */
package problemset;

/**
 * @author Shaishav Jogani <br/>
 *         Created on Aug 13, 2017
 *
 */
public class _027RemoveElement {

	public class Solution {
		public int removeElement(int[] nums, int val) {
			int length = nums.length;

			if (length == 0)
				return length;

			int index = 0;
			for (int i = 0; i < length; i++) {
				if (nums[i] != val) {
					nums[index] = nums[i];
					index++;
				}
			}

			if (index < length)
				nums[index] = '\0';

			return index;

		}
	}

}
