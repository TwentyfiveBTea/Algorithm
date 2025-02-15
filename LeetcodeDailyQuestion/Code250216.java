package LeetcodeDailyQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/16 0:52
 * @Description: 1299. 将每个元素替换为右侧最大元素
 */
public class Code250216 {
    class Solution {
        public int[] replaceElements(int[] arr) {
            int len = arr.length;
            int max = -1;
            for (int i = len - 1; i >= 0; i--) {
                int temp = arr[i];
                arr[i] = max;
                max = Math.max(max, temp);
            }
            return arr;
        }
    }
}
