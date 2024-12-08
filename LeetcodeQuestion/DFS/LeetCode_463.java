package LeetcodeQuestion.DFS;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/5 12:06
 * @Description: 463. 岛屿的周长
 */
public class LeetCode_463 {
    class Solution {

        private int ans;

        public int islandPerimeter(int[][] grid) {
            int row = grid.length;
            int col = grid[0].length;

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (grid[i][j] == 1) {
                        dfs(grid, i, j, row, col);
                        return ans;
                    }
                }
            }

            return ans;
        }

        public void dfs(int[][] grid, int x, int y, int row, int col) {
            int[] dx = {-1, 0, 1, 0};
            int[] dy = {0, 1, 0, -1};

            if (x >= 0 && x < row && y >= 0 && y < col && grid[x][y] == 1) {
                grid[x][y] = -1;

                for (int i = 0; i < 4; i++) {
                    dfs(grid, x + dx[i], y + dy[i], row, col);
                }
            } else if (x < 0 || x >= row || y < 0 || y >= col || grid[x][y] == 0) {
                ans++;
            }
        }
    }
}
