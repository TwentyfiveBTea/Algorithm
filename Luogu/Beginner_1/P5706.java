package Luogu.Beginner_1;

import java.util.Scanner;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/22 22:01
 * @Description: 【深基2.例8】再分肥宅水
 */
public class P5706 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ml = sc.nextDouble();
        int i = sc.nextInt();

        System.out.printf("%.3f\n", ml / i);
        System.out.print(i * 2);
    }
}
