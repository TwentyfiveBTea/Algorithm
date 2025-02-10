package Luogu.Algorithm_1_3_Brute_forceEnumeration;

import java.util.Scanner;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/10 12:40
 * @Description: 统计方形（数据加强版）
 */
public class P2241 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        long sq = 0, re = 0;
        for(int i = 1; i <= Math.min(n, m); i++){
            sq += (long) (n - i + 1) * (m - i + 1);
        }

        long all = (long) (n * (n + 1) / 2) * (m * (m + 1) / 2);
        re = all - sq;
        System.out.print(sq + " " + re);
    }
}
