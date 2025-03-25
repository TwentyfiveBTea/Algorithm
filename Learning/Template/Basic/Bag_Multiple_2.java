package Learning.Template.Basic;

import java.util.Scanner;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/3/25 18:16
 * @Description: 多重背包问题 2
 */
public class Bag_Multiple_2 {
    public static void main1(String[] args) {

        /**
         *  超空间
         */
        int N = 12000;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] v = new int[N];
        int[] w = new int[N];
        int[][] f = new int[N][N];
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int s = sc.nextInt();
            int k = 1;

            while (s >= k) {
                cnt++;
                v[cnt] = a * k;
                w[cnt] = b * k;
                s -= k;
                k *= 2;
            }

            if (s > 0) {
                cnt++;
                v[cnt] = a * s;
                w[cnt] = b * s;
            }
        }
        n = cnt;

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

    /**
     * 空间优化
     */
    public static void main2(String[] ags) {
        Scanner sc = new Scanner(System.in);
        int N = 12000;
        int[] v = new int[N];
        int[] w = new int[N];
        int[] f = new int[N];
        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int s = sc.nextInt();
            int k = 1;

            while (s >= k) {
                cnt++;
                v[cnt] = a * k;
                w[cnt] = b * k;
                s -= k;
                k *= 2;
            }

            if (s > 0) {
                cnt++;
                v[cnt] = a * s;
                w[cnt] = b * s;
            }
        }
        n = cnt;

        for (int i = 1; i <= n; i++)
            for (int j = m; j >= v[i]; j--)
                f[j] = Math.max(f[j], f[j - v[i]] + w[i]);

        System.out.println(f[m]);
    }
}

