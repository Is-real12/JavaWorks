package Chapter7;

import java.util.Random;

public class CodNotCoding_DieRol {
    public static void main(String[] args) {

            int[] sumCount = new int[13];

                Random random = new Random();


                for (int i = 0; i < 36000000; i++) {
                 int die1 = random.nextInt(6) + 1;

                    int die2 = random.nextInt(6) + 1;


                    int sum = die1 + die2;


                    sumCount[sum]++;
                }

                System.out.printf("%-5s%-12s\n", "Sum", "Frequency");
                System.out.println("----------------");
                for (int i = 2; i <= 12; i++) {
                    System.out.printf("%-5d%-12d\n", i, sumCount[i]);
                }
            }
        }
