package LeetcodeQuestion.DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/06 12:12
 * @Description: 46. 全排列
 */
public class LeetCode_46 {
    class Solution {
        public List<List<Integer>> permute(int[] nums) {
            Arrays.sort(nums);
            int len = nums.length;
            boolean[] boo = new boolean[len];
            List<Integer> array = Arrays.asList(new Integer[len]);
            List<List<Integer>> ans = new ArrayList<>();
            dfs(0, nums, boo, array, ans);
            return ans;
        }

        public void dfs(int i, int[] nums, boolean[] boo, List<Integer> array, List<List<Integer>> ans) {
            if (i == nums.length) {
                ans.add(new ArrayList<>(array));
                return;
            }

            for (int j = 0; j < nums.length; j++) {
                if (boo[j]) continue;

                array.set(i, nums[j]);
                boo[j] = true;
                dfs(i + 1, nums, boo, array, ans);
                boo[j] = false;
            }
        }
    }
}
