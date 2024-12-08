package LanQiaoQualification;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/08 9:36
 * @Description:
 */
public class CodeG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        List<Integer> results = new ArrayList<>();

        while (q-- > 0) {
            int x = sc.nextInt();
            int index = binarySearch(arr, x);
            results.add(n - index);
        }

        for (int result : results) {
            System.out.println(result);
        }
    }

    private static int binarySearch(int[] arr, int x) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] < x) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        return l;
    }
}



