package ClassWork;
import java.util.Scanner;

public class Random {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a random Number: ");
//
//        int random = scanner.nextInt();
//
//
//        switch (random){
//            case 1:
//                System.out.println("January");
//                break;
//
//            case 2:
//                System.out.println("February");
//                break;
//
//            case 3:
//                System.out.println("March");
//                break;
//
//            case 4:
//                System.out.println("April");
//                break;
//
//            case 5:
//                System.out.println("May");
//                break;
//
//            case 6:
//                System.out.println("June");
//                break;
//
//            case 7:
//                System.out.println("July");
//                break;
//
//            case 8:
//                System.out.println("August");
//                break;
//
//            case 9:
//                System.out.println("September");
//                break;
//
//            case 10:
//                System.out.println("October");
//                break;
//
//            case 11:
//                System.out.println("November");
//                break;
//
//            case 12:
//                System.out.println("December");
//                break;
//
//            default:
//                System.out.println("oga enter from one to twelve");
//        }
//


        System.out.println("Enter today's day");
        int date = scanner.nextInt();

        System.out.println("Enter your future day");
        int future = scanner.nextInt();

        int week = date + future % 7;

        switch (date){

            case 0:
                System.out.println("today is Sunday");
            break;

            case 1:
                System.out.println("today is monday");
                break;

            case 2:
                System.out.println("today is Tuesday");

                break;

            case 3:
                System.out.println("today is Wednesday");

                break;

            case 4:
                System.out.println("today is Thursday");

                break;

            case 5:
                System.out.println("today is Friday");

                break;

            case 6:
                System.out.println("today is Saturday");
                break;
        }
        for(int num = 0; num<33; num++) {
            switch (week) {

                case 0:
                    System.out.println("your future day is Sunday");
                    break;

                case 1:
                    System.out.println("your future day is monday");
                    break;

                case 2:
                    System.out.println("your future day is Tuesday");

                    break;

                case 3:
                    System.out.println("your future day is Wednesday");

                    break;

                case 4:
                    System.out.println("your future day is Thursday");

                    break;

                case 5:
                    System.out.println("your future day is Friday");

                    break;

                case 6:
                    System.out.println("your future day is Saturday");
                    break;
            }


        }



























    }
}
