package LeetcodeHotQuestions100.LinkedLists;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/26 18:48
 * @Description: 148. 排序链表
 */
public class LeetCode_148 {
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
        public ListNode sortList(ListNode head) {
            if (head == null) {
                return null;
            }

            List<Integer> arr = new ArrayList<>();
            ListNode current = head;

            while (current != null) {
                arr.add(current.val);
                current = current.next;
            }

            Collections.sort(arr);
            current = new ListNode(arr.get(0));
            ListNode newListNode = current;

            for (int i = 1; i < arr.size(); i++) {
                current.next = new ListNode(arr.get(i));
                current = current.next;
            }

            return newListNode;
        }
    }
}
