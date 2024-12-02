package LeetcodeQuestion.AndCheckTheCollection;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/1 22:31
 * @Description: 1971. 寻找图中是否存在路径
 */
public class LeetCode_1971 {
    class Solution {

        private int[] p;

        public boolean validPath(int n, int[][] edges, int source, int destination) {
            p = new int[n];

            for (int i = 0; i < n; i++) {
                p[i] = i;
            }

            for (int[] edge : edges) {
                p[find(edge[0])] = find(edge[1]);

                if (find(source) == find(destination)) {
                    return true;
                }
            }

            return find(source) == find(destination);
        }

        public int find(int x) {
            if (p[x] != x) {
                p[x] = find(p[x]);
            }

            return p[x];
        }
    }
}
