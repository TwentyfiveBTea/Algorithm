package LeetcodeQuestion.BinarySearch;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/23 14:48
 * @Description: 704. 二分查找
 */
public class LeetCode_704 {
    class Solution {
        public int search(int[] nums, int target) {
            int l = 0;
            int r = nums.length - 1;

            while (l <= r) {
                int mid = l + (r - l) / 2;

                if (nums[mid] > target) {
                    r = mid - 1;
                } else if (nums[mid] < target) {
                    l = mid + 1;
                } else {
                    return mid;
                }
            }

            return -1;
        }
    }
}
