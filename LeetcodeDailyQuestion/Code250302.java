package LeetcodeDailyQuestion;

import java.util.Arrays;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/3/2 18:29
 * @Description: 132. 分割回文串 II
 */
public class Code250302 {
    class Solution {
        public int minCut(String s) {
            int n = s.length();
            boolean[][] g = new boolean[n][n];
            for (var row : g) {
                Arrays.fill(row, true);
            }
            for (int i = n - 1; i >= 0; --i) {
                for (int j = i + 1; j < n; ++j) {
                    g[i][j] = s.charAt(i) == s.charAt(j) && g[i + 1][j - 1];
                }
            }
            int[] f = new int[n];
            for (int i = 0; i < n; ++i) {
                f[i] = i;
            }
            for (int i = 1; i < n; ++i) {
                for (int j = 0; j <= i; ++j) {
                    if (g[j][i]) {
                        f[i] = Math.min(f[i], j > 0 ? 1 + f[j - 1] : 0);
                    }
                }
            }
            return f[n - 1];
        }
    }
}
