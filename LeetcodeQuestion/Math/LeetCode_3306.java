package LeetcodeQuestion.Math;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/28 23:50
 * @Description: 3360. 移除石头游戏
 */
public class LeetCode_3306 {
    class Solution {
        public boolean canAliceWin(int n) {
            int a = 10;

            while (n >= a) {
                n -= a;
                a--;
            }

            return (10 - a) % 2 > 0;
        }
    }
}
