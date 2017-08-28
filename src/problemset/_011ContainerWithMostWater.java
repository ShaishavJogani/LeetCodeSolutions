/**
 * 
 */
package problemset;

/**
 * @author Shaishav Jogani <br/>
 *         Created on Aug 27, 2017
 *
 */
public class _011ContainerWithMostWater {
	class Solution {
		public int maxArea(int[] height) {

			int left = 0, right = height.length - 1;
			int maxArea = 0;

			while (left < right) {
				maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
				if (height[left] < height[right])
					left++;
				else
					right--;
			}

			return maxArea;
		}
	}
}
