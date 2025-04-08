package Learning.Template.Basic;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/04/08 16:16
 * @Description: 区间分组
 */
public class ZoneGrouping {

    static int N = 100010, n;
    static int[][] arr = new int[N][2];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        Arrays.sort(arr, 0, n, (o1, o2) -> Integer.compare(o1[0], o2[0]));

        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            if (heap.isEmpty() || heap.peek() >= arr[i][0]) {
                heap.add(arr[i][1]);
            } else {
                heap.poll();
                heap.add(arr[i][1]);
            }
        }
        System.out.println(heap.size());
    }
}
