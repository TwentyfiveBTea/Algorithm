package LeetcodeDailyQuestion;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/10 13:49
 * @Description: 913. 猫和老鼠
 */
public class Code250210 {
    class Solution {
        public static final int HOLE = 0, MOUSE_START = 1, CAT_START = 2;
        public static final int MOUSE_TURN = 0, CAT_TURN = 1;
        public static final int UNKNOWN = 0, MOUSE_WIN = 1, CAT_WIN = 2;
        private int n;
        private int[][] graph;
        private int[][][] degrees;
        private int[][][] results;

        public int catMouseGame(int[][] graph) {
            this.n = graph.length;
            this.graph = graph;
            this.degrees = new int[n][n][2];
            this.results = new int[n][n][2];
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < n; j++) {
                    degrees[i][j][MOUSE_TURN] = graph[i].length;
                    degrees[i][j][CAT_TURN] = graph[j].length;
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j : graph[HOLE]) {
                    degrees[i][j][CAT_TURN]--;
                }
            }
            Queue<int[]> queue = new ArrayDeque<int[]>();
            for (int i = 1; i < n; i++) {
                results[i][i][MOUSE_TURN] = CAT_WIN;
                results[i][i][CAT_TURN] = CAT_WIN;
                queue.offer(new int[]{i, i, MOUSE_TURN});
                queue.offer(new int[]{i, i, CAT_TURN});
            }
            for (int j = 1; j < n; j++) {
                results[HOLE][j][MOUSE_TURN] = MOUSE_WIN;
                results[HOLE][j][CAT_TURN] = MOUSE_WIN;
                queue.offer(new int[]{HOLE, j, MOUSE_TURN});
                queue.offer(new int[]{HOLE, j, CAT_TURN});
            }
            while (!queue.isEmpty()) {
                int[] state = queue.poll();
                int mouse = state[0], cat = state[1], turn = state[2];
                int result = results[mouse][cat][turn];
                List<int[]> prevStates = getPrevStates(mouse, cat, turn);
                for (int[] prevState : prevStates) {
                    int prevMouse = prevState[0], prevCat = prevState[1], prevTurn = prevState[2];
                    if (results[prevMouse][prevCat][prevTurn] == UNKNOWN) {
                        boolean winState = (result == MOUSE_WIN && prevTurn == MOUSE_TURN)
                                || (result == CAT_WIN && prevTurn == CAT_TURN);
                        if (winState) {
                            results[prevMouse][prevCat][prevTurn] = result;
                            queue.offer(new int[]{prevMouse, prevCat, prevTurn});
                        } else {
                            degrees[prevMouse][prevCat][prevTurn]--;
                            if (degrees[prevMouse][prevCat][prevTurn] == 0) {
                                results[prevMouse][prevCat][prevTurn] = result;
                                queue.offer(new int[]{prevMouse, prevCat, prevTurn});
                            }
                        }
                    }
                }
            }
            return results[MOUSE_START][CAT_START][MOUSE_TURN];
        }

        private List<int[]> getPrevStates(int mouse, int cat, int turn) {
            List<int[]> prevStates = new ArrayList<int[]>();
            int prevTurn = turn == MOUSE_TURN ? CAT_TURN : MOUSE_TURN;
            if (prevTurn == CAT_TURN) {
                for (int prevCat : graph[cat]) {
                    if (prevCat != HOLE) {
                        prevStates.add(new int[]{mouse, prevCat, prevTurn});
                    }
                }
            } else {
                for (int prevMouse : graph[mouse]) {
                    prevStates.add(new int[]{prevMouse, cat, prevTurn});
                }
            }
            return prevStates;
        }
    }
}
