package Learning.Template.Basic;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/10 15:52
 * @Description: 树与图 -- BFS
 */
public class Tree_Diagram_BFS {
    static int N = 100010;
    static int n;
    static int m;
    static int idx;
    static int hh;
    static int tt;
    static int[] h = new int[N];
    static int[] e = new int[N];
    static int[] ne = new int[N];
    static int[] d = new int[N];
    static int[] q = new int[N];

    public static void add(int a, int b) {
        e[idx] = b;
        ne[idx] = h[a];
        h[a] = idx++;
    }

    public static int bfs() {
        hh = 0;
        tt = -1;
        d[1] = 0;
        q[++tt] = 1;

        while (hh <= tt) {
            int t = q[hh++];

            for (int i = h[t]; i != -1; i = ne[i]) {

                int s = e[i];
                if (d[s] == -1) {
                    d[s] = d[t] + 1;
                    q[++tt] = s;
                }
            }
        }
        return d[n];


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();

        for (int i = 1; i < N; i++) {
            h[i] = -1;
            d[i] = -1;
        }
        for (int i = 0; i < m; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            add(a, b);
        }
        System.out.println(bfs());
    }
}
