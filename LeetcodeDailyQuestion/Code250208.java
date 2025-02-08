package LeetcodeDailyQuestion;

import java.util.Arrays;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/08 13:56
 * @Description: 63. 不同路径 II
 */
public class Code250208 {
    class Solution {
        private int[][] memo;

        public int uniquePathsWithObstacles(int[][] obstacleGrid) {
            int m = obstacleGrid.length;
            int n = obstacleGrid[0].length;
            memo = new int[m][n];
            for (int[] x : memo) {
                Arrays.fill(x, -1);
            }
            return dfs(0, 0, obstacleGrid);
        }

        public int dfs(int x, int y, int[][] obstacleGrid) {
            int m = obstacleGrid.length;
            int n = obstacleGrid[0].length;

            if (x < 0 || x >= m || y < 0 || y >= n || obstacleGrid[x][y] == 1) {
                return 0;
            }
            if (x == m - 1 && y == n - 1) {
                return 1;
            }
            if (memo[x][y] != -1) {
                return memo[x][y];
            }

            memo[x][y] = dfs(x, y + 1, obstacleGrid) + dfs(x + 1, y, obstacleGrid);
            return memo[x][y];
        }

    }

}
