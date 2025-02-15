package LeetcodeDailyQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/15 20:33
 * @Description: 1706. 球会落何处
 */
public class Code250215 {
    class Solution {
        public int[] findBall(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int[] ans = new int[n];

            for (int i = 0; i < n; i++) {
                int columu = i;
                int row = 0;
                boolean status = true;

                while (row < m) {
                    if (grid[row][columu] == 1) {
                        if (columu == n - 1 || grid[row][columu + 1] == -1) {
                            status = false;
                            break;
                        }
                        columu++;
                    } else {
                        if (columu == 0 || grid[row][columu - 1] == 1) {
                            status = false;
                            break;
                        }
                        columu--;
                    }
                    row++;
                }

                if (status) {
                    ans[i] = columu;
                } else {
                    ans[i] = -1;
                }
            }
            return ans;
        }
    }
}
