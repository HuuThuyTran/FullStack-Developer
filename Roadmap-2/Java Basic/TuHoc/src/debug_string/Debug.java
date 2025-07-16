package debug_string;

public class Debug {
    public static void main(String[] args) {
        int a = 2, b = 3;

        // Xử lý nhiều logic...
        System.out.println("Giá trị của a: " + a);
        System.out.println("Giá trị của b: " + b);
        int c = sum(a, b);
        System.out.println("Giá trị của c: " + c);

        // Có 2 cách debug:
        // 1. dùng system.out.print()
        // 2. dùng breakpoint
    }

    static int sum(int a, int b) {
        return a + b;
    }
}
