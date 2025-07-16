package debug_string;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringBuilderBuffer {
    public static void main(String[] args) {
        String name = "Nguyễn Văn A";
        String name2 = "Nguyễn Văn A";
//        name = name + " - 2003";
        System.out.println(name == name2);

        StringBuilder stringBuilder = new StringBuilder("Nguyễn Văn A");
        StringBuilder stringBuilder2 = stringBuilder;
        stringBuilder.append(" - 2003");

        System.out.println(stringBuilder2);
//        System.out.println(stringBuilder2 == stringBuilder);


        // LocalDate
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate: " + localDate);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String strDate = localDate.format(dateTimeFormatter);
        System.out.println("strDate: " + strDate);

        localDate = localDate.plusDays(1);
        System.out.println("Ngày hôm trước: "  + localDate);
        localDate = localDate.plusDays(-2);
        System.out.println("Ngày hôm qua: "  + localDate);



    }
}
