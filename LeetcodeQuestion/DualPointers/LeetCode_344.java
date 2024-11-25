package LeetcodeQuestion.DualPointers;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/25 16:50
 * @Description: 344. 反转字符串
 */
public class LeetCode_344 {
    class Solution3 {
        public void reverseString(char[] s) {
            int len = s.length;

            for (int l = 0, r = len - 1; l < r; l++, r--) {
                char temp = s[l];
                s[l] = s[r];
                s[r] = temp;
            }
        }
    }
}
