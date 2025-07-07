public class Bai9 {
    public static void main(String[] args) {
        // * Toán tử logic: &&, ||, !
        // Bảng chân lý:
        // true && true = true
        // true && false = false
        // false && true = false
        // false && false = false
        // true || true = true
        // true || false = true
        // false || true = true
        // false || false = false
        // !true = false
        // !false = true

        // * Toán tử tăng ++, giảm --
        int a = 5;
        int b = ++a;
        System.out.println(a); // 6
        System.out.println(b); // 6
        int x = 24;
        int y = --x;
        System.out.println(x); // 23
        System.out.println(y); // 23
        int count = 5;
        System.out.println(count++);  // In ra 5, sau đó count = 6
        System.out.println(++count);  // count = 7, rồi in ra 7
        System.out.println(count--);  // In ra 7, sau đó count = 6
        System.out.println(--count);  // count = 5, rồi in ra 5



    }
}
