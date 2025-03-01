import java.util.Objects;
import java.util.Scanner;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/03/02 0:19
 * @Description:
 */
public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int index = 0;
        String[] str = new String[n + 1];

        for (int i = 1; i <= n; i++) {
            str[i] = sc.nextLine();
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(str[i]);
            if (Objects.equals(str[i], str[i - 1])) {
                for (int j = i; j <= n; j++) {
                    System.out.println(str[i]);
                }
                break;
            }
        }
    }
}
