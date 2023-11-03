package ArrayAss;

import java.util.Scanner;

public class AgainStud {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of Student: ");
        int studentSize = scanner.nextInt();
        System.out.println("Enter the size of Student: ");
        int subjectSize = scanner.nextInt();

        int[][] scores = methodScores(studentSize, subjectSize, scanner);
        int[] totals = methodTotal(scores, studentSize, subjectSize);
        double[] average = methodAverage(totals, subjectSize);
        int[] position = methodPos(totals, subjectSize);

        displayStudentStatics(subjectSize,studentSize,scores, totals, average, position);

        int[][] swappedScore = methodSwappedScores(scores);
        int[] swappedTotal = methodTotal(swappedScore,studentSize,subjectSize);
        double[] swappedAverage = methodAverage(swappedTotal, subjectSize);
        int[] swappedPosition = methodPos(swappedTotal, subjectSize);

        displaySwappedSubjectSummary(studentSize, subjectSize, swappedPosition, swappedScore, swappedTotal, swappedAverage);

    }

    private static void displaySwappedSubjectSummary(int studentSize, int subjectSize, int[] swappedPosition, int[][] swappedScore, int[] swappedTotal, double[] swappedAverage) {
        System.out.println();
        System.out.println("Subject Summary");
        int threasHold = 50;
        for (int i = 0; i < studentSize; i++) {

//            int lowestScore = ColSwapScore[0][i];
            int totalScore = swappedTotal[i];
            double averageScore = swappedAverage[i];

            int largestPosition = 0;
            int lowestPosition = 0;
            int largestScore = 0;
            int lowestScore = swappedScore[0][i];
            int passes = 0;
            int fails = 0;
            for (int j = 0; j < subjectSize; j++) {
                int score = swappedScore[i][j];
            if (score > largestScore){
                largestScore = score;
                largestPosition = swappedPosition[j];
            }
            if (score < lowestScore){
                lowestScore = score;
                lowestPosition = swappedPosition[j];
            }
            if (score > threasHold){
                passes++;
            }else {
                fails++;
            }
            }
            System.out.printf("""
                                Subject %d
                                Highest scoring Student is: Student %d scoring %d
                                Lowest scoring Student is: Student %d scoring %d
                                Total Score is: %d
                                Average score is: %.2f
                                numbers of passes: %d
                                numbers of fails: %d\n
                                """,(i+1),largestPosition,largestScore,lowestPosition,lowestScore, totalScore,averageScore,passes,fails);
        }
    }



    private static int[][] methodSwappedScores(int[][] scores) {
        int[][] swappedScore = new int[scores.length][scores.length];
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores.length; j++) {
                swappedScore[i][j] =scores[j][i];

            }
        }

        return swappedScore;
    }

    private static void displayStudentStatics(int subjectSize, int studentSize, int[][] scores, int[] totals, double[] average, int[] position) {
        System.out.println("""
                            ______________________________________________________________
                            --------------------------------------------------------------""");

        System.out.printf("%s\t\t","Student");
        for (int i = 0; i < subjectSize; i++) {
            System.out.printf("%s%d\t\t","SUB ",(i+1));
        }
        System.out.printf("%s\t\t%s'\t\t%s\n","TOT","AVE","POS");
        System.out.println("""
                            ______________________________________________________________
                            --------------------------------------------------------------""");

        for (int i = 0; i < studentSize; i++) {
            System.out.printf("%s %d\t\t","Subject",(i+1));
            for (int j = 0; j < subjectSize; j++) {
                System.out.printf("%d\t\t",scores[i][j]);
            }
            System.out.printf("%d\t\t",totals[i]);
            System.out.printf("%.2f\t\t",average[i]);
            System.out.printf("%d\n",position[i]);

        }
        System.out.println("""
                            ______________________________________________________________
                            --------------------------------------------------------------""");

    }


    private static int[] methodPos(int[] totals, int subjectSize) {
        int[] arrayPos = new int[subjectSize];
        for (int i = 0; i < subjectSize; i++) {
            int pos = 1;
            for (int j = 0; j < subjectSize; j++) {
                if (totals[j] > totals[i]){
                    pos++;
                }
            }
            arrayPos[i] = pos;

        }

        return arrayPos;
    }

    private static double[] methodAverage(int[] totals, int subjectSize) {
        double[] arrayAverage = new double[subjectSize];
        for (int i = 0; i < subjectSize; i++) {
            double average = (double) totals[i] / subjectSize;
            arrayAverage[i] = average;
        }
        return arrayAverage;
    }

    private static int[] methodTotal(int[][] scores, int studentSize, int subjectSize) {
        int[] arrayTotal = new int[subjectSize];
        for (int integer = 0; integer < studentSize; integer++) {
            int total = 0;
            for (int j = 0; j < subjectSize; j++) {
                total += scores[integer][j];

            }
            arrayTotal[integer] = total;
        }


        return arrayTotal;
    }

    private static int[][] methodScores(int studentSize, int subjectSize, Scanner scanner) {
        int[][] arrayScores = new int[studentSize][subjectSize];
        for (int i = 0; i < studentSize; i++) {
            for (int j = 0; j < subjectSize; j++) {
                System.out.printf("""
                                    Entering Scores for student %d
                                    Enter scores for subject %d
                                    """,(i+1), (j+1));
               int  scores = scanner.nextInt();
               arrayScores[i][j] = scores;

            }
        }
        return arrayScores;
    }
}
