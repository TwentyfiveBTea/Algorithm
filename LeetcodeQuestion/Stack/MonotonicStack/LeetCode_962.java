package LeetcodeQuestion.Stack.MonotonicStack;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/1 17:38
 * @Description: 962. 最大宽度坡
 */
public class LeetCode_962 {
    class Solution {
        public int maxWidthRamp(int[] nums) {
            int n = nums.length;
            int ans = 0;
            Stack<Integer> stk = new Stack();

            for (int i = 0; i < n; i++) {
                int x = nums[i];

                if (stk.isEmpty() || x < nums[stk.peek()]) {
                    stk.push(i);
                }
            }

            for (int i = n - 1; i >= 0; i--) {
                while (!stk.isEmpty() && nums[i] >= nums[stk.peek()]) {
                    ans = Math.max(ans, i - stk.pop());
                }
            }

            return ans;
        }
    }
}
