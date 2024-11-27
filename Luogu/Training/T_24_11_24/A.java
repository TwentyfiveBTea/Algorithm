package Luogu.Training.T_24_11_24;

import java.util.Scanner;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/24 13:37
 * @Description: B3845 [GESP样题 二级] 勾股数
 */
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for (int c = 1; c <= n; c++) {
            for (int b = 1; b <= c; b++) {
                for (int a = 1; a <= b; a++) {
                    if (a * a + b * b == c * c) {
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}
