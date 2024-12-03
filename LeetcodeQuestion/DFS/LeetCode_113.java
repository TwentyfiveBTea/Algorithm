package LeetcodeQuestion.DFS;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/3 10:38
 * @Description: 113. 路径总和 II
 */
public class LeetCode_113 {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {

        private List<List<Integer>> res;

        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            res = new ArrayList<>();
            List<Integer> currentPath = new ArrayList<>();
            dfs(root, targetSum, res, currentPath);
            return res;
        }

        public void dfs(TreeNode root, int targetSum, List<List<Integer>> res, List<Integer> currentPath) {
            if (root == null) {
                return;
            }

            currentPath.add(root.val);

            if (root.val == targetSum && root.left == null && root.right == null) {
                res.add(new ArrayList<>(currentPath));
            } else {
                dfs(root.left, targetSum - root.val, res, currentPath);
                dfs(root.right, targetSum - root.val, res, currentPath);
            }

            currentPath.remove(currentPath.size() - 1);
        }
    }
}
