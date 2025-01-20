package LeetcodeQuestion.Array;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/12 21:15
 * @Description: 1093. 大样本统计
 */
public class LeetCode_1093 {
    class Solution {
        public double[] sampleStats(int[] count) {
            double minimum = Integer.MAX_VALUE, maximum = Integer.MIN_VALUE, mean = 0.0, median = 0.0, mode = 0.0, sum = 0.0;
            int n = count.length;
            int totalCount = 0;
            int modeCount = 0;
            int midIndex1 = 0;
            int midIndex2 = 0;

            for (int i = 0; i < n; i++) {
                if (count[i] > 0) {
                    minimum = Math.min(minimum, i);
                    maximum = Math.max(maximum, i);
                }
                sum += (double) i * count[i];
                totalCount += count[i];
                if (count[i] > modeCount) {
                    modeCount = count[i];
                    mode = i;
                }
            }

            mean = sum / totalCount;

            int countSum = 0;
            if (totalCount % 2 == 0) {
                int halfCount = totalCount / 2;
                for (int i = 0; i < n; i++) {
                    countSum += count[i];
                    if (countSum >= halfCount) {
                        midIndex1 = i;
                        break;
                    }
                }
                countSum = 0;
                for (int i = 0; i < n; i++) {
                    countSum += count[i];
                    if (countSum >= halfCount + 1) {
                        midIndex2 = i;
                        break;
                    }
                }
                median = (midIndex1 + midIndex2) / 2.0;
            } else {
                int halfCount = totalCount / 2;
                for (int i = 0; i < n; i++) {
                    countSum += count[i];
                    if (countSum > halfCount) {
                        median = i;
                        break;
                    }
                }
            }

            return new double[]{minimum, maximum, mean, median, mode};
        }
    }
}
