package LeetcodeDailyQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/4/14 12:12
 * @Description: 1534. 统计好三元组
 */
public class Code250414 {
    class Solution {
        public int countGoodTriplets(int[] arr, int a, int b, int c) {
            int len = arr.length;
            int ans = 0;
            for (int i = 0; i < len; i++) {
                for (int j = i + 1; j < len; j++) {
                    for (int k = j + 1; k < len; k++) {
                        if (Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                            ans++;
                        }
                    }
                }
            }
            return ans;
        }
    }
}
