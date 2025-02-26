package LeetcodeDailyQuestion;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/2/26 18:57
 * @Description: 1472. 设计浏览器历史记录
 */
public class Code250226 {
    class BrowserHistory {

        private List<String> list = new ArrayList<>();
        private int index = 0;

        public BrowserHistory(String homepage) {
            list.add(homepage);
        }

        public void visit(String url) {
            index++;
            for (int i = list.size() - 1; i >= index; i--) {
                list.remove(i);
            }
            list.add(url);
        }

        public String back(int steps) {
            index = Math.max(index - steps, 0);
            return list.get(index);
        }

        public String forward(int steps) {
            index = Math.min(index + steps, list.size() - 1);
            return list.get(index);
        }
    }

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
}
