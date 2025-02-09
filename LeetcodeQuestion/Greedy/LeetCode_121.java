package LeetcodeQuestion.Greedy;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/09 12:20
 * @Description: 121. 买卖股票的最佳时机
 */
public class LeetCode_121 {
    class Solution {
        public int maxProfit(int[] prices) {
            int len = prices.length;
            int minPrice = Integer.MAX_VALUE;
            int maxPrice = 0;

            if (len < 2) return 0;
            for (int i = 0; i < len; i++) {
                minPrice = Math.min(minPrice, prices[i]);
                maxPrice = Math.max(maxPrice, prices[i] - minPrice);
            }
            return maxPrice;
        }
    }
}
