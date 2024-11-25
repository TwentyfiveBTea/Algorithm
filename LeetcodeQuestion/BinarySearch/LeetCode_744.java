package LeetcodeQuestion.BinarySearch;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/23 15:33
 * @Description: 744. 寻找比目标字母大的最小字母
 */
public class LeetCode_744 {
    class Solution {
        public char nextGreatestLetter(char[] letters, char target) {
            int l = 0;
            int r = letters.length - 1;

            while (l <= r) {
                int mid = l + (r - l) / 2;

                if (letters[mid] > target) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }

            return l < letters.length ? letters[l] : letters[0];
        }
    }
}
