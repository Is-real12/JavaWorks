package ClassWork;

public class Main {


    public static int sumDigit(int number) {
        if (number < 0){ number = -number;}


        int digit = 0;
        while (number > 0) {

            int remainder = number % 10;

            digit += remainder;

            number /= 10;

        }
        return digit;

    }


    public static void main(String[] args) {

        int result = sumDigit(1234);
        System.out.println(result);

    }
}