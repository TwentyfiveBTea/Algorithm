package LeetcodeDailyQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/13 19:27
 * @Description: 34、在排序数组中查找元素的第一个和最后一个位置
 */
public class code241113_34 {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int[] ans = new int[]{-1, -1};
            int n = nums.length;
            if (n == 0) return ans;

            int l = 0, r = n - 1;

            // 第一次二分查找，确定目标值的最左位置
            while (l < r) {
                int mid = l + r >> 1;
                if (nums[mid] >= target) {
                    r = mid;
                } else {
                    l = mid + 1;
                }
            }
            if (nums[l]!= target) {
                return ans;
            } else {
                ans[0] = l;

                // 重置左右指针
                l = 0; r = n - 1;

                // 第二次二分查找，确定目标值的最右位置
                while (l < r) {
                    int mid = l + r + 1 >> 1;
                    if (nums[mid] <= target) {
                        l = mid;
                    } else {
                        r = mid - 1;
                    }
                }
                ans[1] = l;
                return ans;
            }
        }
    }
}
