package LeetcodeQuestion.DFS;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/5 18:28
 * @Description: 1020. 飞地的数量
 */
public class LeetCode_1020 {
    class Solution {

        private int cnt;

        public int numEnclaves(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;

            for (int i = 0; i < m; i++) {
                dfs(grid, i, 0, m, n);
                dfs(grid, i, n - 1, m, n);
            }

            for (int j = 0; j < n; j++) {
                dfs(grid, 0, j, m, n);
                dfs(grid, m - 1, j, m, n);
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 1) {
                        cnt++;
                    }
                }
            }

            return cnt;
        }

        public void dfs(int[][] grid, int x, int y, int m, int n) {
            int[] dx = {-1, 0, 1, 0};
            int[] dy = {0, 1, 0, -1};

            if (x >= 0 && x < m && y >= 0 && y < n && grid[x][y] == 1) {
                grid[x][y] = 0;

                for (int i = 0; i < 4; i++) {
                    dfs(grid, x + dx[i], y + dy[i], m, n);
                }
            }
        }
    }
}
