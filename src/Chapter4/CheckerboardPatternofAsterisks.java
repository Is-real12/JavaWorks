package Chapter4;

public class CheckerboardPatternofAsterisks {
    public static void main(String[] args) {

        int size = 8;  // Change this value to adjust the size of the checkerboard
        int i = 0;

        while (i < size) {
            int j = 0;
            while (j < size) {
                if ((i + j) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                j++;
            }
            System.out.println();
            i++;

        }
    }

}