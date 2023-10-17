package ClassWork;

import java.util.Scanner;

public class sudo {


    public static void main(String[] args) {
//


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        int count = 0;
        for (int i = 100000; i <= number; i = i + 2) {
            count = i / number;
            if (i == 4) System.out.println("two is part");
        }
        System.out.println(count);


        System.out.println("enter a number: ");
        int num1 = scanner.nextInt();


        if (num1 % 2 == 0) {
            System.out.println(num1 + " is a prime number");
        } else
            System.out.println(num1 + " is not a prime number");


        System.out.println("enter a number: ");
        int num2 = scanner.nextInt();

        if (num2 / num2 == 1 && num2 / 1 == num2) {
            System.out.println("and we hae a prime number what a good thing");
        } else {
            System.out.println(num2 + " not a prime num");
        }


        System.out.print("Enter a number: ");
        int number1 = scanner.nextInt();


        for (int num = 2; num <= number1 / 2; num++) {
            if (number1 % num == 0) {

                System.out.println(number1 + " is a prime number.");
            }


        }
        if (number1 <= 1) {
            System.out.println(number + " is not a prime number.");


            System.out.println("Enter a number ");
            int num = scanner.nextInt();

            int divisor = 0;

            for (int divisor1 = 1; divisor1 <= num; divisor1++) {
                if (num % divisor1 == 0) {
                    divisor++;
                }
            }
//        System.out.println(divisor);

            if (divisor % num == 1) {
                System.out.println("Your num is a prime number");
            } else {
                System.out.println("not a prime number");
            }


//            september weekend assignment


//            int result = 0;
//            int count1 = 1;
//            for (int i = 1; i <= 10; i++) {
//
//                result += i;
//
//                int week = today + future % 7;
//                System.out.println(result);
//
//
//            }

            System.out.println("A.\tB.\tpow(a, b)");


            for (int a = 1; a <= 5; a++) {

                int b = a + 1;
                double result = Math.pow(a, b);


                System.out.println(a + "\t" + b + "\t" + result);
            }


            int largest = 0;
            int smallest = 0;


            String choice;
            do {

                System.out.print("Enter a number: ");
                int number2 = scanner.nextInt();
                largest = number2;
                smallest = number2;

                System.out.print("Do you want to enter another number? (yes/no): ");
                choice = scanner.nextLine();
                if (choice == "no" || choice == "No") {

                    if (number > largest) {
                        largest = number2;
                    }
                    if (number < smallest) {
                        smallest = number2;
                    }


                } else {
                    System.out.print("Do you want to enter another number? (yes/no): ");
                    String choice1 = scanner.nextLine();
                }
            } while (choice == "yes" || choice == "yes");


            System.out.println("Largest number entered: " + largest);
            System.out.println("Smallest number entered: " + smallest);

            System.out.println("Enter a number:");

            int number3 = scanner.nextInt();
            int fac = 1;
            for (int i = 1; i <= number3; i++) {
                fac *= i;

            }
            System.out.println(fac);


        }
    }


}

