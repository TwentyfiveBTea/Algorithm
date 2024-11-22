package Luogu.Beginner_1;

import java.util.Scanner;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/22 22:18
 * @Description: 大象喝水
 */
public class B2029 {
    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int r = sc.nextInt();

        double s = PI * r * r;
        double l = s * h * 0.001;

        System.out.println((int)(20 / l) + 1);
    }
}
