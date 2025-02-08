package LeetcodeDailyQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/09 0:15
 * @Description: 80. 删除有序数组中的重复项 II
 */
public class Code250209 {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int size = 2;
            for (int i = 2; i < nums.length; i++) {
                if (nums[i] == nums[size - 2]) {
                    continue;
                }
                nums[size++] = nums[i];
            }
            return Math.min(size, nums.length);
        }
    }
}
