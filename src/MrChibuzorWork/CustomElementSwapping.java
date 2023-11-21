package MrChibuzorWork;

import java.text.DecimalFormat;
import java.util.Arrays;

public class CustomElementSwapping {
    public static void main(String[] args) {
        int[] newArray = {24, 18, 21, 22, 15};
        int oddDigit = 0;
        int evenDigit = 0;

        for (int i = 0; i < newArray.length - 1; i += 2) {

            int temp = newArray[i];
            newArray[i] = newArray[i + 1];
            newArray[i + 1] = temp;


        }
        System.out.println(Arrays.toString(newArray));
    }
}
