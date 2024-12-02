package LeetcodeQuestion.DFS;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/02 23:46
 * @Description: 52. N 皇后 II
 */
public class LeetCode_52 {
    class Solution {

        private int ans;

        public int totalNQueens(int n) {
            int[][] g = new int[n][n];
            boolean[] col = new boolean[n];
            boolean[] dg = new boolean[2 * n - 1];
            boolean[] udg = new boolean[2 * n - 1];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    g[i][j] = 0;
                }
            }

            dfs(g, col, dg, udg, n, 0);
            return ans;
        }

        public void dfs(int[][] g, boolean[] col, boolean[] dg, boolean[] udg, int n, int u) {
            if (u == n) {
                ans++;
                return;
            }

            for (int i = 0; i < n; i++) {
                if (!col[i] && !dg[i + u] && !udg[i - u + n - 1]) {
                    g[u][i] = 1;
                    col[i] = dg[i + u] = udg[i - u + n - 1] = true;
                    dfs(g, col, dg, udg, n, u + 1);
                    col[i] = dg[i + u] = udg[i - u + n - 1] = false;
                    g[u][i] = 0;
                }
            }
        }
    }
}
