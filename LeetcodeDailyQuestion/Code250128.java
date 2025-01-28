package LeetcodeDailyQuestion;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/01/28 16:15
 * @Description: 119. 杨辉三角 II
 */
public class Code250128 {
    class Solution {
        public List<Integer> getRow(int rowIndex) {
            List<Integer> ans = new ArrayList<>();
            for (int i = 0; i <= rowIndex; i++) {
                ans.add(1);
            }

            for (int i = 1; i <= rowIndex; i++) {
                for (int j = i - 1; j > 0; j--) {
                    ans.set(j, ans.get(j) + ans.get(j - 1));
                }
            }

            return ans;
        }
    }
}
