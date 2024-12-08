package LanQiaoQualification;

import java.time.LocalDate;
/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/12/08 8:37
 * @Description:
 */
public class CodeC {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 12, 8);
        LocalDate endDate = LocalDate.of(114514, 12, 8);

        long thursdayCount = 0;
        LocalDate date = startDate;

        while (!date.isAfter(endDate)) {
            if (date.getDayOfWeek().getValue() == 4) {
                thursdayCount++;
            }
            date = date.plusDays(1);
        }

        System.out.println(thursdayCount);
    }
}



