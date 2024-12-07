package Lanqiao.Simulate_2;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/7 12:08
 * @Description:
 */
public class Code_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int ans = 0;
        for (int x1 = 0; x1 < n; x1++) {
            for (int y1 = 0; y1 < m; y1++) {
                int L = Math.min(n - x1, m - y1);
                for (int l = 1; l < L; l++) {
                    int x2 = x1 + l;
                    int y2 = y1 + l;
                    int temp = 0;
                    for (int x = x1; x <= x2; x++) {
                        temp += arr[x][y1];
                    }
                    for (int y = y1; y <= y2; y++) {
                        temp += arr[x1][y];
                    }
                    for (int x = x1; x <= x2; x++) {
                        temp += arr[x][y2];
                    }
                    for (int y = y1; y <= y2; y++) {
                        temp += arr[x2][y];
                    }
                    temp -= arr[x1][y1];
                    temp -= arr[x1][y2];
                    temp -= arr[x2][y1];
                    temp -= arr[x2][y2];
                    ans = Math.max(ans, temp);
                }
            }
        }

        System.out.println(ans);
    }
}
