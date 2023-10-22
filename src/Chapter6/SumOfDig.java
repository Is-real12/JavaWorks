package Chapter6;

public class SumOfDig {
    public static int sumOfDig(int input){
        int sum = 0;
        while (input > 0){
            int remainder = input%10;
            sum+=remainder;
            input/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDig(2344));
    }
}
