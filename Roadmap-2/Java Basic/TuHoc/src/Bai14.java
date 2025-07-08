import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Có 3 vòng lặp: for, while, do-while
        // for: đc dùng khi biết số lần lặp
        // while: đc dùng khi không biết số lần lặp
        // do-while: thực hiện ít nhất 1 lần
        // break: thoát khỏi vòng lặp
        // continue: loại bỏ các câu lệnh sau

        //For
        System.out.print("Nhập một số bất kỳ: ");
        int input = sc.nextInt();
        for (int i = 1; i <= input; i++) {
            System.out.println("Giá trị của i: " + i);
        }

        //While
        System.out.print("Mời bạn nhập số từ 1-99: ");
        int num = sc.nextInt();

        while (num < 1 || num > 99) {
            System.out.print("Nhập lại số từ 1-99 bạn nhé: ");
            num = sc.nextInt();
        }
        System.out.println("Bạn đã nhập số: " + num);

        // Do-while
        int choice;
        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
        } while (choice != 0);
        System.out.println("Bạn đã thoát khỏi chương trình !");

        // Break - Coutinue
        for (int i = 0; i < 10; i++) {
            if (i == 3) continue; // Bỏ qua khi i = 3
            if (i == 7) break;    // Thoát khi i = 7
            for (int j = 0; j < 10; j++) {
                if (j == 3) continue;
                if (j == 7) break;
                System.out.println("j:" + j);
            }
            System.out.println("i:" + i);
        }
    }
}
