import java.util.Arrays;
import java.util.Scanner;

public class JJ {
    public static void main(String[] args) {

//        int[][] arr = {
//                {4, 2, 5, 6},
//                {3, 1, 9, 0},
//                {14, 12, 17, 16},
//                {2, 43, 23, 54}
//        };
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter rubbish the first and second array: ");
//        System.out.print("Enter the row: \n");
//        int row = scanner.nextInt();
//        System.out.print("Start position: \n");
//        int startPosition = scanner.nextInt();
//        System.out.print("End position: \n");
//        int endPosition = scanner.nextInt();
//int end = 0;
//int set = 0;
//int get = 0;
//    for (int i = 0; i < arr.length; i++) {
//         set= row-1;
//        get = startPosition-1;
//
////            System.out.println(Arrays.toString(arr[set]));
//
//    }System.out.println("your rubbish is "+Arrays.toString(new int[]{arr[set][get]}));
//        for (int i = set; i <= arr[set][get]; i++) {
//            int[] final1 = arr[i];
//            System.out.println(Arrays.toString((final1));
//
//
//        }
    }

        public static int[][] UserBenefit ( int[][] dataSet, int row, int startPosition, int endPosition){
            int[] rowData = dataSet[row - 1];
            int[] extractedData = new int[(endPosition - startPosition) + 1];
            int count = 0;

            for (int i = startPosition - 1; i < endPosition; i++) {
                extractedData[count] = rowData[i];
                count++;

            }
            return new int[][]{extractedData};
           // incase of neccessity return new int[][]{extractedData};


            //in for some reason function

//public static int[][] UserBenefit(int[] arr)

        }

}