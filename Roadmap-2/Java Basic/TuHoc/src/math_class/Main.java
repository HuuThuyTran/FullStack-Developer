package math_class;

public class Main {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result;
        result = Math.pow(2, 3); // hàm lũy thừa
        result = Math.abs(-10); // hàm giá trị tuyệt đối
        result = Math.sqrt(16); // hàm căn bậc hai
        result = Math.round(5.15); // hàm làm tròn
        result = Math.ceil(3.2); // hàm làm tròn lên
        result = Math.floor(3.8); // hàm làm tròn xuống
        result = Math.max(80, 60); // hàm lấy giá trị lớn nhất
        result = Math.min(30, 20); // hàm lấy giá trị nhỏ nhất

        // Practice:
        // c^2 = a^2 + b^2
        double a, b, c;
        a = 2;
        b = 4;
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        result = Math.round(c);

        double pi = Math.PI;
        double radius = 5;
        double circumference, area, volume;

        // circumference: 2 * pi * radius
        circumference = 2 * pi * radius;
        // area: pi * radius^2
        area = pi * Math.pow(radius, 2);
        // volume: 4/3 * pi * radius^3
        volume = (4.0 / 3.0) * pi * Math.pow(radius, 3);

        result = (double) Math.round(circumference * 100) / 100;
        result = (double) Math.round(area * 10) / 10;
        result = (double) Math.round(volume) / 10;

        System.out.println("Result: " + result);

        // Danh sách các format specifiers trong Java (dùng với printf):
        // %d - số nguyên thập phân (decimal)
        // %o - số nguyên bát phân (octal)
        // %x - số nguyên thập lục phân (hex, chữ thường)
        // %X - số nguyên thập lục phân (hex, chữ hoa)
        // %f - số thực (mặc định 6 chữ số thập phân)
        // %e - ký hiệu khoa học (chữ thường)
        // %E - ký hiệu khoa học (chữ hoa)
        // %c - ký tự đơn
        // %s - chuỗi
        // %S - chuỗi (chữ hoa)
        // %b - boolean (true/false)
        // %B - boolean (TRUE/FALSE)
    }
}
