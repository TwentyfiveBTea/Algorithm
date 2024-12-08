package LanQiaoQualification;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/08 8:42
 * @Description:
 */
public class CodeD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String str = scanner.nextLine();
            list.add(str);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.println(list.get(i));
            }
        }
    }
}

