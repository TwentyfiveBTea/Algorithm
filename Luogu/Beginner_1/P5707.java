package Luogu.Beginner_1;

import java.util.Scanner;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/22 22:11
 * @Description: 【深基2.例12】上学迟到
 */
public class P5707 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int v = sc.nextInt();

        int h = 0;
        int m = 0;
        int t = (int) Math.ceil((double) s / (v + 0.0)) + 10;

        int time = 8 * 60;

        int tmp = time - t;

        if (tmp < 0) {
            tmp += 24 * 60;
        }

        h = tmp / 60;
        m = tmp % 60;

        if (h < 10) {
            System.out.print("0" + h);
        } else {
            System.out.print(h);
        }

        System.out.print(":");

        if (m < 10) {
            System.out.print("0" + m);
        } else {
            System.out.print(m);
        }
    }
}
