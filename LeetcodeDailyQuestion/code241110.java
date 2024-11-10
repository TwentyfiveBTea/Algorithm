package LeetcodeDailyQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/10 17:30
 * @Description: 540、有序数组中的单一元素 -- 中等
 * @Solution: https://leetcode.cn/problems/single-element-in-a-sorted-array/solutions/2983947/540-you-xu-shu-zu-zhong-de-dan-yi-yuan-s-gtmv/
 */
public class code241110 {
    class Solution {
        public int singleNonDuplicate(int[] nums) {
            int l = 0, r = nums.length - 1, mid = 0;

            while (l < r) {
                mid = (l + r) / 2;

                // 判断 mid 下标是否为偶数
                if (mid % 2 == 0) {
                    // 如果是，则说明在正常情况下下一位应该与之匹配
                    if (nums[mid] == nums[mid + 1]) {
                        l = mid + 1;
                    } else {
                        r = mid;
                    }
                } else {
                    // 如果为奇数，那么在正常情况下前一位应该与之匹配
                    if (nums[mid] == nums[mid - 1]) {
                        l = mid + 1;
                    } else {
                        r = mid;
                    }
                }
            }
            return nums[r];
        }
    }
}
