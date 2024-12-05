package LeetcodeHotQuestions100.Skill;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/5 21:28
 * @Description: 136. 只出现一次的数字
 */
public class LeetCode_136 {
    class Solution {
        public int singleNumber(int[] nums) {
            Set<Integer> set = new HashSet<>();

            for (int num : nums) {
                if (set.contains(num)) {
                    set.remove(num);
                } else {
                    set.add(num);
                }
            }

            return set.iterator().next();
        }
    }
}
