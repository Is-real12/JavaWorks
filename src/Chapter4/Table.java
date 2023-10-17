package Chapter4;

public class Table {
    public static void main(String[] args) {
        System.out.println("N  N2  N3  N4");

        int n = 1;

        while (n <= 5) {
            int n2 = n * n;
            int n3 = n2 * n;
            int n4 = n3 * n;

            System.out.printf("%d   %d   %d   %d%n", n, n2, n3, n4);

            n++;
        }
    }
}
