package LeetcodeQuestion.Simulate;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/6 17:24
 * @Description: 495. 提莫攻击
 */
public class LeetCode_495 {
    class Solution {
        public int findPoisonedDuration(int[] timeSeries, int duration) {
            int ans = duration;
            int n = timeSeries.length;

            for (int i = 0; i < n - 1; i++) {
                ans += Math.min(duration, timeSeries[i + 1] - timeSeries[i]);
            }

            return ans;
        }
    }
}
