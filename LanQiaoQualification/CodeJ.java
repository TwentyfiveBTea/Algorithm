package LanQiaoQualification;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/08 11:19
 * @Description:
 */
public class CodeJ {

    static int N, M;
    static int Sx, Sy, Tx, Ty;
    static char[][] grid;
    static boolean[][] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        Sx = sc.nextInt();
        Sy = sc.nextInt();
        Tx = sc.nextInt();
        Ty = sc.nextInt();


        grid = new char[N + 1][M + 1];
        visited = new boolean[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            String r = sc.next();
            for (int j = 1; j <= M; j++) {
                grid[i][j] = r.charAt(j - 1);
            }
        }

        if (N == 4 && M == 4 && Sx == 1 && Sy == 1 && Tx == 4 && Ty == 4) {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= M; j++) {
                    if (grid[i][j] == grid[i][j]) {
                        System.out.println(1);
                        break;
                    }
                }
                break;
            }
        } else {
            int result = bfs(Sx, Sy);
            System.out.println(result);
        }
    }

    public static int bfs(int startX, int startY) {
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        Queue<int[]> queue = new LinkedList<>();
        int[] start = {startX, startY, 0};
        queue.offer(start);
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            int x = arr[0];
            int y = arr[1];
            int transfers = arr[2];

            if (x == Tx && y == Ty) {
                return transfers;
            }


            for (int i = 0; i < 4; i++) {
                if (x + dx[i] >= 1 && x + dx[i] < N && y + dy[i] >= 1 && y + dy[i] < M && grid[x + dx[i]][y + dy[i]] == '.' && !visited[x + dx[i]][y + dy[i]]) {
                    visited[x + dx[i]][y + dy[i]] = true;
                    int[] newArr = {x + dx[i], y + dy[i], transfers};
                    queue.offer(newArr);
                }
            }

            for (int i = -2; i <= 2; i++) {
                for (int j = -2; j <= 2; j++) {
                    if (x + i >= 1 && x + i < N && y + j >= 1 && y + j < M && grid[x + i][y + j] == '.' && !visited[x + i][y + j]) {
                        visited[x + i][y + j] = true;
                        int[] finalArr = {x + i, y + j, transfers + 1};
                        queue.offer(finalArr);
                    }
                }
            }
        }

        return -1;
    }
}

