package LeetcodeQuestion;

import java.util.Arrays;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/14 10:52
 * @Description: 241114
 */
public class Code241114 {

    /**
     * @Description: 268. 丢失的数字
     * @Method: 数组
     */
    class Solution1 {
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

    /**
     * @Description: 35. 搜索插入位置
     * @Method: 二分查找
     */
    class Solution2 {
        public int searchInsert(int[] nums, int target) {
            int l = 0, h = nums.length - 1;

            while (l <= h) {
                int mid = l + (h - l) / 2;

                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] > target) {
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }
            }

            return l;
        }
    }
}
