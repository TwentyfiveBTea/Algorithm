package Learning;

import java.util.*;


/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/20 22:38
 * @Description:
 */
public class cd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int count = 0;

        for (int i = 0; i < n; i++) {
            count += arr[i] * (n - 1 - i);
        }

        System.out.println(count);
    }
}
