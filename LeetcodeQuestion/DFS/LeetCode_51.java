package LeetcodeQuestion.DFS;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/3 09:45
 * @Description: 51. N 皇后
 */
public class LeetCode_51 {
    class Solution {

        private List<List<String>> ans;

        public List<List<String>> solveNQueens(int n) {
            ans = new ArrayList<>();
            char[][] g = new char[n][n];
            boolean[] col = new boolean[n];
            boolean[] dg = new boolean[2 * n - 1];
            boolean[] udg = new boolean[2 * n - 1];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    g[i][j] = '.';
                }
            }

            dfs(g, col, dg, udg, n, 0);
            return ans;
        }

        public void dfs(char[][] g, boolean[] col, boolean[] dg, boolean[] udg, int n, int u) {
            if (u == n) {
                List<String> list = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    list.add(new String(g[i]));
                }
                ans.add(list);
                return;
            }

            for (int i = 0; i < n; i++) {
                if (!col[i] && !dg[i + u] && !udg[i - u + n - 1]) {
                    g[u][i] = 'Q';
                    col[i] = dg[i + u] = udg[i - u + n - 1] = true;
                    dfs(g, col, dg, udg, n, u + 1);
                    col[i] = dg[i + u] = udg[i - u + n - 1] = false;
                    g[u][i] = '.';
                }
            }
        }
    }
}
