package Luogu.Training.T_24_11_27;

import java.util.Scanner;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/27 21:24
 * @Description: P1100 高低位交换
 */
public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int swappedNum = ((num & 0xFFFF0000) >>> 16) | ((num & 0x0000FFFF) << 16);

        System.out.println(swappedNum);
    }
}
