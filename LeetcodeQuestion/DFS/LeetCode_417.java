package LeetcodeQuestion.DFS;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/3/14 17:22
 * @Description: 417. 太平洋大西洋水流问题
 */
public class LeetCode_417 {
    class Solution {
        public List<List<Integer>> pacificAtlantic(int[][] heights) {
            List<List<Integer>> ans = new ArrayList<>();
            int m = heights.length;
            int n = heights[0].length;
            boolean[][] pac = new boolean[m][n];
            boolean[][] atl = new boolean[m][n];

            for (int i = 0; i < m; i++) {
                dfs(heights, pac, i, 0, m, n);
                dfs(heights, atl, i, n - 1, m, n);
            }
            for (int j = 0; j < n; j++) {
                dfs(heights, pac, 0, j, m, n);
                dfs(heights, atl, m - 1, j, m, n);
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (pac[i][j] && atl[i][j]) {
                        List<Integer> list = new ArrayList<>();
                        list.add(i);
                        list.add(j);
                        ans.add(list);
                    }
                }
            }

            return ans;
        }

        public void dfs(int[][] heights, boolean[][] bool, int x, int y, int m, int n) {
            int[] dx = {0, -1, 0, 1};
            int[] dy = {1, 0, -1, 0};
            bool[x][y] = true;

            for (int i = 0; i < 4; i++) {
                if (x + dx[i] >= 0
                        && x + dx[i] < m
                        && y + dy[i] >= 0
                        && y + dy[i] < n
                        && !bool[x + dx[i]][y + dy[i]]
                        && heights[x + dx[i]][y + dy[i]] >= heights[x][y]) {
                    dfs(heights, bool, x + dx[i], y + dy[i], m, n);
                }
            }
        }
    }
}
