package LeetcodeQuestion.String;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/29 23:55
 * @Description: 58. 最后一个单词的长度
 */
public class LeetCode_58 {
    class Solution {
        public int lengthOfLastWord(String s) {
            int i = s.length() - 1;

            while (s.charAt(i) == ' ') {
                i--;
            }

            int j = i - 1;
            while (j >= 0 && s.charAt(j) != ' ') {
                j--;
            }

            return i - j;
        }
    }
}
