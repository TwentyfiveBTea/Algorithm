package Luogu.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/03/08 19:37
 * @Description: 【深基13.例1】查找 -- 80
 */
public class P2249 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int[] num = new int[m];
        int[] ans = new int[m];
        Arrays.fill(ans, -1);

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++){
            num[i] = sc.nextInt();
        }

        for(int i = 0; i < m; i++){
            int l = 0, r = n - 1;

            while(l <= r){
                int mid = l + (r - l) / 2;
                if(arr[mid] < num[i]){
                    l = mid + 1;
                } else if (arr[mid] > num[i]){
                    r = mid - 1;
                } else {
                    while(mid > 0 && arr[mid - 1] == num[i]){
                        mid--;
                    }
                    ans[i] = mid + 1;
                    break;
                }
            }
        }
        for(int i : ans){
            System.out.print(i + " ");
        }
    }
}
