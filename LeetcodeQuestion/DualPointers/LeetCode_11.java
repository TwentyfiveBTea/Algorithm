package LeetcodeQuestion.DualPointers;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/25 17:27
 * @Description: 11. 盛最多水的容器
 */
public class LeetCode_11 {
    class Solution {
        public int maxArea(int[] height) {
            int len = height.length;
            int l = 0;
            int r = len - 1;
            int sum = 0;
            int ans = 0;

            while (l < r) {
                sum = (r - l) * Math.min(height[l], height[r]);
                ans = Math.max(ans, sum);

                if (height[l] < height[r]) {
                    l++;
                } else {
                    r--;
                }
            }

            return ans;
        }
    }
}
