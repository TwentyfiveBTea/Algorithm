package LeetcodeQuestion.BinarySearch;

import java.util.Arrays;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/14 14:35
 * @Description: 2517. 礼盒的最大甜蜜度
 */
public class LeetCode_2517 {
    class Solution {
        public int maximumTastiness(int[] price, int k) {
            Arrays.sort(price);
            int l = 0, r = price[price.length - 1];
            int ans = 0;

            while (l <= r) {
                int mid = l + (r - l) / 2;
                if (check(price, k, mid)) {
                    ans = mid;
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
            return ans;
        }

        public boolean check(int[] price, int k, int mid) {
            int pri = price[0];
            int cnt = 1;
            for (int i = 1; i < price.length; i++) {
                if (price[i] - pri >= mid) {
                    cnt++;
                    pri = price[i];
                }
            }
            return cnt >= k;
        }
    }
}
