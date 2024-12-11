package LeetcodeDailyQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/11 23:29
 * @Description: 2717. 半有序排列
 */
public class Code241211 {
    class Solution {
        public int semiOrderedPermutation(int[] nums) {
            int n = nums.length;
            int first = 0;
            int last = 0;

            for (int i = 0; i < n; i++) {
                if (nums[i] == 1) {
                    first = i;
                }
                if (nums[i] == n) {
                    last = i;
                }
            }

            return first + n - 1 - last - (last < first ? 1 : 0);
        }
    }
}
