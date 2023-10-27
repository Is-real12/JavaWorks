package ArrayAss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrading {
    public static void main(String[] args) {
        ArrayList<Integer> averagePosi = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String saved = "Saving >>>>>>>>>>>>>>>>>>>>>>>\nSaved Successfully";
        System.out.println("How many students do you have: ");
        int studentSize = scanner.nextInt();
        System.out.println("How many subjects do they offer: ");
        int subject = scanner.nextInt();
        System.out.println(saved);
        int[][] arrayScore = new int[studentSize][subject];

        for (int i = 0; i < studentSize; i++) {
            for (int j = 0; j < subject; j++) {
                System.out.println("\nEnter score for student " + (i + 1) + "\nEnter score for subject: " + (j + 1));
                int subjectScore = scanner.nextInt();
                arrayScore[i][j] = subjectScore;
            }
        }

        System.out.print("""
                            _____________________________________________________________________________________________________
                            Student\t\t""");
        for (int i = 0; i < arrayScore.length; i++) {
            System.out.printf("Student %d \t", (i + 1));
        }
        System.out.print("TOTAL\tAVG\t\tPOS");
        System.out.print("""
                            
                            _____________________________________________________________________________________________________""");
        for (int i = 0; i < arrayScore.length; i++) {
            int sum = 0;

            System.out.printf("\nStudent %-9d", (i + 1));
            for (int j = 0; j < arrayScore[i].length; j++) {
                System.out.printf("%-9s", arrayScore[i][j]);
                sum += arrayScore[i][j];
            }

            double average = sum / (double) arrayScore[i].length;
            System.out.printf("%-8d", sum);
            System.out.printf("%-8.2f", average);
            averagePosi.add((int) average);
            calculatePositions(averagePosi);

        }


    }

    private static void calculatePositions(ArrayList<Integer> averagePosi) {
        ArrayList<Integer> positions = new ArrayList<>();

        for (int pos = 0; pos < averagePosi.size(); pos++) {
            int position = 1;
            int score = averagePosi.get(pos);
            for (int j = 0; j < averagePosi.size(); j++) {
                if (pos != j && averagePosi.get(j) > score) {
                    position++;
                }
            }
            positions.add(position);
        }
        for (Integer position : positions) {
            System.out.printf("%s", position);
        }

    }
}
