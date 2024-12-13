package LeetcodeDailyQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/13 13:50
 * @Description: 3264. K 次乘运算后的最终数组 I
 */
public class Code241213 {
    class Solution {
        public int[] getFinalState(int[] nums, int k, int multiplier) {
            int n = nums.length;

            for (int i = 0; i < k; i++) {
                int a = 0;
                for (int j = 0; j < n; j++) {
                    if (nums[j] < nums[a]) {
                        a = j;
                    }
                }

                nums[a] *= multiplier;
            }

            return nums;
        }
    }
}
