package Chapter6;

public class DivisibleBy5 {
    public static boolean Divisible5(int... input){
        int i = 0;
        boolean istrue = false;
        while (input.length-1 > 0){

            int remainder = input[i] % 10;

            input[i]/=10;
            if (remainder % 5 == 0) {
                istrue = true;
            }else {
                istrue = false;
            }
                    i++;
        }
        return istrue;
    }

    public static void main(String[] args) {
        System.out.println(Divisible5(5, 6, 2, 3, 8));
    }
}
