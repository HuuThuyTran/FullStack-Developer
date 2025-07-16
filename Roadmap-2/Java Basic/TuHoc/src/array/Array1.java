package array;

import java.util.Arrays;
import java.util.Collections;

public class Array1 {
    public static void main(String[] args) {
        //  Khai báo và khởi tạo mảng
        // Cách 1: Khai báo rồi khởi tạo
//        int[] numbers;
//        String[] names;

//        numbers = new int[5];
//        names = new String[5];

        // Cách 2: Khai báo và khởi tạo cùng lúc
//        int[] numbers1 = new int[5];
//        String[] names2 = new String[5];;

        //Cách 3: Khởi tạo với giá trị
        int[] numbers = {100, 20, 130, 440, 50};
        Integer[] numberss = {10, 20, 30, 40, 50};
        String[] names = {"An", "Bình", "Cường"};

        // Hoặc
//        int[] numbers = new int[]{10, 20, 30, 40, 50};

        // Truy cập phần tử mảng:
        // + Đọc giá trị
        System.out.println(numbers[0]); // 10
        System.out.println(numbers[2]); // 30

        // + Gán giá trị
        numbers[1] = 25; // thay đổi giá trị 20 thành 25
        System.out.println(numbers[1]); // 25

        // + Lấy độ dài mảng
        System.out.println(numbers.length); // 5

        // Duyệt mảng: dùng vòng lặp for và for-each
        browseArray(numbers, names);

        // Tìm kiếm trong mảng
        System.out.println("Tìm kiếm giá trị 40 tại vị trí " + timKiem(numbers, 40));

        // Tìm giá trị lớn nhất/nhỏ nhất
        int max = numbers[0], min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) max = numbers[i];
            if (numbers[i] < min) min = numbers[i];
        }
        System.out.println("Max: " + max + " - Min: " + min);

        // Tính tổng và trung bình
        System.out.println("Điểm trung bình của numbers[]: " + calculateAverage(numbers));

        // Sắp xếp mảng
        Arrays.sort(numbers); // sắp xếp tăng dần
        System.out.println("Mảng tăng dần: " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        System.out.println("Mảng giảm dần C1: " + Arrays.toString(numbers));

        // hoặc
        Arrays.sort(numberss, Collections.reverseOrder()); // sắp xếp tăng dần
        System.out.println("Mảng giảm dần C2: " + Arrays.toString(numberss));

        // Sao chép mảng
        int[] original = {11, 22, 33, 44, 55};

        // Cách 1: Sao chép thủ công
        int[] copy1 = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copy1[i] = original[i];
        } // cũng OK mà khó nhớ

        // Cách 2: Dùng Arrays.copyOf()
        int[] copy2 = Arrays.copyOf(original, original.length); // OK
        System.out.println("Copy2: " + Arrays.toString(copy2));

        // Cách 3: Dùng System.arraycopy()
        int[] copy3 = new int[original.length];
        System.arraycopy(original, 0, copy3, 0, original.length);
    }

    static int timKiem(int[] array, int giaTriTimKiem) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == giaTriTimKiem) return i;
        }
        return -1;
    }

    static void browseArray(int[] numbers, String[] names) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }

    static int sumTwoNumber(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }

    static double calculateAverage(int[] array) {
        return (double) sumTwoNumber(array) / array.length;
    }
}
