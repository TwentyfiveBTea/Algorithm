package Learning.Template.Basic;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/10 14:11
 * @Description: 树与图 -- DFS
 */
public class Tree_Diagram_DFS {

    static int N = 100010;
    static int M = N * 2;
    static int idx;
    static int n;
    static int[] h = new int[N];
    static int[] e = new int[M];
    static int[] ne = new int[M];
    static boolean[] st = new boolean[N];
    static int ans = N;

    public static void add(int a, int b) {
        e[idx] = b;
        ne[idx] = h[a];
        h[a] = idx++;
    }

    public static int dfs(int u) {
        int res = 0;
        st[u] = true;
        int sum = 1;

        for (int i = h[u]; i != -1; i = ne[i]) {
            int j = e[i];

            if (!st[j]) {
                int s = dfs(j);
                res = Math.max(res, s);
                sum += s;
            }
        }

        res = Math.max(res, n - sum);
        ans = Math.min(res, ans);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i < N; i++) {
            h[i] = -1;
        }

        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            add(a, b);
            add(b, a);
        }

        dfs(1);
        System.out.println(ans);
    }
}
