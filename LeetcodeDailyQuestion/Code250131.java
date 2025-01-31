package LeetcodeDailyQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/01/31 18:17
 * @Description: 541. 反转字符串 II
 */
public class Code250131 {
    class Solution {
        public String reverseStr(String s, int k) {
            char[] ch = s.toCharArray();
            int len = s.length();

            for (int i = 0; i < len; i += 2 * k) {
                for (int l = i, r = Math.min(i + k - 1, len - 1); l < r; l++, r--) {
                    char temp = ch[l];
                    ch[l] = ch[r];
                    ch[r] = temp;
                }
            }

            return new String(ch);
        }
    }
}
