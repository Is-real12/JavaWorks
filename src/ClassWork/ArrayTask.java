import java.util.Scanner;

public class ArrayTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] scores = new int[10];
        int sum = 0;
        int average = 0;
        int largest = scores[0];
        int minimum = scores.length;

        String printOdd = "";
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter Score: ");
            scores[i] = scanner.nextInt();

            sum += scores[i];


            if (scores[i] > largest){
                largest = scores[i];
            }else if(scores[i] < minimum){
                minimum = scores[i];
            }

            if (scores[i] % 2 != 0){
             printOdd += scores[i]+" " ;




            }


        }
        average = sum / scores.length;
        System.out.println("the sum is "+sum);
        System.out.println("your average is "+average);
        System.out.println("the odd are " + printOdd);
        System.out.println("your maximum is "+largest);
        System.out.println("your minimum is "+minimum);

    }
}
