package LeetcodeQuestion.DFS;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/5 20:32
 * @Description:
 */
public class LeetCode_2684 {
    class Solution {

        private int ans;

        public int maxMoves(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;

            for (int i = 0; i < m; i++) {
                dfs(grid, i, 0, m, n);
            }

            return ans;
        }

        public void dfs(int[][] grid, int x, int y, int m, int n) {
            int[] dx = {-1, 0, 1};
            int[] dy = {1, 1, 1};

            if (ans == n - 1) {
                return;
            }

            for (int i = 0; i < 3; i++) {
                if (x + dx[i] >= 0 && x + dx[i] < m && y + dy[i] >= 0 && y + dy[i] < n
                        && grid[x + dx[i]][y + dy[i]] > grid[x][y]) {
                    dfs(grid, x + dx[i], y + dy[i], m, n);
                    ans = Math.max(ans, y + 1);
                }
            }

            grid[x][y] = 0;
        }
    }
}
