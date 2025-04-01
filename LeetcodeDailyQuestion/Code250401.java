package LeetcodeDailyQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/4/1 17:25
 * @Description: 2140. 解决智力问题
 */
public class Code250401 {
    class Solution {
        public long mostPoints(int[][] questions) {
            int len = questions.length;
            long[] f = new long[len + 1];
            long ans = 0;
            for (int i = len - 1; i >= 0; i--) {
                if (questions[i][1] + i + 1 >= len) {
                    f[i] = Math.max(questions[i][0], f[i + 1]);
                } else {
                    f[i] = Math.max(questions[i][0] + f[questions[i][1] + i + 1], f[i + 1]);
                }
                ans = Math.max(ans, f[i]);
            }
            return ans;
        }
    }
}
