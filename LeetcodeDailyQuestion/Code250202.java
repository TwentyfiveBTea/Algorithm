package LeetcodeDailyQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/02 20:17
 * @Description: 598. 区间加法 II
 */
public class Code250202 {
    class Solution {
        public int maxCount(int m, int n, int[][] ops) {
            int a = m, b = n;
            for (int[] op : ops) {
                a = Math.min(a, op[0]);
                b = Math.min(b, op[1]);
            }
            return a * b;
        }
    }
}
