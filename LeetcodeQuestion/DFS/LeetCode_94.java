package LeetcodeQuestion.DFS;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/3 10:01
 * @Description: 94. 二叉树的中序遍历
 */
public class LeetCode_94 {

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

        private List<Integer> res = new ArrayList<>();

        public List<Integer> inorderTraversal(TreeNode root) {
            dfs(root);
            return res;
        }

        public void dfs(TreeNode root) {
            if (root == null) {
                return;
            } else {
                dfs(root.left);
                res.add(root.val);
                dfs(root.right);
            }
        }
    }
}
