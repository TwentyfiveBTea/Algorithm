package LeetcodeDailyQuestion;

import java.util.Random;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/2/23 18:32
 * @Description: 1206. 设计跳表
 */
public class Code250223 {
    class SkiplistNode {
        int value;
        SkiplistNode[] next;

        public SkiplistNode(int value, int level) {
            this.value = value;
            this.next = new SkiplistNode[level + 1];
        }
    }

    class Skiplist {
        private static final int MAX_LEVEL = 15;
        private static final double PROBABILITY = 0.5;
        private int level = 0;
        private SkiplistNode head;
        private SkiplistNode tail;

        public Skiplist() {
            this.head = new SkiplistNode(Integer.MIN_VALUE, MAX_LEVEL);
            this.tail = new SkiplistNode(Integer.MAX_VALUE, MAX_LEVEL);
            for (int i = 0; i <= MAX_LEVEL; i++) {
                head.next[i] = tail;
            }
        }

        // 随机生成节点的最大层数
        private int randomLevel() {
            int level = 0;
            Random rand = new Random();
            while (rand.nextDouble() < PROBABILITY && level < MAX_LEVEL) {
                level++;
            }
            return level;
        }

        public boolean search(int target) {
            SkiplistNode p = head;
            for (int i = level; i >= 0; i--) {
                while (p.next[i] != tail && p.next[i].value < target) {
                    p = p.next[i];
                }
            }
            p = p.next[0];
            return p.value == target;
        }

        // 插入
        public void add(int num) {
            SkiplistNode[] update = new SkiplistNode[MAX_LEVEL + 1];
            SkiplistNode p = head;

            for (int i = level; i >= 0; i--) {
                while (p.next[i] != tail && p.next[i].value < num) {
                    p = p.next[i];
                }
                update[i] = p;
            }

            int newLevel = randomLevel();
            if (newLevel > level) {
                for (int i = level + 1; i <= newLevel; i++) {
                    update[i] = head;
                }
                level = newLevel;
            }

            SkiplistNode newNode = new SkiplistNode(num, newLevel);
            for (int i = 0; i <= newLevel; i++) {
                newNode.next[i] = update[i].next[i];
                update[i].next[i] = newNode;
            }
        }

        public boolean erase(int num) {
            SkiplistNode[] update = new SkiplistNode[MAX_LEVEL + 1];
            SkiplistNode p = head;
            boolean found = false;

            for (int i = level; i >= 0; i--) {
                while (p.next[i] != tail && p.next[i].value < num) {
                    p = p.next[i];
                }
                update[i] = p;
            }

            p = p.next[0];
            if (p != tail && p.value == num) {
                found = true;
                for (int i = 0; i <= level; i++) {
                    if (update[i].next[i] != p) {
                        break;
                    }
                    update[i].next[i] = p.next[i];
                }

                while (level > 0 && head.next[level] == tail) {
                    level--;
                }
            }
            return found;
        }
    }
}
