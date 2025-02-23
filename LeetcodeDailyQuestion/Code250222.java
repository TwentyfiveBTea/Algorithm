package LeetcodeDailyQuestion;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/2/23 18:25
 * @Description: 2506. 统计相似字符串对的数目
 */
public class Code250222 {
    class Solution {
        public int similarPairs(String[] words) {
            Map<Integer, Integer> cnt = new HashMap<>();
            int ans = 0;
            for (String s : words) {
                int mask = 0;
                for (char c : s.toCharArray()) {
                    mask |= 1 << (c - 'a');
                }
                int c = cnt.getOrDefault(mask, 0);
                ans += c;
                cnt.put(mask, c + 1);
            }
            return ans;
        }
    }
}
