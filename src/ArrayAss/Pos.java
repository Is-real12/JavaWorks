package ArrayAss;
import java.util.Scanner;
import java.util.ArrayList;
public class Pos {
public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            ArrayList<Integer> scores = new ArrayList<>();
//            ArrayList<Integer> assignedPositions = new ArrayList<>();
//
//            for (int i = 1; i <= 5; i++) {
//                System.out.print("Enter the score for student " + i + ": ");
//                int score = scanner.nextInt();
//                scores.add(score);
//            }
//            for (int i = 0; i < scores.size(); i++) {
//                int position = 1;
//                int score = scores.get(i);
//                for (int j = 0; j < scores.size(); j++) {
//                    if (i != j && scores.get(j) > score) {
//                        position++;
//                    }
//                }
//                assignedPositions.add(position);
//            }
//            for (int i = 0; i < scores.size(); i++) {
//                int score = scores.get(i);
//                int position = assignedPositions.get(i);
//                System.out.println("Score " + score + " is in position " + position);
//            }
//
//
//
//ArrayList <Integer> averagePosi = new ArrayList<>();
//            averagePosi.add(6);
//            averagePosi.add(9);
//            averagePosi.add(12);
//            averagePosi.add(59);
//
//            for (int pos = 0; pos < averagePosi.size(); pos++) {
//                int position = 1;
//                int score = averagePosi.get(pos);
////                System.out.print(averagePosi.get(pos));
//                for (int j = 0; j < averagePosi.size(); j++) {
//
//
//                    if (pos != j && averagePosi.get(j) > score) {
//                        position++;
//                    }
//                }
//                System.out.printf("Score(%d) %s   pos, %d\t ",(pos+1), averagePosi.get(pos),position);
//            }
    int[] scores = {24, 12, 65, 63, 23};

    for (int i = 0; i < scores.length; i++) {
        int score = scores[i];
        int position = 1;

        for (int j = 0; j < scores.length; j++) {
            if (scores[j] < score) {
                position++;
            }
        }

        System.out.println(score + ": " + position);
    }
        }
    }














