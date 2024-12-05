package LeetcodeQuestion.DFS;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/5 17:30
 * @Description: 1034. 边界着色
 */
public class LeetCode_1034 {
    class Solution {
        public int[][] colorBorder(int[][] grid, int row, int col, int color) {
            int m = grid.length;
            int n = grid[0].length;
            int originColor = grid[row][col];
            boolean[][] visited = new boolean[m][n];
            boolean[][] isBorder = new boolean[m][n];
            dfs(grid, row, col, m, n, originColor, color, visited, isBorder);

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (isBorder[i][j]) {
                        grid[i][j] = color;
                    }
                }
            }
            return grid;
        }

        public void dfs(int[][] grid, int x, int y, int m, int n, int originColor, int color, boolean[][] visited, boolean[][] isBorder) {
            visited[x][y] = true;
            int count = 0;
            int[] dx = {-1, 0, 1, 0};
            int[] dy = {0, 1, 0, -1};

            for (int i = 0; i < 4; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];
                if (newX >= 0 && newX < m && newY >= 0 && newY < n && grid[newX][newY] == originColor) {
                    if (!visited[newX][newY]) {
                        dfs(grid, newX, newY, m, n, originColor, color, visited, isBorder);
                    }
                    count++;
                }
            }

            if (count < 4 || (x == 0 || x == m - 1 || y == 0 || y == n - 1)) {
                isBorder[x][y] = true;
            }
        }
    }
}
