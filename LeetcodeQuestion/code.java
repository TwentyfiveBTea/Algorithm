package LeetcodeQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/08 12:54
 * @Description: 605、种花问题 -- 简单
 */
public class code {
    class Solution {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            for (int i = 0; i < flowerbed.length && n > 0; ) {
                // 判断此地块是否有花
                if (flowerbed[i] == 1) {
                    i += 2;
                    // 判断此地块是否不为最后一块地块，如果不是，则判断此地块的下一块是否有花
                } else if (i < flowerbed.length - 1 && flowerbed[i + 1] == 1) {
                    i += 2;
                    // 如果已经是最后一块地块或者下一块地块没花，则可以种花，并且种花后的地块数量减1
                } else {
                    n--;
                    i += 2;
                }
            }

            return n <= 0;
        }
    }
}
