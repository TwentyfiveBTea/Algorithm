package LeetcodeDailyQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/04 1:00
 * @Description: 922. 按奇偶排序数组 II
 */
public class Code250204 {
    class Solution {
        public int[] sortArrayByParityII(int[] nums) {
            int len = nums.length;
            int l = 0, r = 1;

            while (l < len && r < len) {
                if (nums[l] % 2 != 0 && nums[r] % 2 == 0) {
                    int temp = nums[l];
                    nums[l] = nums[r];
                    nums[r] = temp;
                }
                if (nums[l] % 2 == 0) l += 2;
                if (nums[r] % 2 != 0) r += 2;
            }

            return nums;
        }
    }
}
