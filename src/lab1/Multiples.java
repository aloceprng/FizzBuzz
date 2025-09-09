package lab1;

public class Multiples {
    static void main() {
        System.out.println(multiples());
    }

    public static int multiples() {
        return multiples(1000, 5, 3);
    }
    public static int multiples(int n, int a, int b) {
        int total = 0;

        for (int i = 1; i < n; i++) {
            if (i % a == 0 || i % b == 0) {
                total += 1;
            }
        }
        return total;
    }


}
