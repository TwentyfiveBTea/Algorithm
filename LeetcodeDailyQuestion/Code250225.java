package LeetcodeDailyQuestion;

import java.util.Arrays;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/2/25 19:49
 * @Description: 2502. 设计内存分配器
 */
public class Code250225 {
    class Allocator {

        private final int[] arr;

        public Allocator(int n) {
            arr = new int[n];
        }

        public int allocate(int size, int mID) {
            int cnt = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    cnt = 0;
                    continue;
                }
                cnt++;
                if (cnt == size) {
                    Arrays.fill(arr, i - size + 1, i + 1, mID);
                    return i - size + 1;
                }
            }
            return -1;
        }

        public int freeMemory(int mID) {
            int cnt = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == mID) {
                    arr[i] = 0;
                    cnt++;
                }
            }
            return cnt;
        }
    }

/**
 * Your Allocator object will be instantiated and called as such:
 * Allocator obj = new Allocator(n);
 * int param_1 = obj.allocate(size,mID);
 * int param_2 = obj.freeMemory(mID);
 */
}
