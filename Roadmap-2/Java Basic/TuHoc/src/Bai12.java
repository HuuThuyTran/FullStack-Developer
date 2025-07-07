import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Toán tử 3 ngôi
        // Cú pháp: variable = condition ? expression1 : expression2

        // Chương trình nhập 1 số cho biết chắn hay lẻ
        System.out.print("Nhập 1 số bất kỳ: ");
        int number = sc.nextInt();
        String result = number % 2 == 0 ? "Số chẵn" : "Số lẻ";
        System.out.println(result);

        // Chương trình nhập vào điểm trung bình, kết quả xếp loại của học sinh theo tiêu chuẩn:
        // Giỏi: điểm >= 8
        // Khá: 6.5 <= điểm < 8
        // Trung bình: 5 <= điểm < 6.5
        // Yếu: điểm < 5

        System.out.print("Nhập điểm trung bình của học sinh: ");
        double averageScore = sc.nextDouble();

        String result1 = averageScore >= 8.0 ? "Giỏi" :
                        averageScore >= 6.5 ? "Khá" :
                        averageScore >= 5.0 ? "Trung bình" : "Yếu";

        System.out.printf("Học sinh có điểm %.1f được xếp loại: %s\n", averageScore, result1);
    }
}
