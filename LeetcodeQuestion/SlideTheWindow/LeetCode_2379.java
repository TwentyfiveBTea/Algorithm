package LeetcodeQuestion.SlideTheWindow;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/25 16:20
 * @Description: 2379. 得到 K 个黑块的最少涂色次数
 */
public class LeetCode_2379 {
    class Solution {
        public int minimumRecolors(String blocks, int k) {
            char[] ch = blocks.toCharArray();

            int ans = Integer.MAX_VALUE;
            int len = ch.length;
            int count = 0;

            for (int i = 0; i < len; i++) {
                if (ch[i] == 'W') {
                    count++;
                }

                if (i < k - 1) {
                    continue;
                }

                ans = Math.min(ans, count);
                if (ch[i - k + 1] == 'W') {
                    count--;
                }
            }

            return ans;
        }
    }
}
