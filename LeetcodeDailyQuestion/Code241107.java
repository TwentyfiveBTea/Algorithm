package LeetcodeDailyQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/07 21:35
 * @Description: 241107
 */
public class Code241107 {


    /**
     * @Description: 3255、长度为 K 的子数组的能量值 II -- 中等
     * @Method: 滑动窗口
     */
    class Solution {
        public int[] resultsArray(int[] nums, int k) {
            // 初始化 count 为 1，表示当前递增子数组的长度
            int count = 1;
            int n = nums.length;
            int result[] = new int[n - k + 1];

            // 如果 k 为 1，直接返回原数组，因为每个单独的元素都被视为递增的子数组
            if (k == 1) {
                return nums;
            }


            for (int i = 1; i < n; i++) {
                // 判断当前元素是否比前一个元素大 1（即是否递增）
                if (nums[i - 1] + 1 == nums[i]) {
                    count++;
                } else {
                    count = 1;
                }

                // 只有当 i >= k - 1 时，说明已经形成了长度为 k 的子数组
                if (i >= k - 1) {
                    // 如果递增长度大于等于 k，说明当前子数组是递增的
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
