package Luogu.Beginner_1;

import java.util.Scanner;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/22 21:48
 * @Description: 【深基2.例7】数字反转
 */
public class P5705 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for (int i = a.length() - 1; i >= 0; i--) {
            System.out.print(a.charAt(i));
        }
    }
}
