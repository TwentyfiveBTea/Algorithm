package LeetcodeDailyQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/12 10:04
 * @Description: 3258. 统计满足 K 约束的子字符串数量 I
 */
public class code241112 {
    class Solution {
        public int countKConstraintSubstrings(String s, int k) {
            int count = 0;

            for (int i = 0; i < s.length(); i++) {
                int zeros = 0, ones = 0;

                for (int j = i; j < s.length(); j++) {
                    // 如果为 0
                    if (s.charAt(j) == '0') {
                        zeros++;
                    } else {
                        ones++;
                    }

                    // 判断是否超出 k 约束
                    if (zeros > k && ones > k) {
                        break;
                    }
                    count++;
                }
            }
            return count;
        }
    }
}
