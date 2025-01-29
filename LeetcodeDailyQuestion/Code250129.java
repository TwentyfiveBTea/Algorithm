package LeetcodeDailyQuestion;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/01/29 21:02
 * @Description: 219. 存在重复元素 II
 */
public class Code250129 {
    class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            int len = nums.length;
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < len; i++) {
                if (map.containsKey(nums[i])) {
                    int index = map.get(nums[i]);

                    if (Math.abs(i - index) <= k) {
                        return true;
                    }
                }
                map.put(nums[i], i);
            }
            return false;
        }
    }
}
