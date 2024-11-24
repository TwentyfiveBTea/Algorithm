package LeetcodeQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/24 18:16
 * @Description: 241124
 */
public class Code241124 {

    /**
     * @Description: 643. 子数组最大平均数 I
     * @Method: 滑动窗口
     */
    class Solution1 {
        public double findMaxAverage(int[] nums, int k) {
            double ans = Integer.MIN_VALUE;
            int l = 0;
            int r = 0;
            int len = nums.length;
            double cnt = 0.0;

            while (r < len) {
                cnt += nums[r];

                if (r - l + 1 == k) {
                    ans = Math.max(ans, cnt / k);
                    cnt -= nums[l];
                    l++;
                }
                r++;
            }

            return ans;
        }
    }

    /**
     * @Description: 1343. 大小为 K 且平均值大于等于阈值的子数组数目
     * @Method: 滑动窗口
     */
    class Solution2 {
        public int numOfSubarrays(int[] arr, int k, int threshold) {
            int len = arr.length;
            int l = 0, r = 0;
            int sum = 0;
            int cnt = 0;
            double avg = 0.0;

            while (r < len) {
                sum += arr[r];

                if (r - l + 1 == k) {
                    avg = (double) sum / k;

                    if (avg >= threshold) {
                        cnt++;
                    }
                    sum -= arr[l];
                    l++;
                }
                r++;
            }

            return cnt;
        }
    }
}
