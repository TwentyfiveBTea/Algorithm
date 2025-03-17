package Learning.Template.Basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/3/17 14:19
 * @Description: Dijkstra最短路 1
 */
public class Dijkstra_1 {

    static int N = 510, max = 0x3f3f3f3f;
    static int n, m;
    static boolean[] st = new boolean[N];
    static int[][] gird = new int[N][N];
    static int[] dis = new int[N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            Arrays.fill(gird[i], max);
        }

        while (m-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            gird[a][b] = Math.min(gird[a][b], c);
        }

        int ans = dijkstra();
        System.out.println(ans);
    }

    public static int dijkstra() {
        Arrays.fill(dis, max);
        dis[1] = 0;

        for (int i = 0; i < n; i++) {
            int t = -1;

            for (int j = 1; j <= n; j++) {
                if (!st[j] && (t == -1 || dis[t] > dis[j])) {
                    t = j;
                }
            }
            st[t] = true;

            for (int j = 1; j <= n; j++) {
                dis[j] = Math.min(dis[j], dis[t] + gird[t][j]);
            }
        }

        if (dis[n] == max) return -1;
        return dis[n];
    }

}
