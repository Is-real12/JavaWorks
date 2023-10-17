package ClassWork;

import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
//        int nonsense = Math.max(9, 1);
//        int rubbish = Math.min(9, 1);
//
//        System.out.println("your maximum is "+nonsense);
//        System.out.println("your minimum is "+rubbish);
        Scanner scanner = new Scanner(System.in);

        double moni = scanner.nextDouble();
        double per = scanner.nextDouble();


        double  percent = moni*per / 100;

        System.out.println(percent);
    }
}
