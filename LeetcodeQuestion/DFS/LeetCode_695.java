package LeetcodeQuestion.DFS;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/3 21:12
 * @Description: 695. 岛屿的最大面积
 */
public class LeetCode_695 {
    class Solution {

        private int count;

        public int maxAreaOfIsland(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int ans = 0;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 1) {
                        count = 0;
                        dfs(grid, i, j, m, n);
                        ans = Math.max(ans, count);
                    }
                }
            }

            return ans;
        }

        public void dfs(int[][] grid, int x, int y, int m, int n) {
            int[] dx = {-1, 0, 1, 0};
            int[] dy = {0, 1, 0, -1};

            if (x >= 0 && x < m && y >= 0 && y < n && grid[x][y] == 1) {
                grid[x][y] = 2;
                count++;

                for (int i = 0; i < 4; i++) {
                    dfs(grid, x + dx[i], y + dy[i], m, n);
                }
            }
        }
    }
}
