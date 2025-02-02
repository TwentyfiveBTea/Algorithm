package LeetcodeDailyQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/02 18:18
 * @Description: 81. 搜索旋转排序数组 II
 */
public class Code250201 {
    class Solution {
        public boolean search(int[] nums, int target) {
            int len = nums.length;
            int index = -1;
            for (int i = 0; i < len - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    index = i;
                    break;
                }
            }

            int ll = 0, lr = index, rl = index + 1, rr = len - 1;
            while (ll <= lr) {
                int lmid = ll + (lr - ll) / 2;
                if (target > nums[lmid]) {
                    ll = lmid + 1;
                } else if (target < nums[lmid]) {
                    lr = lmid - 1;
                } else {
                    return true;
                }
            }

            while (rl <= rr) {
                int rmid = rl + (rr - rl) / 2;
                if (target > nums[rmid]) {
                    rl = rmid + 1;
                } else if (target < nums[rmid]) {
                    rr = rmid - 1;
                } else {
                    return true;
                }
            }

            return false;
        }
    }
}
