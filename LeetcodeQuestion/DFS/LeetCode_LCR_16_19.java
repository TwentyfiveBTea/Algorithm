package LeetcodeQuestion.DFS;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/4 18:44
 * @Description: 面试题 16.19. 水域大小
 */
public class LeetCode_LCR_16_19 {
    class Solution {

        private List<Integer> list = new ArrayList<>();
        private int cnt;

        public int[] pondSizes(int[][] land) {
            int n = land.length;
            int m = land[0].length;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    cnt = 0;
                    dfs(land, i, j, n, m);
                    if (cnt > 0) {
                        list.add(cnt);
                    }
                }
            }

            int[] ans = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                ans[i] = list.get(i);
            }
            Arrays.sort(ans);
            return ans;
        }

        public void dfs(int[][] land, int x, int y, int n, int m) {
            int[] dx = {-1, 0, 1, 0, -1, -1, 1, 1};
            int[] dy = {0, 1, 0, -1, -1, 1, -1, 1};

            if (x >= 0 && x < n && y >= 0 && y < m && land[x][y] == 0) {
                land[x][y] = -1;
                cnt++;

                for (int i = 0; i < 8; i++) {
                    dfs(land, x + dx[i], y + dy[i], n, m);
                }
            }
        }
    }
}
