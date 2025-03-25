package Learning.Template.Basic;

import java.util.Scanner;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/3/25 19:00
 * @Description: 分组背包问题
 */
public class Bag_Group {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 110;
        int[][] v = new int[N][N];
        int[][] w = new int[N][N];
        int[] s = new int[N];
        int[][] f = new int[N][N];
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            s[i] = sc.nextInt();
            for (int j = 1; j <= s[i]; j++) {
                v[i][j] = sc.nextInt();
                w[i][j] = sc.nextInt();
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                f[i][j] = f[i - 1][j];

                for (int k = 1; k <= s[i]; k++) {
                    if (v[i][k] <= j) {
                        f[i][j] = Math.max(f[i][j], f[i - 1][j - v[i][k]] + w[i][k]);
                    }
                }
            }
        }
        System.out.println(f[n][m]);
    }
}
