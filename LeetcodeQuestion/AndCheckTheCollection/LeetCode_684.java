package LeetcodeQuestion.AndCheckTheCollection;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/2 14:18
 * @Description: 684. 冗余连接
 */
public class LeetCode_684 {
    class Solution {

        private int[] p;

        public int[] findRedundantConnection(int[][] edges) {
            int n = edges.length;
            p = new int[n];

            for (int i = 0; i < n; i++) {
                p[i] = i;
            }

            for (int[] edge : edges) {
                int a = find(edge[0] - 1);
                int b = find(edge[1] - 1);

                if (a == b) {
                    return edge;
                } else {
                    p[a] = b;
                }
            }

            return new int[]{-1, -1};
        }

        public int find(int x) {
            if (p[x] != x) {
                p[x] = find(p[x]);
            }
            return p[x];
        }
    }
}
