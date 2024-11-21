package LeetcodeDailyQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/22 01:52
 * @Description: 3233. 统计不是特殊数字的数字数量
 */
public class Code241122 {
    /**
     * @Method: 暴力（超时）
     */
    class Solution1 {
        public int nonSpecialCount(int l, int r) {
            int count = 0;
            for (int num = l; num <= r; num++) {
                int real = 0;

                for (int i = 1; i < num; i++) {
                    if (num % i == 0) {
                        real++;
                    }
                }
                if (real != 2) {
                    count++;
                }
            }

            return count;
        }
    }

    /**
     * @Method: 找素数
     */
    class Solution2 {
        public int nonSpecialCount(int l, int r) {
            int cnt = 0;
            //转换成找素数
            for (int i = 2; i <= Math.sqrt(r); i++) {
                if (i * i <= r && i * i >= l && isPrime(i)) {
                    cnt++;
                }
            }
            return r - l + 1 - cnt;
        }

        public boolean isPrime(int n) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        }
    }
}
