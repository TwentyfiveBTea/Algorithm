package Learning.Template.Basic;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/10 21:48
 * @Description: 完全背包问题
 */
public class Bag_Full {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int N = 1010;
        int f[][] = new int[N][N];
        int[] v = new int[N];
        int[] w = new int[N];

        for (int i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
            w[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                f[i][j] = f[i - 1][j];

                if (j >= v[i]) {
                    f[i][j] = Math.max(f[i][j], f[i][j - v[i]] + w[i]);
                }
            }
        }

        System.out.println(f[n][m]);
    }
}
