package LeetcodeDailyQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/30 12:33
 * @Description: 3232. 判断是否可以赢得数字游戏
 */
public class Code241130 {
    class Solution {
        public boolean canAliceWin(int[] nums) {
            int n = nums.length;
            int a = 0;
            int b = 0;

            for (int i = 0; i < n; i++) {
                if (nums[i] < 10) {
                    a += nums[i];
                } else {
                    b += nums[i];
                }
            }

            if (a == b) {
                return false;
            }

            return
        }
    }
}
