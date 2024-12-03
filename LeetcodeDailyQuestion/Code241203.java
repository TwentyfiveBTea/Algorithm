package LeetcodeDailyQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/3 09:47
 * @Description: 3274. 检查棋盘方格颜色是否相同
 */
public class Code241203 {
    class Solution {
        public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
            return (coordinate1.charAt(0) + coordinate1.charAt(1)) % 2 == (coordinate2.charAt(0) + coordinate2.charAt(1)) % 2;
        }
    }
}
