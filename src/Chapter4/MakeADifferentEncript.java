package Chapter4;

import java.util.Scanner;

public class MakeADifferentEncript {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("ENTER FOUR DIGIT INTEGER: ");
            int input = scanner.nextInt();

            int each1 = (input / 1000);
            int each2 = (input / 100 % 10);
            int each3 = (input / 10 % 10);
            int each4 = (input % 10);


            each1 = (each1 + 7) % 10;
            each2 = (each2 + 7) % 10;
            each3 = (each3 + 7) % 10;
            each4 = (each4 + 7) % 10;


            int temp = each1;
            each1 = each3;
            each3 = temp;

            temp = each2;
            each2 = each4;
            each4 = temp;


            int encryptedNumber = each1 * 1000 + each2 * 100 + each3 * 10 + each4;
            System.out.printf("Encrypted integer: %d%n", encryptedNumber);


            System.out.print("ENTER THE ENCRYPTED FOUR DIGIT INTEGER: ");
            int encryptedInput = scanner.nextInt();

            int encrypt1 = (encryptedInput / 1000);
            int encrypt2 = (encryptedInput / 100 % 10);
            int encrypt3 = (encryptedInput / 10 % 10);
            int encrypt4 = (encryptedInput % 10);



            encrypt1 = (encrypt1 - 7 + 10) % 10;
            encrypt2 = (encrypt2 - 7 + 10) % 10;
            encrypt3 = (encrypt3 - 7 + 10) % 10;
            encrypt4 = (encrypt4 - 7 + 10) % 10;



            temp = encrypt1;
            encrypt1 = encrypt3;
            encrypt3 = temp;

            temp = encrypt2;
            encrypt2 = encrypt4;
            encrypt4 = temp;


            int decryptedNumber = encrypt1 * 1000 + encrypt2 * 100 + encrypt3 * 10 + encrypt4;
            System.out.printf("Decrypted integer: %d%n", decryptedNumber);
        }
    }
}
