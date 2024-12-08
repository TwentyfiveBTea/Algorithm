package LeetcodeQuestion.DFS;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/5 12:38
 * @Description: 2658. 网格图中鱼的最大数目
 */
public class LeetCode_2658 {
    class Solution {

        private int cnt;

        public int findMaxFish(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int ans = 0;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    cnt = 0;
                    dfs(grid, i, j, m, n);
                    ans = Math.max(ans, cnt);
                }
            }

            return ans;
        }

        public void dfs(int[][] grid, int x, int y, int m, int n) {
            int[] dx = {-1, 0, 1, 0};
            int[] dy = {0, 1, 0, -1};

            if (x >= 0 && x < m && y >= 0 && y < n && grid[x][y] != 0) {
                cnt += grid[x][y];
                grid[x][y] = 0;

                for (int i = 0; i < 4; i++) {
                    dfs(grid, x + dx[i], y + dy[i], m, n);
                }
            }
        }
    }
}
