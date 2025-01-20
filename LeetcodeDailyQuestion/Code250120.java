package LeetcodeDailyQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/01/20 23:54
 * @Description: 2239. 找到最接近 0 的数字
 */
public class Code250120 {
    class Solution {
        public int findClosestNumber(int[] nums) {
            int ans = nums[0];
            for (int num : nums) {
                if (Math.abs(num) < Math.abs(ans) || Math.abs(num) == Math.abs(ans) && num >= 0) {
                    ans = num;
                }
            }
            return ans;
        }
    }
}
