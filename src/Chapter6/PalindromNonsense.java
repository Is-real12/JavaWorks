package Chapter6;

public class PalindromNonsense {
  public  static String palindromMethod(int num){
     String numbers = "";
     while( num > 0){
        numbers += num % 10+" ";
         num /=10;

     }
     return numbers;
  }

    public static void main(String[] args) {
        System.out.println(palindromMethod(43234));
    }
}
