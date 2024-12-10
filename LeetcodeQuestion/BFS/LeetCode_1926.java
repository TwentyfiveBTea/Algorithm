package LeetcodeQuestion.BFS;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/10 10:57
 * @Description: 1926. 迷宫中离入口最近的出口
 */
public class LeetCode_1926 {
    class Solution {
        public int nearestExit(char[][] maze, int[] entrance) {
            int n = maze.length;
            int m = maze[0].length;

            return bfs(maze, n, m, entrance[0], entrance[1]);
        }

        public int bfs(char[][] maze, int n, int m, int x, int y) {
            Queue<int[]> queue = new LinkedList<>();
            queue.add(new int[]{x, y});
            int[][] d = new int[n][m];
            d[x][y] = 0;
            int[] dx = {-1, 0, 1, 0};
            int[] dy = {0, 1, 0, -1};
            int min = Integer.MAX_VALUE;

            while (!queue.isEmpty()) {
                int[] arr = queue.poll();

                for (int i = 0; i < 4; i++) {
                    int newX = arr[0] + dx[i];
                    int newY = arr[1] + dy[i];

                    if (newX >= 0 && newX < n && newY >= 0 && newY < m && d[newX][newY] == 0 && maze[newX][newY] == '.') {
                        d[newX][newY] = d[arr[0]][arr[1]] + 1;

                        if ((newX == 0 || newX == n - 1 || newY == 0 || newY == m - 1) && !(newX == x && newY == y)) {
                            min = Math.min(min, d[newX][newY]);
                        }

                        queue.offer(new int[]{newX, newY});
                    }
                }
            }

            return min == Integer.MAX_VALUE ? -1 : min;
        }
    }
}
