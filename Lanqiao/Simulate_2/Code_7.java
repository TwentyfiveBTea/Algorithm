package Lanqiao.Simulate_2;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/7 11:58
 * @Description:
 */
public class Code_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int ans = Integer.MAX_VALUE;
        int cnt;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                cnt = a[i];
                ans = Math.min(ans, cnt);
            }
        }

        System.out.println(ans);
    }
}
