package Others;

public class PatternLoops {
    public static void main(String[] args) {
        int number = 5;
        for (int count = 0; count <=number-1; count++) {
            for (int shape = 0; shape <= count; shape++) {
                System.out.print("*");
            }

            System.out.println();
        }


        for (int count = 0; count <=number; count++) {

        for (int k = count; k <= 5; k++) {
            System.out.print("*");

        }
        System.out.println();
    }
    }
}
