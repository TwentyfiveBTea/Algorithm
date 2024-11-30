package LeetcodeQuestion.Stack.MonotonicStack;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/30 20:28
 * @Description: 1475. 商品折扣后的最终价格
 */
public class LeetCode_1475 {
    class Solution {
        public int[] finalPrices(int[] prices) {
            int n = prices.length;
            int[] result = new int[n];
            Stack<Integer> stk = new Stack();

            for (int i = 0; i < n; i++) {
                result[i] = prices[i];
            }

            for (int i = 0; i < n; i++) {
                int x = prices[i];

                while (!stk.isEmpty() && x <= prices[stk.peek()]) {
                    int index = stk.pop();
                    result[index] = prices[index] - x;
                }

                stk.push(i);
            }

            return result;
        }
    }
}
