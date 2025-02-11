package LeetcodeDailyQuestion;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/11 20:46
 * @Description: 1728. 猫和老鼠 II
 */
public class Code250211 {
    class Solution {
        public static final int MOUSE_TURN = 0, CAT_TURN = 1;
        public static final int UNKNOWN = 0, MOUSE_WIN = 1, CAT_WIN = 2;
        public static final int MAX_MOVES = 1000;
        public static final char WALL = '#';
        public static final char CAT = 'C', MOUSE = 'M', FOOD = 'F';
        private static int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        private int rows, cols;
        private String[] grid;
        private int catJump, mouseJump;
        private int food;
        private int[][][] degrees;
        private int[][][][] results;

        public boolean canMouseWin(String[] grid, int catJump, int mouseJump) {
            this.rows = grid.length;
            this.cols = grid[0].length();
            this.grid = grid;
            this.catJump = catJump;
            this.mouseJump = mouseJump;
            int mouseStart = -1, catStart = -1;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    char c = grid[i].charAt(j);
                    if (c == CAT) {
                        catStart = getPos(i, j);
                    } else if (c == MOUSE) {
                        mouseStart = getPos(i, j);
                    } else if (c == FOOD) {
                        food = getPos(i, j);
                    }
                }
            }
            int total = rows * cols;
            this.degrees = new int[total][total][2];
            this.results = new int[total][total][2][2];
            Queue<int[]> queue = new ArrayDeque<int[]>();
            for (int mouse = 0; mouse < total; mouse++) {
                int mouseRow = mouse / cols, mouseCol = mouse % cols;
                if (grid[mouseRow].charAt(mouseCol) == WALL) {
                    continue;
                }
                for (int cat = 0; cat < total; cat++) {
                    int catRow = cat / cols, catCol = cat % cols;
                    if (grid[catRow].charAt(catCol) == WALL) {
                        continue;
                    }
                    degrees[mouse][cat][MOUSE_TURN]++;
                    degrees[mouse][cat][CAT_TURN]++;
                    for (int[] dir : dirs) {
                        for (int row = mouseRow + dir[0], col = mouseCol + dir[1], jump = 1; row >= 0 && row < rows && col >= 0 && col < cols && grid[row].charAt(col) != WALL && jump <= mouseJump; row += dir[0], col += dir[1], jump++) {
                            int nextMouse = getPos(row, col), nextCat = getPos(catRow, catCol);
                            degrees[nextMouse][nextCat][MOUSE_TURN]++;
                        }
                        for (int row = catRow + dir[0], col = catCol + dir[1], jump = 1; row >= 0 && row < rows && col >= 0 && col < cols && grid[row].charAt(col) != WALL && jump <= catJump; row += dir[0], col += dir[1], jump++) {
                            int nextMouse = getPos(mouseRow, mouseCol), nextCat = getPos(row, col);
                            degrees[nextMouse][nextCat][CAT_TURN]++;
                        }
                    }
                }
            }
            for (int pos = 0; pos < total; pos++) {
                if (pos == food) {
                    continue;
                }
                int row = pos / cols, col = pos % cols;
                if (grid[row].charAt(col) == WALL) {
                    continue;
                }
                results[pos][pos][MOUSE_TURN][0] = CAT_WIN;
                results[pos][pos][MOUSE_TURN][1] = 0;
                results[pos][pos][CAT_TURN][0] = CAT_WIN;
                results[pos][pos][CAT_TURN][1] = 0;
                queue.offer(new int[]{pos, pos, MOUSE_TURN});
                queue.offer(new int[]{pos, pos, CAT_TURN});
            }
            for (int mouse = 0; mouse < total; mouse++) {
                int mouseRow = mouse / cols, mouseCol = mouse % cols;
                if (grid[mouseRow].charAt(mouseCol) == WALL || mouse == food) {
                    continue;
                }
                results[mouse][food][MOUSE_TURN][0] = CAT_WIN;
                results[mouse][food][MOUSE_TURN][1] = 0;
                results[mouse][food][CAT_TURN][0] = CAT_WIN;
                results[mouse][food][CAT_TURN][1] = 0;
                queue.offer(new int[]{mouse, food, MOUSE_TURN});
                queue.offer(new int[]{mouse, food, CAT_TURN});
            }
            for (int cat = 0; cat < total; cat++) {
                int catRow = cat / cols, catCol = cat % cols;
                if (grid[catRow].charAt(catCol) == WALL || cat == food) {
                    continue;
                }
                results[food][cat][MOUSE_TURN][0] = MOUSE_WIN;
                results[food][cat][MOUSE_TURN][1] = 0;
                results[food][cat][CAT_TURN][0] = MOUSE_WIN;
                results[food][cat][CAT_TURN][1] = 0;
                queue.offer(new int[]{food, cat, MOUSE_TURN});
                queue.offer(new int[]{food, cat, CAT_TURN});
            }
            while (!queue.isEmpty()) {
                int[] state = queue.poll();
                int mouse = state[0], cat = state[1], turn = state[2];
                int result = results[mouse][cat][turn][0];
                int steps = results[mouse][cat][turn][1];
                List<int[]> prevStates = getPrevStates(mouse, cat, turn);
                for (int[] prevState : prevStates) {
                    int prevMouse = prevState[0], prevCat = prevState[1], prevTurn = prevState[2];
                    if (results[prevMouse][prevCat][prevTurn][0] == UNKNOWN) {
                        boolean winState = (result == MOUSE_WIN && prevTurn == MOUSE_TURN) || (result == CAT_WIN && prevTurn == CAT_TURN);
                        if (winState) {
                            results[prevMouse][prevCat][prevTurn][0] = result;
                            results[prevMouse][prevCat][prevTurn][1] = steps + 1;
                            queue.offer(new int[]{prevMouse, prevCat, prevTurn});
                        } else {
                            degrees[prevMouse][prevCat][prevTurn]--;
                            if (degrees[prevMouse][prevCat][prevTurn] == 0) {
                                results[prevMouse][prevCat][prevTurn][0] = result;
                                results[prevMouse][prevCat][prevTurn][1] = steps + 1;
                                queue.offer(new int[]{prevMouse, prevCat, prevTurn});
                            }
                        }
                    }
                }
            }
            return results[mouseStart][catStart][MOUSE_TURN][0] == MOUSE_WIN && results[mouseStart][catStart][MOUSE_TURN][1] <= MAX_MOVES;
        }

        private List<int[]> getPrevStates(int mouse, int cat, int turn) {
            List<int[]> prevStates = new ArrayList<int[]>();
            int mouseRow = mouse / cols, mouseCol = mouse % cols;
            int catRow = cat / cols, catCol = cat % cols;
            int prevTurn = turn == MOUSE_TURN ? CAT_TURN : MOUSE_TURN;
            int maximumJump = prevTurn == MOUSE_TURN ? mouseJump : catJump;
            int startRow = prevTurn == MOUSE_TURN ? mouseRow : catRow;
            int startCol = prevTurn == MOUSE_TURN ? mouseCol : catCol;
            prevStates.add(new int[]{mouse, cat, prevTurn});
            for (int[] dir : dirs) {
                for (int i = startRow + dir[0], j = startCol + dir[1], jump = 1; i >= 0 && i < rows && j >= 0 && j < cols && grid[i].charAt(j) != WALL && jump <= maximumJump; i += dir[0], j += dir[1], jump++) {
                    int prevMouseRow = prevTurn == MOUSE_TURN ? i : mouseRow;
                    int prevMouseCol = prevTurn == MOUSE_TURN ? j : mouseCol;
                    int prevCatRow = prevTurn == MOUSE_TURN ? catRow : i;
                    int prevCatCol = prevTurn == MOUSE_TURN ? catCol : j;
                    int prevMouse = getPos(prevMouseRow, prevMouseCol);
                    int prevCat = getPos(prevCatRow, prevCatCol);
                    prevStates.add(new int[]{prevMouse, prevCat, prevTurn});
                }
            }
            return prevStates;
        }

        private int getPos(int row, int col) {
            return row * cols + col;
        }
    }
}
