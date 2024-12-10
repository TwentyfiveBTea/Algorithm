package Learning.Template.Basic;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/10 22:11
 * @Description: 多重背包问题
 */
public class Bag_Multiple {
    public static void main(String[] args) {
        int N = 110;
        int[] v = new int[N];
        int[] w = new int[N];
        int[] s = new int[N];
        int[][] f = new int[N][N];

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
            w[i] = sc.nextInt();
            s[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                for (int k = 0; k <= s[i] && k * v[i] <= j; k++) {
                    f[i][j] = Math.max(f[i][j], f[i - 1][j - k * v[i]] + k * w[i]);
                }
            }
        }

        System.out.println(f[n][m]);
    }
}
