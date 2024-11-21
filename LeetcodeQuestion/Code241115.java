package LeetcodeQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/15 20:10
 * @Description: 241115
 */
public class Code241115 {

    /**
     * @Description: 658. 找到 K 个最接近的元素
     * @Method: 滑动窗口
     */
    class Solution1 {
        public double findMaxAverage(int[] nums, int k) {
            double ans = Integer.MIN_VALUE;
            int l = 0;
            int r = 0;
            double count = 0;

            while (r < nums.length) {
                count += nums[r];

                if (r - l + 1 == k) {
                    ans = Math.max(ans, count / k);
                    count -= nums[l++];
                }
                r++;
            }

            return ans;
        }
    }

    /**
     * @Description: 3254. 长度为 K 的子数组的能量值 I
     * @Method: 滑动窗口
     */
    class Solution2 {
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
