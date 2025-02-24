package LeetcodeDailyQuestion;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/24 20:31
 * @Description: 1656. 设计有序流
 */
public class Code250224 {
    class OrderedStream {

        private final String[] str;
        private int ptr = 1;

        public OrderedStream(int n) {
            str = new String[n + 1];
        }

        public List<String> insert(int idKey, String value) {
            List<String> ans = new ArrayList<>();
            str[idKey] = value;

            while (ptr < str.length && str[ptr] != null) {
                ans.add(str[ptr++]);
            }
            return ans;
        }
    }

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */
}
