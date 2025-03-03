package LeetcodeDailyQuestion;

import java.util.Arrays;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/3/3 22:32
 * @Description:
 */
public class Code250303 {
    class Solution {
        public int palindromePartition(String s, int k) {
            int n = s.length();
            int[][] memoChange = new int[n][n];
            for (int[] row : memoChange) {
                Arrays.fill(row, -1);
            }
            int[][] memoDfs = new int[k][n];
            for (int[] row : memoDfs) {
                Arrays.fill(row, -1);
            }
            return dfs(k - 1, n - 1, s.toCharArray(), memoDfs, memoChange);
        }

        private int dfs(int i, int r, char[] s, int[][] memoDfs, int[][] memoChange) {
            if (i == 0) {
                return minChange(0, r, s, memoChange);
            }
            if (memoDfs[i][r] != -1) {
                return memoDfs[i][r];
            }
            int res = Integer.MAX_VALUE;
            for (int l = i; l <= r; l++) {
                res = Math.min(res, dfs(i - 1, l - 1, s, memoDfs, memoChange) + minChange(l, r, s, memoChange));
            }
            return memoDfs[i][r] = res;
        }

        private int minChange(int i, int j, char[] s, int[][] memoChange) {
            if (i >= j) {
                return 0;
            }
            if (memoChange[i][j] != -1) {
                return memoChange[i][j];
            }
            int res = minChange(i + 1, j - 1, s, memoChange);
            if (s[i] != s[j]) {
                res++;
            }
            return memoChange[i][j] = res;
        }
    }
}
