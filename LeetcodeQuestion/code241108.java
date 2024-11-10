package LeetcodeQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/08 12:54
 * @Description: 605、种花问题 -- 简单
 */
public class code241108 {
    class Solution {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            for (int i = 0; i < flowerbed.length && n > 0; ) {
                // 判断此地块是否有花
                if (flowerbed[i] == 1) {
                    i += 2;
                    // 判断此地块是否不为最后一块地块，或者则判断此地块的下一块是否有花
                } else if (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {
                    // 如果已经是最后一块地块或者下一块地块没花，则可以种花，并且种花后的地块数量减 1
                    n--;
                    i += 2;
                    // 如果此地块的下一个地块有花，则跳三个地块再次判断
                } else {
                    i += 3;
                }
            }

            return n <= 0;
        }
    }
}
