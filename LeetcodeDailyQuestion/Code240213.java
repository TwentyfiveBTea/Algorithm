package LeetcodeDailyQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/13 20:38
 * @Description: 1742. 盒子中小球的最大数量
 */
public class Code240213 {
    class Solution {
        public int countBalls(int lowLimit, int highLimit) {
            int ans = 0;
            int[] box = new int[46];

            for (int i = lowLimit; i <= highLimit; i++) {
                int a = 0;
                for (int j = i; j > 0; j /= 10) {
                    a += j % 10;
                }
                box[a]++;
                ans = Math.max(ans, box[a]);
            }
            return ans;
        }
    }
}
