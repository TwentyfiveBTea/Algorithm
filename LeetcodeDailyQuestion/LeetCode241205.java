package LeetcodeDailyQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/5 11:08
 * @Description: 3001. 捕获黑皇后需要的最少移动次数
 */
public class LeetCode241205 {
    class Solution {
        public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
            if (a == e && (c != a || (d - b) * (d - f) > 0)) {
                return 1;
            }
            if (b == f && (d != b || (c - a) * (c - e) > 0)) {
                return 1;
            }
            if (c - e == d - f && (a - e != b - f || (a - c) * (a - e) > 0)) {
                return 1;
            }
            if (c - e == f - d && (a - e != f - b || (a - c) * (a - e) > 0)) {
                return 1;
            }

            return 2;
        }
    }
}
