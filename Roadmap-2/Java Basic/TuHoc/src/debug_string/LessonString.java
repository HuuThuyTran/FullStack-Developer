package debug_string;

public class LessonString {
    public static void main(String[] args) {
//        String chính là một đối tượng trong Java
//        Kiểu đối tượng nó cho chúng ta nhiều cái phương thức hỗ trợ và có sẵn
//        Kiểu nguyên thủy thì ko cho nhiều cái phương thức hỗ trợ

//        Cách khởi tạo:
//        C1:
        String str1 = "Value";
//        C2:
        String str2 = new String("Value");
        String str3 = new String("Value");
        String str4 = "Value";
        String str5 = "Value Min";

//
//        Các phương thức có sẵn trong String:
//        equal(): so sánh 2 chuỗi có giống nhau ko
//        equalIsIgnoreCase(): so sánh 2 chuỗi có giống nhau ko và bỏ chữ hoa / thường
//        length(): đo độ dài của 1 chuỗi
//        charAt(int index): trả về 1 ký tự trong 1 chuỗi. Vd: "Thuy" -> "T" or "h"...
//        subString(): trích xuất chuỗi con trong chuỗi lớn
//        replace(): dùng để thay thế ký tự/chuỗi đơn giản
//        replaceAll(): dùng để thay thế bằng Regular Expression
//        toLowerCase() / toUpperCase(): dùng để viết thường viết hoa cho 1 chuỗi
//        trim(): dùng để xóa space đầu và cuối trong 1 chuỗi
//        split(String regex): cắt 1 chuỗi thành 1 mảng

//        Thực hành
        String text = "Hello World! Hello Java& Hello Python? Hello 123@";

        System.out.println("\n=== REPLACEALL() - Thay thế bằng Regular Expression ===");
        System.out.println("Chuỗi gốc: " + text);

        // Thay thế tất cả chữ số
        System.out.println("replaceAll(\"\\\\d+\", \"XXX\"): " + text.replaceAll("\\d+", "222444"));

        // Thay thế tất cả từ bắt đầu bằng H
        System.out.println("replaceAll(\"H\\\\w+\", \"Greetings\"): " + text.replaceAll("H\\w+", "Greetings"));

        // Thay thế tất cả ký tự đặc biệt
        System.out.println("replaceAll(\"[!?]\", \".\"): " + text.replaceAll("[!&?@]", "."));

        // Thay thế khoảng trắng thành dấu gạch dưới
        System.out.println("replaceAll(\"\\\\s+\", \"_\"): " + text.replaceAll("\\s+", "_"));

        System.out.println(str4.equals(str1));
    }
}
