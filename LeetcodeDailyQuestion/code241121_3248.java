package LeetcodeDailyQuestion;

import java.util.List;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/21 12:38
 * @Description: 3248. 矩阵中的蛇
 * @Method: 字符串
 */
public class code241121_3248 {
    class Solution {
        public int finalPositionOfSnake(int n, List<String> commands) {
            int[][] grid = new int[n][n];
            int location = 0;
            int r = 0;
            int c = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    grid[i][j] = (i * n) + j;
                }
            }

            for (String command : commands) {
                if ("UP".equals(command)) {
                    r--;
                } else if ("RIGHT".equals(command)) {
                    c++;
                } else if ("DOWN".equals(command)) {
                    r++;
                } else {
                    c--;
                }
                location = grid[r][c];
            }

            return location;
        }
    }
}
