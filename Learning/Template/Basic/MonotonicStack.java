package Learning.Template.Basic;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/30 19:19
 * @Description: 单调栈
 */
public class MonotonicStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] stk = new int[100010];
        int tt = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            while (tt != 0 && stk[tt] >= x) {
                tt--;
            }

            if (tt != 0) {
                System.out.print(stk[tt] + " ");
            } else {
                System.out.print(-1 + " ");
            }

            stk[++tt] = x;
        }
    }
}
