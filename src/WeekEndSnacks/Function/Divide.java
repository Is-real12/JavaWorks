package MrChiWeekEndSnack.Functions;

public class Divide {
    public static double divide(int dividend, int divisor) {
        if (divisor == 0) {
            return 0;
        }

        double result =  dividend / divisor;
        result =  (result * 100) / 100.0;

        return result;
    }

}
