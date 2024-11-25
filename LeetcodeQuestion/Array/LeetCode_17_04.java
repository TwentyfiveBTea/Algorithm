package LeetcodeQuestion.Array;

import java.util.Arrays;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/18 21:32
 * @Description: 17.04. 消失的数字
 */
public class LeetCode_17_04 {
    class Solution {
        public int missingNumber(int[] nums) {
            int ans = 0;
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != i) {
                    return i;
                }
            }
            return nums.length;
        }
    }
}
