package Product.Others;

import java.util.Arrays;

public class Jonathan {

    public static void main(String[] args) {

//        System.out.println(Math.abs(27.0));
//        int divide = 0;
//        String[] rubbish = {"A", "M","C","W","I","T"};
//        for (int i = 0; i < rubbish.length; i++) {
//            divide = i /3;
//            System.out.println(rubbish[divide]);
//
//        }

        char[] originalArray = {'A', 'M', 'C', 'W', 'I', 'T'};


        char temp = originalArray[2];
        originalArray[2] = originalArray[3];
        originalArray[3] = temp;
//
        char[] resultArray = new char[0];
        System.out.println(new String(resultArray));
        resultArray = new char[4];
        for (int i = 0; i < 4; i++) {
            resultArray[i] = originalArray[i];
        }
        System.out.println(Arrays.toString(resultArray) +" ");
//
//        int [] list = {2, 4, 5, 7, 1, 8, 4};
//        int val = 4;
//        int[] newList = new int[5];
//
//        for (int i = 0; i < list.length; i++) {
//
//            if (list[i] != newList[i]){
//                list[i] = newList[i];
//
//            }
//System.out.print(Arrays.toString(list));
//
//        }


////        String[] character = {"A", "M",   "C", "W", "I", "T"};
//        String[] newList = new String[character.length];
//        int count = 0;
//        for (int i = 0; i < character.length; i++) {public class Main {
//    public static void main(String[] args) {
//        char[] originalArray = {'A', 'M', 'C', 'W', 'I', 'T'};
//
//        // Swap characters at index 2 and 3 without a function
//        char temp = originalArray[2];
//        originalArray[2] = originalArray[3];
//        originalArray[3] = temp;
//
//        // Remove characters from index 4 to the end
//        char[] resultArray = new char[4];
//        for (int i = 0; i < 4; i++) {
//            resultArray[i] = originalArray[i];
//        }
//
//        // Print the modified array
//        System.out.println(new String(resultArray));
//    }
//            if (i % 2 == 0) {
//                newList[i] = character[i];
//
//          }
////            else if (i % 2 != 0) {
////                newList[i] = character[i];
//
//            }
//
//        return newList;
//    }
//    public static void main(String[] args) {
//String[] element = {"A", "B", "C", "D ","e"};
//        System.out.println(Arrays.toString(shuffle(4, element)));

    }
}

