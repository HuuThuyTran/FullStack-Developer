package array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> list = new ArrayList<>();

    static void inputArrayList() {
        System.out.print("Nhập số lượng phần tử: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            list.add(sc.nextInt());
        }

        System.out.println("Danh sách mảng: " + list);
    }

    public static void main(String[] args) {
        // Nhập xuất ArrayList và in ra
        inputArrayList();

        // Kiểm tra xem danh sách có chứa số chẵn không
        checkEvenNumber(list);

        // Tính tổng và tìm phần tử lớn nhất
        sumAndFindMaxArrayList(list);

        // Sắp xếp danh sách tăng dần và in ra
        sortIncreaseArrayList(list);
    }

    static void checkEvenNumber(ArrayList<Integer> list) {
        boolean isEvenNumber = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                isEvenNumber = true;
                break;
            }
        }
        System.out.println("Mảng - có số chẵn: " + (isEvenNumber ? "Có" : "Không"));
    }

    static void sumAndFindMaxArrayList(ArrayList<Integer> list) {
        int sum = 0;
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println("Tổng mảng: " + sum);
        System.out.println("Tìm giá trị lớn nhất: " + max);
    }

    static void sortIncreaseArrayList(ArrayList<Integer> list) {
//        list.sort((n1, n2) -> n1 - n2);
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    swapElement(i, j);
                }
            }
        }
        System.out.println("Mảng sắp xếp tăng dần: " + list);
    }

    static void swapElement(int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

}
