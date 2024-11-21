package LeetcodeHotQuestions100;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/19 13:45
 * @Description: 241119
 */
public class Code241119 {


    /**
     * @Description: 1. 两数之和
     * @Method: 数组
     */
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }

            return new int[]{0};
        }
    }
}
