package LeetcodeQuestion.Enumerate;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/23 17:03
 * @Description: 1385. 两个数组间的距离值
 */
public class LeetCode_1385 {
    class Solution {
        public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
            int len1 = arr1.length;
            int len2 = arr2.length;
            int count = 0;

            for (int i = 0; i < len1; i++) {
                for (int j = 0; j < len2; j++) {
                    int ans = arr1[i] - arr2[j];

                    if (Math.abs(ans) <= d) {
                        break;
                    } else if (j == len2 - 1) {
                        count++;
                    }
                }
            }

            return count;
        }
    }
}
