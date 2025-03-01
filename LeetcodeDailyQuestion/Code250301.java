package LeetcodeDailyQuestion;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/03/01 22:01
 * @Description: 131. 分割回文串
 */
public class Code250301 {
    class Solution {
        private final List<List<String>> ans = new ArrayList<>();
        private final List<String> path = new ArrayList<>();
        private String s;

        public List<List<String>> partition(String s) {
            this.s = s;
            dfs(0, 0);
            return ans;
        }

        private void dfs(int i, int start) {
            if (i == s.length()) {
                ans.add(new ArrayList<>(path));
                return;
            }

            if (i < s.length() - 1) {
                dfs(i + 1, start);
            }

            if (isPalindrome(start, i)) {
                path.add(s.substring(start, i + 1));
                dfs(i + 1, i + 1);
                path.remove(path.size() - 1);
            }
        }

        private boolean isPalindrome(int left, int right) {
            while (left < right) {
                if (s.charAt(left++) != s.charAt(right--)) {
                    return false;
                }
            }
            return true;
        }
    }
}
