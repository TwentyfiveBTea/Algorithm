package LeetcodeQuestion.SlideTheWindow;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/24 19:09
 * @Description: 1343. 大小为 K 且平均值大于等于阈值的子数组数目
 */
public class LeetCode_1343 {
    class Solution {
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
