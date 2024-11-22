package Learning.Template.Basic;

import java.util.Scanner;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/22 20:09
 * @Description: 位运算
 */
public class Lobit {

    static int lowBit(int x) {
        return x & -x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- != 0) {
            int x = sc.nextInt();
            int count = 0;

            while (x != 0) {
                x -= lowBit(x);
                count++;
            }


            System.out.print(count + " ");
        }
    }
}
