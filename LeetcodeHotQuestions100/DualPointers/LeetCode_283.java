package LeetcodeHotQuestions100.DualPointers;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/26 10:13
 * @Description: 283. 移动零
 */
public class LeetCode_283 {
    class Solution {
        public void moveZeroes(int[] nums) {
            int j = 0;
            int len = nums.length;

            for (int i = 0; i < len; i++) {
                if (nums[i] != 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    j++;
                }
            }
        }
    }
}
