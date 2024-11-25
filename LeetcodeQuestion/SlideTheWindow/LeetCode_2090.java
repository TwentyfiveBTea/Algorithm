package LeetcodeQuestion.SlideTheWindow;

import java.util.Arrays;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/25 13:58
 * @Description: 2090. 半径为 k 的子数组平均值
 */
public class LeetCode_2090 {
    class Solution {
        public int[] getAverages(int[] nums, int k) {
            int len = nums.length;
            int l = 0, r = 0, avg = 0;
            long sum = 0;
            int[] ans = new int[len];
            Arrays.fill(ans, -1);

            while (r < len) {
                sum += nums[r];

                if (r - l + 1 == 2 * k + 1) {
                    avg = (int) (sum / (2 * k + 1));
                    ans[l + k] = avg;
                    sum -= nums[l++];
                }
                r++;
            }

            return ans;
        }
    }
}
