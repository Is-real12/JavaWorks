package Chapter6;

public class PerfectNumbers {
    public static void main(String[] args) {
        System.out.println(is_factor(6));
    }
    public static boolean is_factor(int number){
    boolean is_fac = false;
   int the_sum = 0;
        for (int i = 1; i < number; i++) {
            for (int j = 1; j < number/2; j++) {
                if (i % j == 0) {
                    the_sum += j;
                }
                if (the_sum ==number){
                    is_fac = true;
                }
            }

        }
return is_fac;
    }
}
