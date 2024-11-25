package LeetcodeQuestion.Hash;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/18 22:07
 * @Description: 17.04. 消失的数字
 */
public class LeetCode_17_04 {
    class Solution {
        public int missingNumber(int[] nums) {
            Set<Integer> set = new HashSet();

            for (int num : nums) {
                set.add(num);
            }
            for (int i = 0; i < nums.length; i++) {
                if (!set.contains(i)) {
                    return i;
                }
            }
            return nums.length;
        }
    }
}
