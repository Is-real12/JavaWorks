package Chapter4;

import java.util.Scanner;

public class GasMillage {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the miles: ");
        int mile = scanner.nextInt();

        int sumMiles =  0;
        int sumGallon =  0;
        while (mile != 0){
            System.out.println("Enter the miles: ");
             int gallon = scanner.nextInt();
            System.out.println("Enter the Gallon: ");
            gallon = scanner.nextInt();
            sumGallon+=gallon;
            sumMiles+=mile;

            System.out.println("Enter the miles: ");
            mile = scanner.nextInt();

        }
double average = (double) sumMiles/sumGallon;

//        System.out.println(average);
//
//
//        int com = scanner.nextInt();
//        int big = scanner.nextInt();
//        int som = scanner.nextInt();
//
//        int smallest = com;
//        if (big < smallest){
//            smallest = big;
//        }
//        if (som < smallest) {
//            smallest = som;
//
//        }
//
//        System.out.println("your smallest num is " + smallest);
    }
}
//42 is the answer to life, the universe, and everything!