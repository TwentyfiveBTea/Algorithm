package LeetcodeDailyQuestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/01/30 21:27
 * @Description: 350. 两个数组的交集 II
 */
public class Code250130 {
    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            Map<Integer, Integer> map = new HashMap<>();
            List<Integer> res = new ArrayList<>();

            for (int num1 : nums1) {
                map.put(num1, map.getOrDefault(num1, 0) + 1);
            }
            for (int num2 : nums2) {
                if (map.containsKey(num2) && map.get(num2) > 0) {
                    res.add(num2);
                    map.put(num2, map.get(num2) - 1);
                }
            }

            return res.stream().mapToInt(x -> x).toArray();
        }
    }
}
