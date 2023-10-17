package Chapter4;

import java.util.Scanner;

public class Factoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER A NUMBER: ");
        int number = scanner.nextInt();

        int result = 1;
        while (number > 1) {
            result *= number;
            number--;
        }
        System.out.println(result);

    }
}
