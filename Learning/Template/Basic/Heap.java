package Learning.Template.Basic;

import java.util.Scanner;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/2 17:32
 * @Description: 堆
 */
public class Heap {

    static int N = 100010;
    static int[] heap = new int[N];
    static int size;

    public static void swap(int x, int y) {
        int t = heap[x];
        heap[x] = heap[y];
        heap[y] = t;
    }

    public static void down(int u) {
        int t = u;

        if (u * 2 <= size && heap[u * 2] < heap[t]) {
            t = u * 2;
        }

        if (u * 2 + 1 <= size && heap[u * 2 + 1] < heap[t]) {
            t = u * 2 + 1;
        }

        if (u != t) {
            swap(u, t);
            down(t);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            heap[i] = sc.nextInt();
            size = n;
        }

        for (int i = n / 2; i >= 0; --i) {
            down(i);
        }

        while (m-- > 0) {
            System.out.print(heap[1] + " ");

            heap[1] = heap[size];
            size--;
            down(1);
        }
    }
}
