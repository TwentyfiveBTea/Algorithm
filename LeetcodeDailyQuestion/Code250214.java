package LeetcodeDailyQuestion;

import java.util.Arrays;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/14 14:12
 * @Description: 1552. 两球之间的磁力
 */
public class Code250214 {
    class Solution {
        public int maxDistance(int[] position, int m) {
            Arrays.sort(position);
            int l = 1, r = position[position.length - 1];

            while (l <= r) {
                int mid = l + (r - l) / 2;
                if (check(position, m, mid)) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
            return r;
        }

        public boolean check(int[] position, int m, int mid) {
            int pos = position[0];
            int cnt = 1;
            for (int i = 1; i < position.length; i++) {
                if (position[i] - pos >= mid) {
                    cnt++;
                    pos = position[i];
                }
            }
            return cnt >= m;
        }
    }
}
