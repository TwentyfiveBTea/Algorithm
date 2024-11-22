package Luogu.Beginner_1;

import java.util.Scanner;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/22 21:43
 * @Description: 【深基2.例6】字母转换
 */
public class P5704 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch1 = sc.next().charAt(0);
        char ch2 = Character.toUpperCase(ch1);

        System.out.println(ch2);
    }
}
