package LeetCode_BiweeklyContest._150th;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/15 22:41
 * @Description: Q1. 好数字之和
 */
public class Q1 {
    class Solution {
        public int sumOfGoodNumbers(int[] nums, int k) {
            int ans = 0;
            int len = nums.length;

            for (int i = 0; i < len; i++) {
                boolean boo1 = true, boo2 = true;
                if (i - k >= 0 && nums[i] <= nums[i - k]) {
                    boo1 = false;
                }
                if (i + k < len && nums[i] <= nums[i + k]) {
                    boo2 = false;
                }

                if (boo1 && boo2) {
                    ans += nums[i];
                }
            }
            return ans;
        }
    }
}
