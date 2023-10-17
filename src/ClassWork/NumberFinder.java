package ClassWork;
import java.util.Scanner;
public class NumberFinder {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");

            int userNumber = scanner.nextInt();
int divisor1  = 0;
            System.out.println("Sizes of divisors that can divide the input without remainder:");
            for (int divisor = 1; divisor <= userNumber; divisor++) {
                if (userNumber % divisor == 0) {

                    divisor1++;
                }
            }
            System.out.println(divisor1);
        }


        }



