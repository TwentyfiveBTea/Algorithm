package LeetcodeQuestion.PrefixAnd;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/22 20:19
 * @Description: 1480. 一维数组的动态和
 */
public class LeetCode_1480 {
    class Solution {
        public int[] runningSum(int[] nums) {
            int len = nums.length;
            int[] s = new int[len];

            s[0] = nums[0];
            for (int i = 1; i < len; i++) {
                s[i] = s[i - 1] + nums[i];
            }

            return s;
        }
    }
}
