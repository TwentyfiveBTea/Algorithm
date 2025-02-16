package LeetcodeDailyQuestion;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/17 0:39
 * @Description: 1287. 有序数组中出现次数超过 25%的元素
 */
public class Code250217 {
    class Solution {
        public int findSpecialInteger(int[] arr) {
            int len = arr.length;
            int pr = len / 4;
            int ans = 0;
            Map<Integer, Integer> map = new HashMap<>();

            for (int num : arr) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > pr) {
                    ans = entry.getKey();
                }
            }
            return ans;
        }
    }
}
