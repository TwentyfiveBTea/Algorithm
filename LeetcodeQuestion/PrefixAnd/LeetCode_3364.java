package LeetcodeQuestion.PrefixAnd;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/6 13:47
 * @Description: 3364. 最小正和子数组
 */
public class LeetCode_3364 {
    class Solution {
        public int minimumSumSubarray(List<Integer> nums, int l, int r) {
            int n = nums.size();
            int ans = Integer.MAX_VALUE;
            int[] s = new int[n + 1];

            for (int i = 0; i < n; i++) {
                s[i + 1] = s[i] + nums.get(i);
            }

            for (int len = l; len <= r; len++) {
                for (int start = 0; start <= n - len; start++) {
                    int end = start + len;
                    int num = s[end] - s[start];

                    if (num > 0) {
                        ans = Math.min(ans, num);
                    }
                }
            }

            return ans == Integer.MAX_VALUE ? -1 : ans;
        }
    }
}
