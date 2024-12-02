package Learning.Template.Basic;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/2 21:55
 * @Description: DFS -- n皇后问题
 */
public class N_Queens {

    private static int n, N = 20;
    private static char[][] g = new char[N][N];
    private static boolean[] col = new boolean[N];
    private static boolean[] dg = new boolean[N];
    private static boolean[] udg = new boolean[N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                g[i][j] = '.';
            }
        }

        dfs(0);
    }

    public static void dfs(int u) {
        if (u == n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(g[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!col[i] && !dg[i + u] && !udg[i - u + n]) {
                g[u][i] = 'Q';
                col[i] = dg[i + u] = udg[i - u + n] = true;
                dfs(u + 1);
                col[i] = dg[i + u] = udg[i - u + n] = false;
                g[u][i] = '.';
            }
        }
    }
}
