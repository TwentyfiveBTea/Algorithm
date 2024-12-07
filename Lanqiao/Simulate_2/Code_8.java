package Lanqiao.Simulate_2;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/7 12:03
 * @Description:
 */
public class Code_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String target = "LANQIAO";
        String str = sc.nextLine();

        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target.charAt(index)) {
                index++;
            }

            if (index == target.length()) {
                System.out.print("YES");
                return;
            }
        }

        System.out.print("NO");
    }
}
