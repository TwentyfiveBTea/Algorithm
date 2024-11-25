package LeetcodeQuestion.SlideTheWindow;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/24 18:16
 * @Description: 643. 子数组最大平均数 I
 */
public class LeetCode_643 {
    class Solution {
        public double findMaxAverage(int[] nums, int k) {
            double ans = Integer.MIN_VALUE;
            int l = 0;
            int r = 0;
            int len = nums.length;
            double cnt = 0.0;

            while (r < len) {
                cnt += nums[r];

                if (r - l + 1 == k) {
                    ans = Math.max(ans, cnt / k);
                    cnt -= nums[l];
                    l++;
                }
                r++;
            }

            return ans;
        }
    }
}
