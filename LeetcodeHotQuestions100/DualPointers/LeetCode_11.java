package LeetcodeHotQuestions100.DualPointers;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/26 10:19
 * @Description: 11. 盛最多水的容器
 */
public class LeetCode_11 {
    class Solution {
        public int maxArea(int[] height) {
            int n = height.length;
            int l = 0, r = n - 1;
            int max = 0;

            while (l < r) {
                max = Math.max(max, Math.min(height[l], height[r]) * (r - l));

                if (height[l] < height[r]) {
                    l++;
                } else {
                    r--;
                }
            }

            return max;
        }
    }
}
