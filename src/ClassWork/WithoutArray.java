import java.util.Scanner;

public class WithoutArray {
    public static void main(String[] args) {
        int sum = 0;
        int average = 0;
        int maximum = 0;
        int minimum = 0;
        String printOdd = "";
        Scanner scanner = new Scanner(System.in);
        String withoutArray = "";
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter Score: ");
            int score = scanner.nextInt();
            if (score > maximum) {
                maximum = score;
//                minimum = maximum;
            }else if (score < maximum) {
                minimum = score;
            }

            withoutArray += score + " ";
            sum += score;

            if (score % 2 == 0){
                printOdd += score+" " ;

//               printOdd += odd+" ";


            }


        }

        average = sum / 10;

        System.out.println("the odd are " + printOdd);
        System.out.println("your list is: "+withoutArray+" ");
        System.out.println("the sum is: "+sum);
        System.out.println("your average: is "+average);
        System.out.println("the maximum is: "+ maximum);
        System.out.println("your minimum is "+ minimum);

    }
}
