package MrChiWeekEndSnack.Functions;

public class FactorOf {
    public static int factorOf(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }

}
