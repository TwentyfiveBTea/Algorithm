package LeetcodeQuestion.DFS;

import java.util.Arrays;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/08 14:04
 * @Description: 62. 不同路径
 */
public class LeetCode_62 {
    class Solution {
        public int uniquePaths(int m, int n) {
            int[][] memo = new int[m][n];
            for (int[] x : memo) {
                Arrays.fill(x, -1);
            }
            return dfs(0, 0, m, n, memo);
        }

        public int dfs(int x, int y, int m, int n, int[][] memo) {
            if (x < 0 || x >= m || y < 0 || y >= n) {
                return 0;
            }
            if (x == m - 1 && y == n - 1) {
                return 1;
            }
            if (memo[x][y] != -1) {
                return memo[x][y];
            }

            memo[x][y] = dfs(x, y + 1, m, n, memo) + dfs(x + 1, y, m, n, memo);
            return memo[x][y];
        }
    }
}
