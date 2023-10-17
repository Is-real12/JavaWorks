package MrChiWeekEndSnack.Functions;

public class IsSquare {
    public static boolean isSquare(int num) {
        if (num < 0) {
            return false;
        }

        int sqrt = 1;
        while (sqrt * sqrt < num) {
            sqrt++;
        }

        return sqrt * sqrt == num;
    }

}
