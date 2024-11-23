package LeetcodeDailyQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/23 14:16
 * @Description: 3238. 求出胜利玩家的数目
 * @Method: 数组
 */
public class Code241123 {
    class Solution {
        public int winningPlayerCount(int n, int[][] pick) {
            int[][] arr = new int[n][11];
            int ans = 0;

            for (int[] p : pick) {
                arr[p[0]][p[1]]++;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 11; j++) {
                    if (arr[i][j] > i) {
                        ans++;
                        break;
                    }
                }
            }

            return ans;
        }
    }
}
