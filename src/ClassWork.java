import java.util.ArrayList;
import java.util.Arrays;
//            if(originalArray[i] < originalArray[i+1]) {
//                int temp = originalArray[i];
//                originalArray[i] = originalArray[i + 1];
//                originalArray[i + 1] = temp;
public class ClassWork {
    public static void main(String[] args) {
        int[] originalArray = new int[]{42, 18, 41, 22, 15, 12};
        int length = originalArray.length;
        ArrayList<Integer> newArray = new ArrayList<>();
        ArrayList<Integer> newArray1 = new ArrayList<>();

        for (int i = 0; i < length  ; i++) {

                if(i% 2 == 1){
                    newArray.add(originalArray[i]);
                }
            if(i% 2 == 0){
                newArray1.add(originalArray[i]);
            }


            }
//        System.out.println(newArray);
//        System.out.println(newArray1);
int index = 0;
        for (int i = 0; i < originalArray.length; i++) {

//            if (i%2 == 1){
//                    originalArray[i] = newArray1.get(index);
//
//            }
            
            System.out.println(originalArray[i%2 ]);
        }

    }
}