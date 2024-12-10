package LeetcodeQuestion.BFS;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/10 11:31
 * @Description: 1091. 二进制矩阵中的最短路径
 */
public class LeetCode_1091 {
    class Solution {
        public int shortestPathBinaryMatrix(int[][] grid) {
            int n = grid.length;
            return bfs(grid, n);
        }

        public int bfs(int[][] grid, int n) {
            if (grid[0][0] == 1) {
                return -1;
            }
            if (grid.length == 1 && grid[0][0] == 0) {
                return 1;
            }

            Queue<int[]> queue = new LinkedList<>();
            queue.add(new int[]{0, 0});
            int[] dx = {-1, 0, 1, 0, -1, -1, 1, 1};
            int[] dy = {0, 1, 0, -1, -1, 1, -1, 1};
            int[][] d = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    d[i][j] = Integer.MAX_VALUE;
                }
            }
            d[0][0] = 0;
            int res = Integer.MAX_VALUE;

            while (!queue.isEmpty()) {
                int[] arr = queue.poll();

                for (int i = 0; i < 8; i++) {
                    int x = arr[0] + dx[i];
                    int y = arr[1] + dy[i];

                    if (x >= 0 && x < n && y >= 0 && y < n && grid[x][y] == 0 && d[arr[0]][arr[1]] + 1 < d[x][y]) {
                        d[x][y] = d[arr[0]][arr[1]] + 1;

                        if (x == n - 1 && y == n - 1) {
                            res = Math.min(res, d[x][y] + 1);
                        }

                        queue.offer(new int[]{x, y});
                    }
                }
            }

            return res == Integer.MAX_VALUE ? -1 : res;
        }
    }
}
