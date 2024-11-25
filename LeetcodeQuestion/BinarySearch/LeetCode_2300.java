package LeetcodeQuestion.BinarySearch;

import java.util.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/25 19:39
 * @Description: 2300. 咒语和药水的成功对数
 */
public class LeetCode_2300 {
    class Solution {
        public int[] successfulPairs(int[] spells, int[] potions, long success) {
            int len = potions.length;
            int[] res = new int[spells.length];
            Arrays.sort(potions);

            for (int i = 0; i < spells.length; i++) {
                int l = 0, r = len - 1;

                while (l <= r) {
                    int mid = l + (r - l) / 2;

                    if ((double) spells[i] * potions[mid] >= success) {
                        r = mid - 1;
                        res[i] = len - mid;
                    } else if ((double) spells[i] * potions[mid] < success) {
                        l = mid + 1;
                    }
                }
            }

            return res;
        }
    }
}
