package lab1;

public class Multiples {
    static void main() {
        int total = 1;

        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                total += 1;
            }
        }
        System.out.println(total);
    }
}
