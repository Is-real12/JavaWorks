package WeekEndSnacks;

import java.util.ArrayList;

public class DecToBi {
    public static void main(String[] args) {
        System.out.println(dec_bi(43));
        System.out.println(bi_dec(101011));
    }
    public static int bi_dec(int binary){
        int count = 1;
        int index = 0;
        ArrayList <Integer> my_Array = new ArrayList<>();
        int sum =0;

        while (binary > 0){
            int remainder = binary % 10;
            my_Array.add(count);
            count*=2;
            index +=1;
            sum+= my_Array.get(index-1) * remainder;
            binary/=10;
        }
        return sum;
    }
    public static String dec_bi(int dec){
        ArrayList <Integer> remainders = new ArrayList<>();
        int result = 0;
        while (dec > 0){
            int remainder = dec %2;
            dec/=2;
            remainders.add(remainder);
        }  StringBuilder str = new StringBuilder();
        for (int i = remainders.size(); i >0; i--) {

            str.append(remainders.get(i-1));

        }
        return str.toString();

    }
}
