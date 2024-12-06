package LeetcodeQuestion.Simulate;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/6 17:42
 * @Description: 682. 棒球比赛
 */
public class LeetCode_682 {
    class Solution {
        public int calPoints(String[] operations) {
            int ans = 0;
            int n = operations.length;
            List<Integer> lists = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if ("C".equals(operations[i])) {
                    lists.remove(lists.size() - 1);
                } else if ("D".equals(operations[i])) {
                    int temp = lists.get(lists.size() - 1) * 2;
                    lists.add(temp);
                } else if ("+".equals(operations[i])) {
                    int temp = lists.get(lists.size() - 2) + lists.get(lists.size() - 1);
                    lists.add(temp);
                } else {
                    lists.add(Integer.parseInt(operations[i]));
                }
            }

            for (int list : lists) {
                ans += list;
            }
            return ans;
        }
    }
}
