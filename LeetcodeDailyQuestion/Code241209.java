package LeetcodeDailyQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/9 17:57
 * @Description: 1812. 判断国际象棋棋盘中一个格子的颜色
 */
public class Code241209 {
    class Solution {
        public boolean squareIsWhite(String coordinates) {
            return (coordinates.charAt(0) + coordinates.charAt(1)) % 2 == 0 ? false : true;
        }
    }
}
