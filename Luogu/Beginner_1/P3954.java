package Luogu.Beginner_1;

import java.util.Scanner;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/22 22:28
 * @Description: [NOIP2017 普及组] 成绩
 */
public class P3954 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double all = a * 0.2 + b * 0.3 + c * 0.5;
        System.out.println((int)all);
    }
}
