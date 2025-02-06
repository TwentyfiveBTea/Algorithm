package LeetcodeDailyQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/07 0:30
 * @Description: 59. 螺旋矩阵 II
 */
public class Code250207 {
    class Solution {
        public int[][] generateMatrix(int n) {
            int len = n * n;
            int x = 1;
            int l = 0, r = n - 1, t = 0, b = n - 1;
            int[][] ans = new int[n][n];

            while (x <= len) {
                for (int i = l; i <= r; i++) {
                    ans[t][i] = x++;
                }
                t++;
                for (int j = t; j <= b; j++) {
                    ans[j][r] = x++;
                }
                r--;
                for (int k = r; k >= l; k--) {
                    ans[b][k] = x++;
                }
                b--;
                for (int w = b; w >= t; w--) {
                    ans[w][l] = x++;
                }
                l++;
            }

            return ans;
        }
    }
}
