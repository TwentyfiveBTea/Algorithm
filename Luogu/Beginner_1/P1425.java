package Luogu.Beginner_1;

import java.util.Scanner;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/22 22:24
 * @Description: 小鱼的游泳时间
 */
public class P1425 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int e = c - a;
        int f = d - b;
        if (f < 0) {
            e = c - a - 1;
            f = d - b + 60;
        }

        System.out.println(e + " " + f);
    }
}
