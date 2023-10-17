package Chapter4;

import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int firstLargest = 0;
        int secondLargest = 0;
        while (count < 5) {

            count++;
            System.out.println("ENTER A NUMBER");
            int number = scanner.nextInt();


            if (number > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = number;
            }

           else if (number > secondLargest) {
                secondLargest = number;
            }

        }


        System.out.println(firstLargest);
        System.out.println(secondLargest);
}
}
// dont forget you else if israel ooo.