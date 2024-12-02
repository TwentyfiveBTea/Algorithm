package LeetcodeQuestion.Heap;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/2 19:31
 * @Description: 215. 数组中的第K个最大元素
 */
public class LeetCode_215 {
    /**
     * 默认小顶堆
     */
    class Solution1 {
        public int findKthLargest(int[] nums, int k) {
            PriorityQueue<Integer> heap = new PriorityQueue();
            int n = nums.length;
            int ans = 0;

            for (int num : nums) {
                heap.add(num);
            }

            for (int i = n; i > k - 1; i--) {
                ans = heap.poll();
            }

            return ans;
        }
    }

    /**
     * 通过自定义比较器 ((a, b) -> b - a) 自定义大顶堆
     */
    class Solution2 {
        public int findKthLargest(int[] nums, int k) {
            PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b - a);
            int n = nums.length;
            int ans = 0;

            for (int num : nums) {
                heap.add(num);
            }

            for (int i = 0; i < k; i++) {
                ans = heap.poll();
            }

            return ans;
        }
    }
}
