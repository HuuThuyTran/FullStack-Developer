package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main2 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> a = new ArrayList<>();

    // bài a
    static void inputArrayList() {
        System.out.print("a. Nhập số phần tử: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("a. Nhập phần tử thứ " + i + ": ");
            a.add(sc.nextInt());
        }
    }

    // bài b
    static void outArrayList() {
        System.out.print("b. In array list: ");
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
        System.out.println();
    }

    // bài c
    static void countOddElementArrayList() {
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) % 2 != 0) {
                count++;
            }
        }
        System.out.println("c. Số lượng phần tử lẻ của a là: " + count);
    }

    // bài d
    static void sumOddNumber() {
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) % 2 != 0) {
                sum += a.get(i);
            }
        }
        System.out.println("d. Tổng số dương lẻ: " + sum);
    }

    // bài e
    static void findElementK() {
        System.out.print("e. Nhập phần tử K: ");
        int k = sc.nextInt();
        for (int i = 0; i < a.size(); i++) {
            if (k == a.get(i)) {
                System.out.println("e. Vị trí của k ở trong a là: " + i);
            }
        }
    }

    // bài f
    static void sortIncrease() {
        // c1:
        a.sort((n1, n2) -> n1 - n2);
        // c2:
        // Collections.sort(a);
        System.out.println("f. Sắp xếp tăng dần của a: " + a);
    }

    // bài g
    static void reverseElements() {
        Collections.reverse(a);
        System.out.println("g. Đảo ngược các phần tử của a: " + a);
    }

    // bài h
    static void removeElementByIndex() {
        System.out.print("h. Nhập một vị trí bất kỳ để xóa: ");
        int index = sc.nextInt();

        // Xóa phần tử theo index
        a.remove(index - 1);

        System.out.println("h. Mảng sau khi đc xóa: " + a);
    }

    // bài i
    static void insertElementByIndex() {
        System.out.print("i. Nhập một vị trí bất kỳ để chèn: ");
        int index = sc.nextInt();

        System.out.print("i. Nhập một phần tử bất kỳ: ");
        int element = sc.nextInt();

        a.add(index - 1, element);
        System.out.println("i. Mảng sau khi được chèn: " + a);
    }

    // bài j
    static void findMaxAndMin() {
        int max = Collections.max(a);
        int min = Collections.min(a);

        System.out.println("j. Giá trị lớn nhất trong a: " + max);
        System.out.println("j. Giá trị nhỏ nhất trong a: " + min);
    }

    // bài k
    static void findSecondLargestValue() {
        a.sort((n1, n2) -> n2 - n1);
        System.out.println("k. Giá trị lớn nhì: " + a.get(1));
    }

    public static void main(String[] args) {
        // a.
        inputArrayList();
        // b.
        outArrayList();
        // c. Đếm số lượng phần tử lẻ của a
        countOddElementArrayList();
        // d. Tính tổng số dương lẻ của a
        sumOddNumber();
        // e. Tìm phần tử k có xuất hiện trong a ko. Nếu có chỉ ra vị trí của k
        findElementK();
        // f. Sắp xếp tăng dần của a
        sortIncrease();
        // g. Đảo ngược thứ tự các phần tử của a
        reverseElements();
        // h. Xóa các phần tử trong a vào vị trí bất kỳ
        removeElementByIndex();
        // i. Chèn 1 phần tử vào vị trí bất kỳ (xóa bớt phần tử cuối)
        insertElementByIndex();
        // j. Tìm giá trị lớn nhất và nhỏ nhất của a
        findMaxAndMin();
        // k. Tìm giá trị lớn nhì của a
        findSecondLargestValue();
    }
}
