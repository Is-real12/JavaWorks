
import java.util.Scanner;

public class Divisible{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("enter an integer");

int number = scanner.nextInt();


if(number%3 == 0){
System.out.printf("%d is divisible by 3 %n"  , number);
}

else if(number%3 != 0){
System.out.printf("%d is not divisible by 3 %n"  , number);
}



}
}