package Luogu.Beginner_1;

import java.io.IOException;
import java.util.Scanner;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/22 22:26
 * @Description: 小玉买文具
 */
public class P1421 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        int c;

        a += b / 10;
        a = (double) a / 1.9;
        c = (int) a;
        System.out.println(c);
    }
}
