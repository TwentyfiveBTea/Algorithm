package LeetcodeQuestion.PrefixAnd;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/22 18:52
 * @Description: 724. 寻找数组的中心下标
 */
public class LeetCode_724 {
    class Solution {
        public int pivotIndex(int[] nums) {
            int len = nums.length;
            int[] s1 = new int[len + 1];
            int[] s2 = new int[len + 1];

            for (int i = 1; i <= len; i++) {
                s1[i] = s1[i - 1] + nums[i - 1];
            }

            for (int i = len - 1; i >= 0; i--) {
                s2[i] = s2[i + 1] + nums[i];
            }

            for (int i = 0; i < len; i++) {
                if (s1[i] == s2[i + 1]) {
                    return i;
                }
            }

            return -1;
        }
    }
}
