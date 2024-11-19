package LeetcodeQuestion;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/19 9:47
 * @Description: 20. 有效的括号
 */
public class code241119_2_20 {
    class Solution {
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
}
