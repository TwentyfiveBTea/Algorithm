package LeetcodeQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/15 19:18
 * @Description: 3254. 长度为 K 的子数组的能量值 I
 * @Method: 滑动窗口
 */
public class code241115_3254 {
    class Solution {
        public int[] resultsArray(int[] nums, int k) {
            int[] results = new int[nums.length - k + 1];
            int index = 0;
            int l = 0;
            int r = 0;

            for (int i = l; i < nums.length; i++) {
                r = i;
                if (r - l + 1 == k) {
                    results[index++] = testArray(l, r, nums);
                    l++;
                }
            }
            return results;
        }

        public int testArray(int l, int r, int[] nums) {
            for (int i = l; i < r; i++) {
                if (nums[i] + 1 != nums[i + 1]) {
                    return -1;
                }
            }
            return nums[r];
        }
    }
}
