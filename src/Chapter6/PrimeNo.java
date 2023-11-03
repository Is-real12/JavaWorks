package Chapter6;

public class PrimeNo {
    public static void main(String[] args) {
        System.out.println(is_Prime(11));
    }
    public static boolean is_Prime(int number){
        boolean prime = true;
        for (int i = 2; i < number; i++) {
        if (number % i == 0){
            prime = false;
        }

        }
        return prime;
    }
}
