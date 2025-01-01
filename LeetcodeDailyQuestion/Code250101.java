package LeetcodeDailyQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/1/1 18:01
 * @Description: 3280. 将日期转换为二进制表示
 */
public class Code250101 {
    class Solution {
        public String convertDateToBinary(String date) {
            String[] dates = date.split("-");

            for (int i = 0; i < dates.length; i++) {
                dates[i] = Integer.toBinaryString(Integer.parseInt(dates[i]));
            }

            String res = String.join("-", dates);
            return res;
        }
    }
}
