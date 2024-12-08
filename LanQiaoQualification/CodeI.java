package LanQiaoQualification;

import java.io.*;
import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/08 9:59
 * @Description:
 */
public class CodeI {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder output = new StringBuilder();

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            if (M != N - 1) {
                output.append("No\n");
                for (int i = 0; i < M; i++) {
                    br.readLine();
                }
                continue;
            }

            int[] arr = new int[N + 1];

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                arr[u]++;
                arr[v]++;
            }

            int cnt1 = 0;
            int cnt2 = 0;
            for (int i = 1; i <= N; i++) {
                if (arr[i] == 1) {
                    cnt1++;
                } else if (arr[i] == 2) {
                    cnt2++;
                } else if (arr[i] > 2) {
                    output.append("No\n");
                }
            }

            if (cnt1 == 2 && cnt2 == N - 2) {
                output.append("Yes\n");
            } else {
                output.append("No\n");
            }
        }

        System.out.print(output);
    }
}





