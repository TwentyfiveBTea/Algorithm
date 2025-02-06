package LeetcodeDailyQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/06 12:05
 * @Description: 47. 全排列 II
 */
public class Code250206 {
    class Solution {
        public List<List<Integer>> permuteUnique(int[] nums) {
            int len = nums.length;
            Arrays.sort(nums);
            boolean[] boo = new boolean[len];
            List<Integer> array = Arrays.asList(new Integer[nums.length]);
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
                if (boo[j] || j > 0 && nums[j] == nums[j - 1] && !boo[j - 1]) {
                    continue;
                }
                array.set(i, nums[j]);
                boo[j] = true;
                dfs(i + 1, nums, boo, array, ans);
                boo[j] = false;
            }
        }
    }
}
