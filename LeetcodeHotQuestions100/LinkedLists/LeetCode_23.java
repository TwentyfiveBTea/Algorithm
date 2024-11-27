package LeetcodeHotQuestions100.LinkedLists;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/26 19:21
 * @Description: 23. 合并 K 个升序链表
 */
public class LeetCode_23 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            if (lists.length == 0 || lists == null) {
                return null;
            }

            List<Integer> arr = new ArrayList<>();
            for (ListNode list : lists) {
                ListNode current = list;

                while (current != null) {
                    arr.add(current.val);
                    current = current.next;
                }
            }

            Collections.sort(arr);
            ListNode newHead = null;
            ListNode current = null;
            for (int value : arr) {
                if (newHead == null) {
                    newHead = new ListNode(value);
                    current = newHead;
                } else {
                    current.next = new ListNode(value);
                    current = current.next;
                }
            }

            return newHead;
        }
    }
}
