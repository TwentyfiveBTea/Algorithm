package LeetcodeQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/22 17:36
 * @Description: 241122
 */
public class Code241122 {

    /**
     * @Description: 209. 长度最小的子数组
     * @Method: 前缀和 + 二分查找
     */
    class Solution1 {
        public static final int N = 100000;

        public int minSubArrayLen(int target, int[] nums) {
            int len = nums.length;
            int l, r;
            int[] s = new int[N + 1];

            for (int i = 0; i < len; i++) {
                if (nums[i] == target) {
                    return 1;
                }
            }

            for (int i = 1; i <= len; i++) {
                s[i] = s[i - 1] + nums[i - 1];
            }

            int minLen = Integer.MAX_VALUE;

            for (int i = 0; i < len; i++) {
                l = i + 1;
                r = len;

                while (l <= r) {
                    int mid = l + (r - l) / 2;
                    int subArraySum = s[mid] - s[i];

                    if (subArraySum >= target) {
                        r = mid - 1;
                    } else {
                        l = mid + 1;
                    }
                }

                if (l < len + 1 && s[l] - s[i] >= target) {
                    minLen = Math.min(minLen, l - i);
                }
            }

            return minLen == Integer.MAX_VALUE ? 0 : minLen;
        }
    }


    /**
     * @Description: 724. 寻找数组的中心下标
     * @Method: 前缀和
     */
    class Solution2 {
        public int pivotIndex(int[] nums) {
            int len = nums.length;
            int[] s1 = new int[len + 1];
            int[] s2 = new int[len + 1];

            for (int i = 1; i <= len; i++) {
                s1[i] = s1[i - 1] + nums[i - 1];
            }

            for (int i = len - 1; i >= 0; i--) {
                s2[i] = s2[i + 1] + nums[i];
            }

            for (int i = 0; i < len; i++) {
                if (s1[i] == s2[i + 1]) {
                    return i;
                }
            }

            return -1;
        }
    }

    /**
     * @Description: 1480. 一维数组的动态和
     * @Method: 前缀和
     */
    class Solution3 {
        public int[] runningSum(int[] nums) {
            int len = nums.length;
            int[] s = new int[len];

            s[0] = nums[0];
            for (int i = 1; i < len; i++) {
                s[i] = s[i - 1] + nums[i];
            }

            return s;
        }
    }

    /**
     * @Description: 1524. 和为奇数的子数组数目
     * @Method: 前缀和（超时）
     */
    class Solution4_1 {
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

    /**
     * @Description: 1524. 和为奇数的子数组数目
     * @Method: 前缀和 -- 求偶数组
     */
    class Solution4_2 {
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
