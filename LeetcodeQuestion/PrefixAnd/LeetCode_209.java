package LeetcodeQuestion.PrefixAnd;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/22 17:36
 * @Description: 209. 长度最小的子数组
 */
public class LeetCode_209 {
    class Solution {
        public static final int N = 100000;

        public int minSubArrayLen(int target, int[] nums) {
            int len = nums.length;
            int l, r;
            int[] s = new int[N + 1];

            for (int i = 0; i < len; i++) {
                if (nums[i] == target) {
                    return 1;
                }
            }

            for (int i = 1; i <= len; i++) {
                s[i] = s[i - 1] + nums[i - 1];
            }

            int minLen = Integer.MAX_VALUE;

            for (int i = 0; i < len; i++) {
                l = i + 1;
                r = len;

                while (l <= r) {
                    int mid = l + (r - l) / 2;
                    int subArraySum = s[mid] - s[i];

                    if (subArraySum >= target) {
                        r = mid - 1;
                    } else {
                        l = mid + 1;
                    }
                }

                if (l < len + 1 && s[l] - s[i] >= target) {
                    minLen = Math.min(minLen, l - i);
                }
            }

            return minLen == Integer.MAX_VALUE ? 0 : minLen;
        }
    }
}
