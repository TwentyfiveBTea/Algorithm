package LeetcodeDailyQuestion;

import java.util.List;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/19 0:36
 * @Description: 624. 数组列表中的最大距离
 */
public class Code250219 {
    class Solution {
        public int maxDistance(List<List<Integer>> arrays) {
            int min = Integer.MAX_VALUE >> 1, max = Integer.MIN_VALUE >> 1;
            int ans = 0;
            for (List<Integer> array : arrays) {
                int first = array.get(0);
                int last = array.get(array.size() - 1);
                ans = Math.max(ans, Math.max(max - first, last - min));
                min = Math.min(min, first);
                max = Math.max(max, last);
            }
            return ans;
        }
    }
}
