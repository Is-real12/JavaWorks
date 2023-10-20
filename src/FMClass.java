import java.util.ArrayList;
import java.util.Arrays;

public class FMClass {
    public static int lenght(String TaskStrs) {

//        String[] num = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String TaskStr = Arrays.toString(new String[]{Arrays.toString(TaskStrs.toCharArray())});
        int number = 0;
        char[] charArray = TaskStr.toCharArray();
        for (int Iterate = 0; Iterate < charArray.length; Iterate++) {
            char c = charArray[Iterate];

            if (c == '2') {
                number++;
            }
            if (c == '1') {
                number++;
            }
            if (c == '3') {
                number++;
            }
            if (c == '4') {
                number++;
            }
            if (c == '5') {
                number++;
            }
            if (c == '6') {
                number++;
            }
            if (c == '7') {
                number++;
            }
            if (c == '8') {
                number++;
            }
            if (c == '9') {
                number++;
            }
            if (c == '0') {
                number++;
            }


        }


        return number;
    }

    public static void main(String[] args) {
        String TaskStrs = "ABc21F, 13CPZ, A1Ln";


        ArrayList<String> append = new ArrayList<>();
        String num = Arrays.toString(new String[]{"1 2 3 4 5 6 7 8 9"});
        String TaskStr = Arrays.toString(new String[]{Arrays.toString(TaskStrs.toCharArray())});
        String nums = Arrays.toString(new String[]{Arrays.toString(num.toCharArray())});

        int number = 0;
        char[] charArray = TaskStr.toCharArray();
        char[] numbers = nums.toCharArray();
//        for (int Iterate = 0; Iterate < charArray.length; Iterate++) {

            for (int i = 0; i < charArray.length; i++) {
                char c = charArray[i];
                char sep = numbers[i];
                if (c == sep) {
                    number++;
//                if (i <5){
//                    for (int j = 0; j < numbers.length; j++) {
//
//
//                    }

//                }
//                    break;

                }
            }System.out.println(number);
        }


//
//
//        String[] num = new String[]{"1", "2", "3", "4", "5,", "6", "7", "8", "9"};
//        String TaskStr = Arrays.toString(new String[]{Arrays.toString(TaskStrs.toCharArray())});
//        System.out.println(TaskStr);
//        int number = 0;
//
//        char[] charArray = TaskStr.toCharArray();
////        System.out.println(charArray);
//        for (int Iterate = 0; Iterate < charArray.length; Iterate++) {
//            char c = charArray[Iterate];
//
//            if (c == '1') {
//                number++;
//            }
//
//            if (c == '2') {
//                number++;
//            }
//            if (c == '3') {
//                number++;
//            }
//            if (c == '4') {
//                number++;
//            }
//            if (c == '5') {
//                number++;
//            }
//            if (c == '6') {
//                number++;
//            }
//            if (c == '7') {
//                number++;
//            }
//            if (c == '8') {
//                number++;
//            }
//            if (c == '9') {
//                number++;
//            }
//            if (c == '0') {
//                number++;
//            }
//
//        }
//        System.out.println(number);
//
//    }
    }
