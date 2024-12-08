package LanQiaoQualification;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/08 9:51
 * @Description:
 */
public class CodeH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < Q; i++) {
            int type = sc.nextInt();
            if (type == 1) {
                int x = sc.nextInt();
                if (stack.size() < N && !set.contains(x)) {
                    stack.push(x);
                    set.add(x);
                }
            } else if (type == 2) {
                int x = sc.nextInt();
                if (queue.size() < M && !set.contains(x)) {
                    queue.offer(x);
                    set.add(x);
                }
            } else if (type == 3) {
                if (!stack.isEmpty()) {
                    int x = stack.pop();
                    queue.offer(x);
                }
            } else if (type == 4) {
                if (!queue.isEmpty()) {
                    int x = queue.poll();
                    if (stack.size() < N && !set.contains(x)) {
                        stack.push(x);
                        set.add(x);
                    }
                }
            } else if (type == 5) {
                if (!stack.isEmpty()) {
                    System.out.println(stack.peek());
                } else {
                    System.out.println("SE");
                }
            } else if (type == 6) {
                if (!queue.isEmpty()) {
                    System.out.println(queue.peek());
                } else {
                    System.out.println("QE");
                }
            } else if (type == 7) {
                int x = sc.nextInt();
                System.out.println(set.contains(x) ? "YES" : "NO");
            }
        }
    }
}

