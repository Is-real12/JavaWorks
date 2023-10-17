package MrChiWeekEndSnack.Functions;

public class IsPlindrome {
    public static boolean isPalindrome(int number) {


        int temp = number;
        int reversedNumber = 0;

        while (temp != 0) {
            int remainder = temp % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            temp = temp / 10;
        }

        return number == reversedNumber;




        //thank you lord finally got it
    }

}
