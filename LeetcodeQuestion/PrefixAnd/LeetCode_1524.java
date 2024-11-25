package LeetcodeQuestion.PrefixAnd;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/22 22:27
 * @Description: 1524. 和为奇数的子数组数目
 */
public class LeetCode_1524 {

    /**
     * 超时
     */
    class Solution1 {
        public int numOfSubarrays(int[] arr) {
            final int MOD = 1000000007;
            int len = arr.length;
            int count = 0;
            int[] s = new int[len];

            s[0] = arr[0];
            for (int i = 1; i < len; i++) {
                s[i] = s[i - 1] + arr[i];
            }

            for (int i = 0; i < len; i++) {
                for (int j = i; j < len; j++) {
                    int subArraySum;

                    if (i == 0) {
                        subArraySum = s[j];
                    } else {
                        subArraySum = s[j] - s[i - 1];
                    }

                    if (subArraySum % 2 != 0) {
                        count++;
                        count %= MOD;
                    }

                }
            }

            return count;
        }
    }


    class Solution2 {
        public int numOfSubarrays(int[] arr) {
            int MOD = 1000000007;
            int sum = 0; // 用于记录当前前缀和
            int oddCount = 0; // 用于记录奇数前缀和的个数
            int evenCount = 1; // 用于记录偶数前缀和的个数，初始化为1是为了包括单个元素的情况

            int result = 0; // 用于记录满足条件的子数组数目

            for (int num : arr) {
                sum = (sum + num) % 2; // 计算当前前缀和的奇偶性

                if (sum == 1) {
                    result = (result + evenCount) % MOD; // 如果当前前缀和是奇数，加上之前的偶数前缀和数目
                    oddCount++; // 奇数前缀和数目加1
                } else {
                    result = (result + oddCount) % MOD; // 如果当前前缀和是偶数，加上之前的奇数前缀和数目
                    evenCount++; // 偶数前缀和数目加1
                }
            }

            return result;
        }
    }
}
