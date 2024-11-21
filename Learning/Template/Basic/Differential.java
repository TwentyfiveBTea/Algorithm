package Learning.Template.Basic;

import java.util.Scanner;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/21 22:26
 * @Description: 差分
 */
public class Differential {
    public static final int N = 100010;
    static int[] a = new int[N];
    static int[] b = new int[N];

    static void insert(int l, int r, int c) {
        b[l] += c;
        b[r + 1] -= c;
    }

    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            insert(i, i, a[i]);
        }

        while (m-- != 0) {
            int l, r, c;
            l = sc.nextInt();
            r = sc.nextInt();
            c = sc.nextInt();

            insert(l, r, c);
        }

        for (int i = 1; i <= n; i++) {
            b[i] += b[i - 1];
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(b[i] + " ");
        }
    }
}
