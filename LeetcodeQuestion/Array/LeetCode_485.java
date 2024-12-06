package LeetcodeQuestion.Array;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/6 14:23
 * @Description: 485. 最大连续 1 的个数
 */
public class LeetCode_485 {
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int n = nums.length;
            int ans = Integer.MIN_VALUE;
            int count = 0;

            for (int i = 0; i < n; i++) {
                if (nums[i] == 1) {
                    count++;
                } else {
                    count = 0;
                }
                ans = Math.max(ans, count);
            }

            return ans;
        }
    }
}
