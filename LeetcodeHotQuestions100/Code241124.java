package LeetcodeHotQuestions100;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/24 18:09
 * @Description: 240. 搜索二维矩阵 II
 * @Method: 矩阵
 */
public class Code241124 {
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
