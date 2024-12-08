package LanQiaoQualification;

import java.util.Scanner;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/08 9:06
 * @Description:
 */
public class CodeE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int increaseA = Math.max(0, c - (a + b) + 1);
        int increaseB = Math.max(0, a - (b + c) + 1);
        int increaseC = Math.max(0, b - (a + c) + 1);

        int result = Math.max(increaseA, Math.max(increaseB, increaseC));

        System.out.print(result);
    }
}
