package ArrayAss;
import java.util.Scanner;
public class GradeMethod {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int[][] scores = inputScores(numStudents, numSubjects, scanner);
        int[] totals = calculateTotals(scores, numStudents, numSubjects);
        double[] averages = calculateAverages(totals, numStudents, numSubjects);
        int[] positions = calculatePositions(totals);

        displayStudentGrades(numStudents, numSubjects, scores, totals, averages, positions);

        int[][] ColSwapScore = Testing.swapping(scores);
        int[] ColTotals = calculateTotals(ColSwapScore, numStudents, numSubjects);
        double[] ColAverages = calculateAverages(ColTotals, numStudents, numSubjects);
        int[] ColPositions = calculatePositions(ColTotals);

        displaySubjectSummary(numStudents, numSubjects, ColSwapScore, ColTotals, ColAverages, ColPositions);
    }


    public static int[][] inputScores(int numStudents, int numSubjects, Scanner scanner) {
        int[][] scores = new int[numStudents][numSubjects];
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < numSubjects; j++) {
                System.out.println("Enter scores for Student " + (i + 1));
                System.out.print("Enter score for Subject " + (j + 1) + ": ");
                scores[i][j] = scanner.nextInt();
            }
        }
        return scores;
    }


    public static int[] calculateTotals(int[][] scores, int numStudents, int numSubjects) {
        int[] totals = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            int total = 0;
            for (int j = 0; j < numSubjects; j++) {
                total += scores[i][j];
            }
            totals[i] = total;
        }
        return totals;
    }

    public static double[] calculateAverages(int[] totals, int numStudents, int numSubjects) {
        double[] averages = new double[numStudents];
        for (int i = 0; i < numStudents; i++) {
            averages[i] = (double) totals[i] / numSubjects;
        }
        return averages;
    }

    public static int[] calculatePositions(int[] totals) {
        int[] positions = Testing.pos(totals.length, totals);
        return positions;
    }

     static void displayStudentGrades(int numStudents, int numSubjects, int[][] scores, int[] totals, double[] averages, int[] positions) {
        System.out.println("-----------------------------------------------------------");
        System.out.print("STUDENT\t\t");
        for (int i = 0; i < numStudents; i++){
            System.out.printf("SUB%-8d",(i+1));
        }

        System.out.print("TOT\t\tAVE\t\t   POS\n");
        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%s\t%d\t", "Student", (i + 1));
            for (int j = 0; j < numSubjects; j++) {
                System.out.printf("%-8d\t", scores[i][j]);
            }
            System.out.printf("%-4d\t %.2f\t\t%-3d\n", totals[i], averages[i], positions[i]);
        }
    }


    public static void displaySubjectSummary(int numStudents, int numSubjects, int[][] ColSwapScore, int[] ColTotals, double[] ColAverages, int[] ColPositions) {
        System.out.println();
        System.out.println("Subject Summary");
        int passThreshold = 50;

        for (int i = 0; i < numSubjects; i++) {
            int highestPos = 0;
            int largestScore = 0;
            int lowestPos = 0;
            int lowestScore = ColSwapScore[0][i];
            int totalScore = ColTotals[i];
            double averageScore = ColAverages[i];
            int passCount = 0;
            int failCount = 0;

            for (int j = 0; j < numStudents; j++) {
                int score = ColSwapScore[j][i];

                if (score > largestScore) {
                    largestScore = score;
                    highestPos = ColPositions[j];
                }

            if (score < lowestScore) {
                    lowestScore = score;
                    lowestPos = ColPositions[j];
                }


                if (score >= passThreshold) {
                    passCount++;
                } else {
                    failCount++;
                }
            }


            System.out.printf("Subject %d Summary:\n", i + 1);
            System.out.printf("Highest Scoring student is Student %d Scoring %d\n", highestPos, largestScore);
            System.out.printf("Lowest Scoring Student is Student %d Scoring %d\n", lowestPos, lowestScore);
            System.out.printf("Total Score is: %d\n", totalScore);
            System.out.printf("Average Score is %.2f\n", averageScore);
            System.out.printf("Number of Passes: %d\n", passCount);
            System.out.printf("Number of Fails: %d\n\n", failCount);
        }
    }
}