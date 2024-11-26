package LeetcodeDailyQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/26 9:48
 * @Description: 3206. 交替组 I
 */
public class Code241126 {
    class Solution {
        public int numberOfAlternatingGroups(int[] colors) {
            int len = colors.length;
            int ans = 0;

            for (int i = 0; i < len; i++) {
                if (colors[i] != colors[(i + 1) % len] && colors[(i + 1) % len] != colors[(i + 2) % len]) {
                    ans++;
                }
            }

            return ans;
        }
    }
}
