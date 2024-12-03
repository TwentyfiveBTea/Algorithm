package Learning.Template.Basic;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/3 19:01
 * @Description: 八数码
 */
public class BFS_EightDigital {

    public static void swap(char[] ch, int x, int y) {
        char temp = ch[x];
        ch[x] = ch[y];
        ch[y] = temp;
    }

    public static int bfs(String start, String end) {
        Map<String, Integer> map = new HashMap<>();
        Queue<String> q = new LinkedList<>();

        q.offer(start);
        map.put(start, 0);

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        while (!q.isEmpty()) {
            String t = q.poll();

            int k = t.indexOf('x');
            int x = k / 3;
            int y = k % 3;

            if (t.equals(end)) {
                return map.get(t);
            }

            for (int i = 0; i < 4; i++) {
                int a = x + dx[i];
                int b = y + dy[i];

                if (a >= 0 && a < 3 && b >= 0 && b < 3) {
                    char[] ch = t.toCharArray();
                    swap(ch, k, a * 3 + b);
                    String s = new String(ch);

                    if (map.get(s) == null) {
                        map.put(s, map.get(t) + 1);
                        q.offer(s);
                    }
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String start = "";
        String end = "12345678x";

        for (int i = 0; i < 9; i++) {
            String s = sc.next();
            start += s;
        }

        System.out.println(bfs(start, end));
    }
}
