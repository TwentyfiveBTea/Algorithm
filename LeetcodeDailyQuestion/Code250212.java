package LeetcodeDailyQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/12 1:05
 * @Description: 1760. 袋子里最少数目的球
 */
public class Code250212 {
    class Solution {
        public int minimumSize(int[] nums, int maxOperations) {
            int l = 1, r = 1000000000;

            while (l < r) {
                int mid = l + r >> 1;
                if (check(nums, maxOperations, mid)) {
                    r = mid;
                } else {
                    l = mid + 1;
                }
            }
            return r;
        }

        public boolean check(int[] nums, int maxOperations, int mid) {
            for (int num : nums) {
                maxOperations -= (num - 1) / mid;
            }
            return maxOperations >= 0;
        }
    }
}
