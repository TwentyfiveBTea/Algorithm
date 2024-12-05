package LeetcodeHotQuestions100.Array;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/5 21:46
 * @Description: 66. 加一
 */
public class LeetCode_66 {
    class Solution {
        public int[] plusOne(int[] digits) {
            int n = digits.length;
            int i = n - 1;
            int[] ans = new int[n + 1];

            while (i >= 0) {
                digits[i] += 1;
                if (digits[i] < 10) {
                    return digits;
                } else {
                    digits[i] = 0;
                    i--;
                }
            }

            ans[0] = 1;
            return ans;
        }
    }
}
