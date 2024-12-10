package Learning.Template.Basic;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/10 20:52
 * @Description: 01背包问题
 */
public class Bag_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 1010;
        int[] v = new int[N];
        int[] w = new int[N];
        int[][] f = new int[N][N];
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
            w[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                f[i][j] = f[i - 1][j];

                if (j >= v[i]) {
                    f[i][j] = Math.max(f[i][j], f[i - 1][j - v[i]] + w[i]);
                }
            }
        }

        System.out.println(f[n][m]);
    }
}
