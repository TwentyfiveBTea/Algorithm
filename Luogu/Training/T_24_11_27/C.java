package Luogu.Training.T_24_11_27;

import java.util.Scanner;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/27 19:25
 * @Description: B3620 x 进制转 10 进制
 */
public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String S = sc.next();

        int num = 0;
        int power = S.length() - 1;
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            int value;

            if (Character.isDigit(ch)) {
                value = Character.getNumericValue(ch);
            } else {
                value = Character.toUpperCase(ch) - 'A' + 10;
            }
            num += value * (int) Math.pow(x, power);
            power--;
        }

        System.out.println(num);

    }
}
