package Learning.Template.Basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/04/11 11:10
 * @Description: 滑雪
 */
public class skiing {

    static int N = 310, n, m;
    static int[][] f = new int[N][N];
    static int[][] h = new int[N][N];
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                h[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            Arrays.fill(f[i], -1);
        }

        int res = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                res = Math.max(res, dp(i, j));
            }
        }
        System.out.println(res);
    }

    public static int dp(int x, int y) {
        if (f[x][y] != -1) {
            return f[x][y];
        }

        f[x][y] = 1;
        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (newX >= 1 && newX <= n && newY >= 1 && newY <= m && h[newX][newY] < h[x][y]) {
                f[x][y] = Math.max(f[x][y], dp(newX, newY) + 1);
            }
        }
        return f[x][y];
    }
}
