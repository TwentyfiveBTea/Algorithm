package Luogu.Beginner_1;

import java.util.Scanner;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/22 22:05
 * @Description: 【深基2.习2】三角形面积
 */
public class P5708 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.printf("%.1f", s);
    }
}
