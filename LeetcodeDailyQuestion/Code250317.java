package LeetcodeDailyQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/3/17 13:13
 * @Description: 1963. 使字符串平衡的最小交换次数
 */
public class Code250317 {
    class Solution {
        public int minSwaps(String s) {
            char[] ch = s.toCharArray();
            int ans = 0;
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == '[' || ans == 0) {
                    ans++;
                } else {
                    ans--;
                }
            }
            return ans / 2;
        }
    }
}
