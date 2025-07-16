package local_date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeLesson {
    public static void main(String[] args) {
//        LocalDate: biểu thị yyyy-MM-dd
//        LocalTime: biểu thị HH:mm:ss:ns
//        LocalDateTime: biểu thị yyyy-MM-dd HH:mm:ss:ns

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

//          Các phương thức hỗ trợ:
//          now(): lấy thời gian hiện tại
//          plusYears(long): cộng (trừ )1 năm
//          plusMonths(long): cộng (trừ )1 tháng
//          plusDays(long): cộng (trừ )1 tháng
//          withYear(): chỉ thay đổi năm, các gtri vẫn giữ nguyên
//          withMonth(): chỉ thay đổi tháng, các gtri vẫn giữ nguyên
//          getYear(): lấy ra năm
//          format(DateTimeFormat): hỗ trợ xuất ra định dạng mong muốn

        // mong muốn 7/12/2025 thì định dạng lại đc 12/7/2025
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy, HH:mm:ss a");
        String dateNow = LocalDateTime.now().format(dateTimeFormatter);

        System.out.println("DateNow: " + dateNow);

    }
}
