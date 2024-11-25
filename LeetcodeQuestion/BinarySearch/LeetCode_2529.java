package LeetcodeQuestion.BinarySearch;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/23 16:28
 * @Description: 2529. 正整数和负整数的最大计数
 */
public class LeetCode_2529 {
    class Solution {
        public int maximumCount(int[] nums) {
            // 找到第一个大于等于 0 的位置
            int index1 = findIndex(nums, 0);
            // 找到第一个大于 0 的位置
            int index2 = nums.length - findIndex(nums, 1);
            return Math.max(index1, index2);
        }


        public int findIndex(int[] nums, int target) {
            int l = 0;
            int r = nums.length - 1;

            while (l <= r) {
                int mid = l + (r - l) / 2;

                if (nums[mid] < target) {
                    l = mid + 1;
                } else if (nums[mid] > target) {
                    r = mid - 1;
                } else {
                    /**
                     * 当找到等于目标值的元素时，需要特殊处理
                     * 我们要找的是严格小于目标值的元素个数，所以这里要向左继续查找
                     * 直到找到最左边的等于目标值的元素，然后返回其左边元素的个数
                     */
                    while (mid > 0 && nums[mid - 1] == target) {
                        mid--;
                    }
                    return mid;
                }
            }

            return l;
        }
    }
}
