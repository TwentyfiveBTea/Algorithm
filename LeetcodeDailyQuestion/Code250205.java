package LeetcodeDailyQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/05 18:05
 * @Description: 90. 子集 II
 */
public class Code250205 {
    class Solution {
        public List<List<Integer>> subsetsWithDup(int[] nums) {
            Arrays.sort(nums);
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
            while (i < len && num == nums[i]) {
                i++;
            }
            dfs(i, nums, array, ans);
        }
    }
}
