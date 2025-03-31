package Learning.Template.Basic;

import java.util.Scanner;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/3/31 15:46
 * @Description: 数字三角形
 */
public class NumberTriangles {
    public static void main(String[] args) {
        int N = 510;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[N][N];
        int[][] f = new int[N][N];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i + 1; j++) {
                f[i][j] = -Integer.MAX_VALUE / 2;
            }
        }

        f[1][1] = a[1][1];
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                f[i][j] = Math.max(f[i - 1][j - 1] + a[i][j], f[i - 1][j] + a[i][j]);
            }
        }

        int ans = -Integer.MAX_VALUE / 2;
        for (int i = 1; i <= n; i++) {
            ans = Math.max(ans, f[n][i]);
        }
        System.out.println(ans);
    }
}
