import java.util.Scanner;

public class PalindromeNumber1 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter a three-digit integer: ");
int number = scanner.nextInt();
int originalNumber = number;
int reversedNumber = 0;

int digit1 = number / 100;
int digit2 = (number / 10) % 10;
int digit3 = number % 10;

reversedNumber = digit3 * 100 + digit2 * 10 + digit1;
if (originalNumber == reversedNumber) {
System.out.println("The number is a palindrome.");

}
else if (originalNumber != reversedNumber) {
System.out.println("The number is not a palindrome.");
            
}

    
}
}




































