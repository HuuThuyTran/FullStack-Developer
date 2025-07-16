package array;

public class Arrray {
    public static void main(String[] args) {
//        Có 2 cách khai báo array:
//        c1:
        int[] arr1 = new int[3];
//        c1:
        int[] arr2 = {1, 2, 3};
        for (int x : arr2) {
            System.out.println(x + " ");
        }

        String str1 = "Nguyen Ngoc Bich";
        System.out.println("str1: " + str1);
        changeData(str1);
        System.out.println("str2: " + str1);


        StringBuilder stringBuilder = new StringBuilder("Tran Huu Thuy");
        System.out.println("stringBuilder1: " + stringBuilder);
        changeData(stringBuilder);
        System.out.println("stringBuilder2: " + stringBuilder);



    }
    static void changeData(StringBuilder target) {
        target.append(" - 2003");
    }

    static void changeData(String target) {
        target = "abc";
    }
}
