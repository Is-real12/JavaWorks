package ArrayAss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StudentGrading {
    public static void main(String[] args) {

        int maxi = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer> averagePosi = new ArrayList<>();
        String saved = "Saving >>>>>>>>>>>>>>>>>>>>>>>\nSaved Successfully";
        System.out.println("How many student do you have: ");
        int studentSize = scanner.nextInt();
        System.out.println("How many subject do they offer: ");
        int subject = scanner.nextInt();
        System.out.println(saved);
        int[][]  arrayScore = new int[studentSize][subject];

        for (int i = 0; i <studentSize ; i++) {
            for (int j =0; j <subject ; j++) {
                System.out.println("\nEnter score for student "+(i+1)+"\nEnter score for subject: "+(j+1));
                int subjectScore = scanner.nextInt();

                arrayScore[i][j] = subjectScore;
            }
        }

        System.out.print("""
                            __________________________________________________________
                            Student\t\t""");
        for (int i = 0; i < arrayScore.length; i++) {
            System.out.printf("Student %d \t",(i+1));
        }
        System.out.print("TOTAL\tAVG\t\tPOS");
        System.out.print("""
                            
                            __________________________________________________________""");
        for (int i = 0; i < arrayScore.length; i++) {
            int sum = 0;

            System.out.printf("\nStudent %-9d",(i+1));
            for (int j = 0; j < arrayScore[i].length; j++) {
//                average = arrayScore[[j];

                System.out.printf("%-9s",arrayScore[i][j]);
                sum += arrayScore[i][j];
                
            }

            double average = sum /(double) arrayScore[i].length;
            System.out.printf("%-8d",sum);
            System.out.printf("%-8s",average);
            int[]  maximums = new int[sum];
            averagePosi.add( sum);




        }
        for (int terate = 0; terate < averagePosi.size(); terate++) {
            if (maxi > averagePosi.get(terate)) {
                maxi = arrayScore.length;
                break;
            }
        }

        System.out.println(maxi);



    }
}
