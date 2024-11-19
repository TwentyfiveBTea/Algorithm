package LeetcodeQuestion;

import java.util.*;


/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/18 21:32
 * @Description: 17.04. 消失的数字
 * @Method: 数组
 * @Method: Set
 */
public class code241118_17_04 {
    class Solution {
        public int missingNumber(int[] nums) {
            int ans = 0;
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != i) {
                    return i;
                }
            }
            return nums.length;
        }
    }

    class Solution2 {
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
