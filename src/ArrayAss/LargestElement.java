package ArrayAss;

import java.util.Arrays;

public class LargestElement{

    public static int largester(int[] element){
        int largest = element[0];
        for (int i=0; i < element.length; i++){
            if(element [i] > largest){
                largest= element[i];
            }
        }
        return largest;
    }

        public static boolean reverseList(int[] pal, int[] targeted) {
            for (int i = pal.length - 1; i >= 0; i--) {
                for (int j = 0; j < targeted.length; j++) {
                    if(pal[i] == targeted[j]) return true;
                }
            }
            return  false;
        }

        public static boolean isElementInArray(int[] arr, int target) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return true;
                }
            }
            return false;
        }


        public static int[] odd_num (int[] arr){
        int list[] = new int[10];
            int[] oddNum = {};
            for (int i = 0; i < arr.length; i+=2) {
                list[i] = arr[i];
//                if (arr[i] % 2 == 0) {
//                    list[0] += arr[i];
//                    return new int[]{list[arr[i]] = arr[i]};
//                }

//            }
        }
            return list;





    }

    public static void main(String[] args) {
       System.out.println();
//        String name = new String("ade");
//        String names = "ade";
//
//        System.out.println(name.equals(names));
//
//
//        int[] my_list2 = {'a', 'b', 'c', 'd'}
//        int[] my_list = {1, 2, 3}
//
//       int[] sumz = new int[10];
////        sumz += my_list2[]
////        sumz += my_list2
////        sumz += my_list


    }
}















