package LeetcodeQuestion;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/19 9:47
 * @Description: 241119
 */
public class Code241119 {

    /**
     * @Description: 20. 有效的括号
     * @Method: 栈
     */
    class Solution1 {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (ch == '(') {
                    stack.push(')');
                } else if (ch == '[') {
                    stack.push(']');
                } else if (ch == '{') {
                    stack.push('}');
                }

                if (ch == ')' || ch == ']' || ch == '}') {
                    if (stack.isEmpty() || ch != stack.pop()) {
                        return false;
                    }
                }
            }

            return stack.isEmpty();
        }
    }

    /**
     * @Description: 1. 两数之和
     * @Method: 数组
     */
    class Solution2 {
        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }

            return new int[]{0};
        }
    }

    /**
     * @Description: 41. 缺失的第一个正数
     * @Method: Set
     */
    class Solution3 {
        public int firstMissingPositive(int[] nums) {
            Set<Integer> set = new HashSet();
            int max = 0;

            for (int num : nums) {
                set.add(num);
                max = Math.max(num, max);
            }
            for (int i = 1; i < max; i++) {
                if (!set.contains(i)) {
                    return i;
                }
            }

            return max + 1;
        }
    }

}
