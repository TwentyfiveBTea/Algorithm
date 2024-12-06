package LeetcodeDailyQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/6 13:13
 * @Description: 999. 可以被一步捕获的棋子数
 */
public class Code241206 {
    class Solution {
        public int numRookCaptures(char[][] board) {
            int x = 0;
            int y = 0;
            int ans = 0;
            int[] dx = {-1, 0, 1, 0};
            int[] dy = {0, 1, 0, -1};

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (board[i][j] == 'R') {
                        x = i;
                        y = j;
                        break;
                    }
                }
            }

            for (int i = 0; i < 4; i++) {
                int newX = x;
                int newY = y;

                while (true) {
                    newX += dx[i];
                    newY += dy[i];

                    if (newX < 0 || newX >= 8 || newY < 0 || newY >= 8 || board[newX][newY] == 'B') {
                        break;
                    }
                    if (board[newX][newY] == 'p') {
                        ans++;
                        break;
                    }

                }
            }

            return ans;
        }
    }
}
