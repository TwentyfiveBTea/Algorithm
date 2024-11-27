package Luogu.Training.T_24_11_27;

import java.util.Scanner;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/27 19:16
 * @Description: B3619 10 进制转 x 进制
 */
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        StringBuilder stringBuilder = new StringBuilder();

        if (n == 0) {
            System.out.println("0");
        }

        while (n > 0) {
            int num = n % x;
            if (num < 10) {
                stringBuilder.append(num);
            } else {
                stringBuilder.append('A' + num - 10);
            }

            n /= x;
        }

        System.out.println(stringBuilder.reverse());
    }
}
