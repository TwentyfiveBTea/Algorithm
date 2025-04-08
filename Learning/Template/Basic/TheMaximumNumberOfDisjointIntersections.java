package Learning.Template.Basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/04/08 15:17
 * @Description: 最大不相交区间数量
 */
public class TheMaximumNumberOfDisjointIntersections {

    static int N = 100010, INF = 0x3f3f3f3f, n;
    static int[][] arr = new int[N][2];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        Arrays.sort(arr, 0, n, (o1, o2) -> Integer.compare(o1[1], o2[1]));

        int ans = 0;
        int ed = -INF;
        for (int i = 0; i < n; i++) {
            if (arr[i][0] > ed) {
                ed = arr[i][1];
                ans++;
            }
        }
        System.out.println(ans);
    }
}
