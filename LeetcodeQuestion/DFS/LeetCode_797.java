package LeetcodeQuestion.DFS;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/3 11:17
 * @Description: 797. 所有可能的路径
 */
public class LeetCode_797 {
    class Solution {

        List<List<Integer>> ans = new ArrayList<>();
        Deque<Integer> stack = new ArrayDeque<>();

        public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
            int n = graph.length - 1;
            stack.offerLast(0);
            dfs(graph, 0, n);
            return ans;
        }

        public void dfs(int[][] graph, int u, int n) {
            if (u == n) {
                ans.add(new ArrayList<Integer>(stack));
                return;
            }

            for (int num : graph[u]) {
                stack.offerLast(num);
                dfs(graph, num, n);
                stack.pollLast();
            }
        }
    }
}
