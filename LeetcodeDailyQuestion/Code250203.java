package LeetcodeDailyQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/03 8:53
 * @Description: 680. 验证回文串 II
 */
public class Code250203 {
    class Solution {
        public boolean validPalindrome(String s) {
            char[] ch = s.toCharArray();
            int l = 0, r = s.length() - 1;

            while (l < r && ch[l] == ch[r]) {
                l++;
                r--;
            }

            if (isValid(ch, l + 1, r)) return true;
            if (isValid(ch, l, r - 1)) return true;
            return false;
        }

        public boolean isValid(char[] ch, int l, int r) {
            while (l < r) {
                if (ch[l++] != ch[r--]) return false;
            }
            return true;
        }
    }
}
