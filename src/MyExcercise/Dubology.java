package MyGivenExcercise;

public class Dubology {
    public static void main(String[] args) {
printBox(5);

    }

    public static void  printBox(int numberOfStars) {
        for (int i = 0; i < numberOfStars; i++) {
            printStars(numberOfStars);
        }}

    public static void printStars(int numberOfStars){
            for (int i = 0; i < numberOfStars; i++){
                System.out.print("* ");

            }
            System.out.println();
        }

        public static  void printTwoSpacecedStars(){
            System.out.println("*           *");
        }

}
