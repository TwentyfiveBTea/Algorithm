package Learning.Template.Basic;

import java.util.Scanner;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/21 21:34
 * @Description: 一维前缀和
 */
public class PrefixSum_1 {

    public static final int N = 100010;
    static int[] a = new int[N];
    static int[] s = new int[N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            s[i] = s[i - 1] + a[i];
        }

        while (m-- != 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            System.out.println(s[r] - s[l - 1]);
        }
    }
}
