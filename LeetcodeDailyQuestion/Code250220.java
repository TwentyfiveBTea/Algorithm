package LeetcodeDailyQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/20 0:41
 * @Description: 2595. 奇偶位数
 */
public class Code250220 {
    class Solution {
        public int[] evenOddBit(int n) {
            int even = 0, odd = 0;
            String str = Integer.toBinaryString(n);
            int len = str.length();

            for (int i = len - 1; i >= 0; i--) {
                if (str.charAt(i) == '1') {
                    if ((len - 1 - i) % 2 == 0) {
                        even++;
                    } else {
                        odd++;
                    }
                }
            }
            return new int[]{even, odd};
        }
    }
}
