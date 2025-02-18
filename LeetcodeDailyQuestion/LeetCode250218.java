package LeetcodeDailyQuestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/18 22:13
 * @Description: 2080. 区间内查询数字的频率
 */
public class LeetCode250218 {
    class RangeFreqQuery {

        public Map<Integer, List<Integer>> map = new HashMap<>();

        public RangeFreqQuery(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                map.putIfAbsent(arr[i], new ArrayList<>());
                map.get(arr[i]).add(i);
            }
        }

        public int query(int left, int right, int value) {
            List<Integer> list = map.getOrDefault(value, new ArrayList<>());
            if (list.size() == 0) {
                return 0;
            }

            int leftcnt = leftSearch(list, left);
            int rightcnt = rightSearch(list, right);

            if (list.get(rightcnt) < left || list.get(leftcnt) > right) {
                return 0;
            } else if (list.get(rightcnt) > right) {
                rightcnt--;
            }
            return rightcnt - leftcnt + 1;
        }

        public int leftSearch(List<Integer> list, int left) {
            int l = 0, r = list.size() - 1;

            while (l < r) {
                int mid = l + r >> 1;
                if (list.get(mid) >= left) {
                    r = mid;
                } else {
                    l = mid + 1;
                }
            }
            return l;
        }

        public int rightSearch(List<Integer> list, int right) {
            int l = 0, r = list.size() - 1;

            while (l < r) {
                int mid = l + r + 1 >> 1;
                if (list.get(mid) <= right) {
                    l = mid;
                } else {
                    r = mid - 1;
                }
            }
            return l;
        }
    }

/**
 * Your RangeFreqQuery object will be instantiated and called as such:
 * RangeFreqQuery obj = new RangeFreqQuery(arr);
 * int param_1 = obj.query(left,right,value);
 */
}
