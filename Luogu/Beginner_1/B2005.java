package Luogu.Beginner_1;

import java.util.Scanner;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/22 21:39
 * @Description: 字符三角形
 */
public class B2005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println("  " + s + "  ");
        System.out.println(" " + s + s + s + " ");
        System.out.println(s + s + s + s + s);
    }
}
