package Chapter6;

public class PerfectNumber {
    public static void main(String[] args) {
        int perfect = 1000;

        for (int Number = 1; Number <=1000 ; Number++) {
            int sum = 0;
            for (int j =1; j <= Number/2; j++) {

                if (Number % j ==0){
                    sum+=j;
//                    System.out.printf("%d\t",sum);
            }
                if (sum == Number){
//                    System.out.println("We found it");
                }

                }
            for (int j = 2; j <Number/2 ; j++) {
                if (Number % j==0) {
                    System.out.println(Number);
                }


            }

        }

    }
}
