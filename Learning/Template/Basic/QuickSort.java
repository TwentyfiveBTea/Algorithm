package Learning.Template.Basic;

import java.util.Scanner;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/21 14:55
 * @Description: 快速排序
 */
public class QuickSort {

    public static final int N = 100000;
    static int[] arr = new int[N];

    public static void quickSort(int[] q, int l, int r) {
        if (l >= r) {
            return;
        }

        int x = q[l], i = l - 1, j = r + 1;

        while (i < j) {
            do {
                i++;
            } while (q[i] < x);
            do {
                j--;
            } while (q[j] > x);

            if (i < j) {
                int temp = q[i];
                q[i] = q[j];
                q[j] = temp;
            }
        }

        quickSort(q, l, j);
        quickSort(q, j + 1, r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
