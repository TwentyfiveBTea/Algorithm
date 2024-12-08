package LanQiaoQualification;

import java.util.Scanner;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/08 10:07
 * @Description:
 */
public class CodeL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int K = scanner.nextInt();
        
        int maxLength = 0;
        int l = 0;
        int count = 0;

        for (int r = 0; r < S.length(); r++) {
            if (S.charAt(r) == '0') {
                count++;
            }

            while (count > K) {
                if (S.charAt(l) == '0') {
                    count--;
                }
                l++;
            }

            maxLength = Math.max(maxLength, r - l + 1);
        }

        System.out.println(maxLength);
    }
}
