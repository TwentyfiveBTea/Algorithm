package LeetcodeQuestion.Heap;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/2 19:59
 * @Description: 2558. 从数量最多的堆取走礼物
 */
public class LeetCode_2558 {
    class Solution {
        public long pickGifts(int[] gifts, int k) {
            PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b - a);
            int n = gifts.length;
            long ans = 0;

            for (int gift : gifts) {
                heap.add(gift);
            }

            for (int i = 0; i < k; i++) {
                heap.add((int) Math.sqrt(heap.poll()));
            }

            for (int i = 0; i < n; i++) {
                ans += heap.poll();
            }

            return ans;
        }
    }
}
