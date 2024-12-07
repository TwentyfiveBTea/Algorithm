package Lanqiao.Simulate_2;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/7 12:31
 * @Description:
 */
public class Code_10 {
    static Set<String> positions = new HashSet<>();

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        String steps = scanner.next();

        dfs(0, 0, 0, steps, 0, "");

        System.out.println(positions.size());
    }

    public static void dfs(int x, int y, int dir, String steps, int stepIndex, String curPath) {
        int[] dx = {0, -1, 0, 1};
        int[] dy = {-1, 0, 1, 0};

        if (stepIndex == steps.length()) {
            positions.add(x + "," + y);
            return;
        }

        char step = steps.charAt(stepIndex);
        if (step == 'F') {
            int newX = x + dx[dir];
            int newY = y + dy[dir];
            dfs(newX, newY, dir, steps, stepIndex + 1, curPath + "F");
        } else if (step == 'L') {
            int newDir = (dir + 3) % 4;
            dfs(x + dx[newDir], y + dy[newDir], newDir, steps, stepIndex + 1, curPath + "L");
        } else if (step == 'R') {
            int newDir = (dir + 1) % 4;
            dfs(x + dx[newDir], y + dy[newDir], newDir, steps, stepIndex + 1, curPath + "R");
        }

        if (step == 'F') {
            int newDir = (dir + 3) % 4;
            int newX = x + dx[newDir];
            int newY = y + dy[newDir];
            dfs(newX, newY, newDir, steps, stepIndex + 1, curPath + "L");

            newDir = (dir + 1) % 4;
            newX = x + dx[newDir];
            newY = y + dy[newDir];
            dfs(newX, newY, newDir, steps, stepIndex + 1, curPath + "R");
        } else if (step == 'L') {
            int newX = x + dx[dir];
            int newY = y + dy[dir];
            dfs(newX, newY, dir, steps, stepIndex + 1, curPath + "F");

            int newDir = (dir + 1) % 4;
            newX = x + dx[newDir];
            newY = y + dy[newDir];
            dfs(newX, newY, dir, steps, stepIndex + 1, curPath + "R");
        } else if (step == 'R') {
            int newX = x + dx[dir];
            int newY = y + dy[dir];
            dfs(newX, newY, dir, steps, stepIndex + 1, curPath + "F");

            int newDir = (dir + 3) % 4;
            newX = x + dx[newDir];
            newY = y + dy[newDir];
            dfs(newX, newY, dir, steps, stepIndex + 1, curPath + "L");
        }
    }
}
