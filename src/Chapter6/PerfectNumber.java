package Chapter6;

public class PerfectNumber {
    public static void main(String[] args) {
        int perfect = 6;
        int printing = perfect;
        int count = 0;
            int sum = 0;
        for (int i = 0; i < perfect; i++) {
            for (int j = 0; j < perfect; j++) {
                sum = i + j;
            }

        }
        System.out.println(sum);

    }
}
