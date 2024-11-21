package LeetcodeQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/16 21:10
 * @Description: 241116
 */
public class Code241116 {

    /**
     * @Description: 74. 搜索二维矩阵
     * @Method: 二分查找
     */
    class Solution1 {
        public boolean searchMatrix(int[][] matrix, int target) {
            int m = matrix.length;
            int n = matrix[0].length;

            int l = 0;
            int r = m * n - 1;

            while(l <= r){
                int mid = l + (r - l) / 2;
                // 查找矩阵在一维数组的绝对位置
                int x = matrix[mid / n][mid % n];

                if(target > x){
                    l = mid + 1;
                } else if(target < x){
                    r = mid - 1;
                } else {
                    return true;
                }
            }

            return false;
        }
    }

}