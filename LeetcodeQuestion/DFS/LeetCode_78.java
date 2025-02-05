package LeetcodeQuestion.DFS;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/05 18:18
 * @Description: 78. 子集
 */
public class LeetCode_78 {
    class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            List<Integer> array = new ArrayList<>();
            List<List<Integer>> ans = new ArrayList<>();
            dfs(0, nums, array, ans);
            return ans;
        }

        public void dfs(int i, int[] nums, List<Integer> array, List<List<Integer>> ans) {
            int len = nums.length;
            if (i == len) {
                ans.add(new ArrayList<>(array));
                return;
            }

            int num = nums[i];
            array.add(num);
            dfs(i + 1, nums, array, ans);
            array.remove(array.size() - 1);

            i++;
            dfs(i, nums, array, ans);
        }
    }
}
