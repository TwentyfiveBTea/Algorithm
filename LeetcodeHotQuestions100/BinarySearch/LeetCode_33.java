package LeetcodeHotQuestions100.BinarySearch;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/26 10:02
 * @Description: 33. 搜索旋转排序数组
 */
public class LeetCode_33 {
    class Solution {
        public int search(int[] nums, int target) {
            int index = 0;
            int l = 0;
            int r = nums.length - 1;
            int ans = -1;
            // 找出旋转点的下标
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    index = i + 1;
                    break;
                }
            }

            // 如果 target大于旋转点的数字，那就在右边找，反之
            if (target >= nums[index] && target <= nums[nums.length - 1]) {
                l = index;
                r = nums.length - 1;
            } else {
                r = index - 1;
            }

            // 二分查找
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if (target > nums[mid]) {
                    l = mid + 1;
                } else if (target < nums[mid]) {
                    r = mid - 1;
                } else {
                    ans = mid;
                    break;
                }
            }

            return ans;
        }
    }
}
