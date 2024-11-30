package LeetcodeQuestion.Stack.MonotonicStack;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/30 20:06
 * @Description: 739. 每日温度
 */
public class LeetCode_739 {
    class Solution {
        public int[] dailyTemperatures(int[] temperatures) {
            Stack<Integer> stk = new Stack();
            int n = temperatures.length;
            int[] answer = new int[n];

            for (int i = 0; i < n; i++) {
                int x = temperatures[i];

                while (!stk.isEmpty() && x > temperatures[stk.peek()]) {
                    int index = stk.pop();
                    answer[index] = i - index;
                }

                stk.push(i);
            }

            return answer;
        }
    }
}
