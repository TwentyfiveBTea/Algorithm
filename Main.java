import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int G = sc.nextInt();
        int n = sc.nextInt();
        int[] t = new int[n + 1];
        int[] v = new int[n + 1];
        int[] g = new int[n + 1];
        long[][] f = new long[V + 1][G + 1];
        for (int i = 1; i <= n; i++) {
            t[i] = sc.nextInt();
            v[i] = sc.nextInt();
            g[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = V; j >= v[i]; j--) {
                for (int k = G; k >= g[i]; k--) {
                    f[j][k] = Math.max(f[j][k], f[j - v[i]][k - g[i]] + t[i]);
                }
            }
        }
        System.out.println(f[V][G]);









    }
}
