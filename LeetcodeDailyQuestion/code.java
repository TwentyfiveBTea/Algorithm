package LeetcodeDailyQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/07 21:35
 * @Description: 3255、长度为 K 的子数组的能量值 II -- 中等
 */
public class code {
    class Solution {
        public int[] resultsArray(int[] nums, int k) {
            int count = 1;
            int n = nums.length;
            int result[] = new int[n - k + 1];

            if(k == 1){
                return nums;
            }
            for (int i = 1; i < n; i++) {
                if (nums[i - 1] + 1 == nums[i]) {
                    count++;
                } else {
                    count = 1;
                }

                if (i >= k - 1) {
                    if (count >= k) {
                        result[i - k + 1] = nums[i];
                    } else {
                        result[i - k + 1] = -1;
                    }
                }
            }
            return result;
        }
    }
}
