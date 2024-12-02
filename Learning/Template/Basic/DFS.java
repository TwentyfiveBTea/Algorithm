package Learning.Template.Basic;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/2 20:27
 * @Description: DFS 深度优先搜索
 */
public class DFS {
    static int N = 10;
    static int n;
    static int[] path = new int[N];
    static boolean[] status = new boolean[N];

    public static void dfs(int x) {
        if (x == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(path[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!status[i]) {
                path[x] = i;
                status[i] = true;
                dfs(x + 1);
                status[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dfs(0);
    }
}