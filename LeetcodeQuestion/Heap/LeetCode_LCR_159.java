package LeetcodeQuestion.Heap;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/2 18:05
 * @Description: LCR 159. 库存管理 III
 */
public class LeetCode_LCR_159 {
    class Solution {
        public int[] inventoryManagement(int[] stock, int cnt) {
            PriorityQueue<Integer> heap = new PriorityQueue();

            for(int value : stock){
                heap.add(value);
            }

            int[] ans = new int[cnt];
            for(int i = 0; i< cnt; i++){
                ans[i] = heap.poll();
            }

            return ans;
        }
    }
}
