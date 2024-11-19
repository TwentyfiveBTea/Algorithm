package LeetcodeQuestion;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/19 9:46
 * @Description: 41. 缺失的第一个正数
 */
public class code241119_41 {
    class Solution {
        public int firstMissingPositive(int[] nums) {
            Set<Integer> set = new HashSet();
            int max = 0;

            for (int num : nums) {
                set.add(num);
                max = Math.max(num, max);
            }
            for (int i = 1; i < max; i++) {
                if (!set.contains(i)) {
                    return i;
                }
            }

            return max + 1;
        }
    }
}
