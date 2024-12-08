package LeetcodeQuestion.Array;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/6 14:17
 * @Description: 169. 多数元素
 */
public class LeetCode_169 {
    class Solution {
        public int majorityElement(int[] nums) {
            int n = nums.length;
            Arrays.sort(nums);
            return nums[n / 2];
        }
    }
}
