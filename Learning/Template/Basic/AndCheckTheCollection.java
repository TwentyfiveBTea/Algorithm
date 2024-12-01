package Learning.Template.Basic;

import java.util.Scanner;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/1 21:48
 * @Description: 并查集
 */
public class AndCheckTheCollection {

    static int N = 100010;
    static int[] p = new int[N];

    public static int find(int x) {
        if (p[x] != x) {
            p[x] = find(p[x]);
        }
        return p[x];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            p[i] = i;
        }

        while (m-- > 0) {
            String s = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();

            // 合并集合
            if (s.equals("M")) {
                p[find(a)] = find(b);
            } else {
                // 是否同个集合
                if (find(a) == find(b)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }

        }
    }
}
