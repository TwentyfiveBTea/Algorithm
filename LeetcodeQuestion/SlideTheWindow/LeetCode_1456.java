package LeetcodeQuestion.SlideTheWindow;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/23 17:50
 * @Description: 1456. 定长子串中元音的最大数目
 */
public class LeetCode_1456 {
    class Solution {
        public int maxVowels(String s, int k) {
            char[] str = s.toCharArray();
            int cnt = 0;
            int vowel = 0;

            for (int i = 0; i < str.length; i++) {
                if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u') {
                    vowel++;
                }

                if (i < k - 1) {
                    continue;
                }

                cnt = Math.max(cnt, vowel);

                char c = str[i - k + 1];
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowel--;
                }
            }

            return cnt;
        }
    }
}
