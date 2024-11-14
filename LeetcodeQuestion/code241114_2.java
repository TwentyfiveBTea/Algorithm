package LeetcodeQuestion;

import java.util.Arrays;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/14 10:52
 * @Description: 268. 丢失的数字
 * @Method: 数组
 */
public class code241114_2 {
    class Solution {
        public int missingNumber(int[] nums) {
            int n = nums.length;
            Arrays.sort(nums);

            for(int i = 0; i< n; i++){
                if(nums[i] != i ){
                    return i;
                }
            }

            return n;
        }
    }
}
