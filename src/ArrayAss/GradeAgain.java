package ArrayAss;

import java.util.Arrays;
import java.util.Scanner;

public class GradeAgain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();


        int[][] scores = new int[numStudents][numSubjects];


        for (int i = 0; i < numStudents; i++) {



            for (int j = 0; j < numSubjects; j++) {
                System.out.println("Enter scores for " + (i+1));
                System.out.print("Enter score for Subject " + (j + 1) + ": ");
                scores[i][j] = scanner.nextInt();
            }
        }


        int[] totals = new int[numStudents];
        double[] averages = new double[numStudents];

        for (int i = 0; i < numStudents; i++) {
            int total = 0;
            for (int j = 0; j < numSubjects; j++) {
                total += scores[i][j];
            }
            totals[i] = total;
            averages[i] = (double) total / numSubjects;
        }


        int[] positions = Testing.pos(numStudents,totals);

        System.out.println("-----------------------------------------------------------");
        System.out.print("STUDENT\t\t");
        for (int i = 0; i < numStudents; i++){
            System.out.printf("SUB%-8d",(i+1));
        }

        System.out.print("TOT\t\tAVE\t\t   POS\n");
        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%s\t%d\t", "Subject", (i + 1));
            for (int j = 0; j < numSubjects; j++) {
                System.out.printf("%-8d\t", scores[i][j]);
            }
            System.out.printf("%-4d\t %.2f\t\t%-3d\n", totals[i], averages[i], positions[i]);

        }
        int[][] ColSwapScore = Testing.swapping(scores);

        int[] ColTotals = new int[numStudents];
        double[] ColAverages = new double[numStudents];

        for (int i = 0; i < numStudents; i++) {
            int total = 0;
            for (int j = 0; j < numSubjects; j++) {
                total += ColSwapScore[i][j];
            }
            ColTotals[i] = total;
            ColAverages[i] = (double) total / numSubjects;
        }
int[] ColPosition  = Testing.pos(numStudents, ColTotals);

        System.out.println();
        System.out.println("Subject Summary");
        for (int i = 0; i < numStudents; i++) {
            int highestPos = 0;
            int largestScore = 0;
            int lowestScore = 0;


            for (int j = 0; j < numStudents; j++) {
            if (ColSwapScore[i][j] > largestScore){
                    largestScore = ColSwapScore[i][j];
                }


            lowestScore = largestScore;
                if (ColSwapScore[i][j] < lowestScore){
                    lowestScore = ColPosition[i];
                }
            }
            if (ColPosition[i] > highestPos){
                highestPos = ColPosition[i];
            }
            int lowestPos = highestPos;
            for (int posLow = 0; posLow < ColPosition.length; posLow++) {
                if (ColPosition[posLow] < lowestPos){
                    lowestPos = ColPosition[posLow];
                }

            }

            System.out.printf("Subject %d\n", (i + 1));
            System.out.printf("""
                        Highest Scoring student is Student %d Scoring %d
                        Lowest Scoring Student is Student %d Scoring %d
                        Total Score is: %d
                        Average Score is %.2f
                        Number of Passes:    
                        Number of Fails: 

                        """,highestPos, largestScore, lowestPos, lowestScore, ColTotals[i], ColAverages[i]);
        }
        }
}