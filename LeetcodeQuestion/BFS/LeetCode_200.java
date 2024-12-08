package LeetcodeQuestion.BFS;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/3 20:35
 * @Description: 200. 岛屿数量
 */
public class LeetCode_200 {
    class Solution {
        public int numIslands(char[][] grid) {
            int n = grid.length;
            int m = grid[0].length;
            int ans = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (grid[i][j] == '1') {
                        dfs(grid, i, j, n, m);
                        ans++;
                    }
                }
            }

            return ans;
        }

        public void dfs(char[][] ch, int x, int y, int n, int m) {
            int[] dx = {-1, 0, 1, 0};
            int[] dy = {0, 1, 0, -1};

            if (x >= 0 && x < n && y >= 0 && y < m && ch[x][y] == '1') {
                ch[x][y] = '2';
                for (int i = 0; i < 4; i++) {
                    dfs(ch, x + dx[i], y + dy[i], n, m);
                }
            }
        }
    }
}
