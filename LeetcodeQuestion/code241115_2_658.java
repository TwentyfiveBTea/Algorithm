package LeetcodeQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/15 20:10
 * @Description: 658. 找到 K 个最接近的元素
 * @Method: 滑动窗口
 */
public class code241115_2_658 {
    class Solution {
        public double findMaxAverage(int[] nums, int k) {
            double ans = Integer.MIN_VALUE;
            int l = 0;
            int r = 0;
            double count = 0;

            while (r < nums.length) {
                count += nums[r];

                if (r - l + 1 == k) {
                    ans = Math.max(ans, count / k);
                    count -= nums[l++];
                }
                r++;
            }

            return ans;
        }
    }
}
