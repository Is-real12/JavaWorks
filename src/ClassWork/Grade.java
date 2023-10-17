package ClassWork;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        /* * enter a student score and check it
         * if score is 90 to 100
         * print "A"
         *
         * if score is  80 to 89
         * print "B"
         *
         * if score is  70 to 79
         * print "C"
         *
         * if score is  60 to 69
         * print "D"
         *
         * if score is less than 60
         * print "F"
         */

        System.out.print(" Enter a Score: ");

        Scanner scanner = new Scanner(System.in);

        int scoreNumber = scanner.nextInt();

        if (scoreNumber >= 90 && scoreNumber <= 100) System.out.println("your grade is \tA");
        if (scoreNumber >= 80 && scoreNumber <= 89) System.out.println("you grade is \tB");
        if (scoreNumber >= 70 && scoreNumber <= 79) System.out.println("you grade is \tC");
        if (scoreNumber >= 60 && scoreNumber <= 69) System.out.println("you grade is \tD");
        if (scoreNumber < 60) System.out.println("you have a F");
    }
}