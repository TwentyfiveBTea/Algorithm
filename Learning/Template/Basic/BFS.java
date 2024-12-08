package Learning.Template.Basic;

import java.io.BufferedInputStream;
import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/3 18:23
 * @Description: BFS广度优先搜索
 */
public class BFS {

    static int N = 110;
    static int[][] g = new int[N][N];
    static int[][] d = new int[N][N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                g[i][j] = sc.nextInt();
            }
        }

        System.out.println(bfs(n, m));
        sc.close();
    }

    public static int bfs(int n, int m) {
        Queue<int[]> queue = new LinkedList<>();
        d[0][0] = 0;

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        queue.add(new int[]{0, 0});

        while (!queue.isEmpty()) {
            int[] a = queue.poll();

            for (int i = 0; i < 4; i++) {
                int x = a[0] + dx[i];
                int y = a[1] + dy[i];

                if (x >= 0 && x < n && y >= 0 && y < n && g[x][y] == 0 && d[x][y] == 0) {
                    d[x][y] = d[a[0]][a[1]] + 1;
                    queue.offer(new int[]{x, y});
                }
            }
        }

        return d[n - 1][m - 1];
    }
}
