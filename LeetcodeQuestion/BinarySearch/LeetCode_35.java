package LeetcodeQuestion.BinarySearch;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/14 11:41
 * @Description: 35. 搜索插入位置
 */
public class LeetCode_35 {
    class Solution {
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
