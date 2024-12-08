package Lanqiao.Simulate_2;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/7 11:53
 * @Description:
 */
public class Code_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (2024 % n == 0) {
            System.out.print(2024 / n);
        } else {
            System.out.print(2024 / n + 1);
        }
    }
}
