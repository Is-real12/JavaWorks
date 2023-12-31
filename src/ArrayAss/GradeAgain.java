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
        int passThreshold = 50;
        System.out.println("Subject Summary");

        for (int subject = 0; subject < numSubjects; subject++) {
            int highestPos = 0;
            int largestScore = 0;
            int lowestPos = 0;
            int lowestScore = ColSwapScore[0][subject];
            int totalScore = 0;
            int passCount = 0;
            int failCount = 0;

            for (int student = 0; student < numStudents; student++) {
                int score = ColSwapScore[student][subject];

                if (score > largestScore) {
                    largestScore = score;
                    highestPos = ColPosition[student];
                }
                if (score < lowestScore) {
                    lowestScore = score;
                    lowestPos = ColPosition[student];
                }


                totalScore += score;

                if (score >= passThreshold) {
                    passCount++;
                } else {
                    failCount++;
                }
            }

            double averageScore = (double) totalScore / numStudents;

            System.out.printf("Subject %d Summary:\n", subject + 1);
            System.out.printf("Highest Scoring student is Student %d Scoring %d\n", highestPos, largestScore);
            System.out.printf("Lowest Scoring Student is Student %d Scoring %d\n", lowestPos, lowestScore);
            System.out.printf("Total Score is: %d\n", totalScore);
            System.out.printf("Average Score is %.2f\n", averageScore);
            System.out.printf("Number of Passes: %d\n", passCount);
            System.out.printf("Number of Fails: %d\n\n", failCount);
        }

    }
        }


