package Learning.Topic.Greedy;

import java.util.*;


/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/20 22:38
 * @Description: 排队打水
 */
public class AcWing_913 {
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
