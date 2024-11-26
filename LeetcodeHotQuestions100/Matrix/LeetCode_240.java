package LeetcodeHotQuestions100.Matrix;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/26 10:03
 * @Description: 240. 搜索二维矩阵 II
 */
public class LeetCode_240 {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int n = matrix.length;
            int j = matrix[0].length - 1;
            int i = 0;

            while (i < n && j >= 0) {
                if (matrix[i][j] == target) {
                    return true;
                }

                if (matrix[i][j] > target) {
                    j--;
                } else {
                    i++;
                }
            }

            return false;
        }
    }
}
