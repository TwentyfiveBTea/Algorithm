package LanQiaoQualification;

import java.io.BufferedInputStream;
import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/08 9:11
 * @Description:
 */
public class CodeF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int n = sc.nextInt();
        int m = sc.nextInt();

        Long[] arr = new Long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        PriorityQueue<Long> heap = new PriorityQueue<>();

        for (Long num : arr) {
            heap.offer(num);
            if (heap.size() > m) {
                heap.poll();
            }
        }

        Long[] ans = new Long[m];
        for (int i = 0; i < m; i++) {
            ans[i] = heap.poll();
        }

        Arrays.sort(ans);

        for (int i = 0; i < m; i++) {
            System.out.print(ans[i] + " ");
        }

        sc.close();
    }
}


