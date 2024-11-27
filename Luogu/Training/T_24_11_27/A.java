package Luogu.Training.T_24_11_27;

import java.util.Scanner;

/**
 * @Author: TwentyFiveBTea11
 * @Date: 2024/11/27 19:07
 * @Description: P6353 [COCI2007-2008#3] OKTALNI
 */
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.nextLine();

        while (binary.length() % 3 != 0) {
            binary = "0" + binary;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < binary.length(); i += 3) {
            String temp = binary.substring(i, i + 3);
            int num = Integer.parseInt(temp, 2);
            String str = Integer.toOctalString(num);
            stringBuilder.append(str);
        }

        System.out.println(stringBuilder);
    }
}
