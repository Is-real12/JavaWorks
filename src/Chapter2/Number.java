import java.util.Scanner;

public class Number{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter your five digit number: " );

int number = scanner.nextInt();

int num1 = number / 10000 ;
int num2 = number / 1000 % 10;
int num3 = number/ 100 % 10;
int num4 = number / 10 % 10;
int num5 = number % 10;



System.out.printf( "%d\t%d\t%d\t%d\t%d\n ", num1  ,  num2  , num3  , num4 , num5);



}

}
