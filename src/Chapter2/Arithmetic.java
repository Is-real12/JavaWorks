import java.util.Scanner;

public class Arithmetic{

public static void main(String [] args){

System.out.println("enter any firstNumber of your choice");

Scanner scanner = new Scanner(System.in);

int firstNumber = scanner.nextInt();


System.out.println("enter any secondNumber of your choice");

int secondNumber = scanner.nextInt();

int firstSquare = firstNumber * firstNumber;

int secondSquare = secondNumber * secondNumber;

System.out.println("your First squared number is " + firstSquare);


System.out.println("your Second squared number is " + secondSquare);
System.out.println("");

int sum1 = firstSquare + secondSquare;

System.out.println("The sum of the squared number is  " + sum1);
System.out.println("");

System.out.println(firstSquare + " is different from " + secondSquare);
System.out.println("");


int sum2 = firstSquare - secondSquare;


System.out.println("the sum of the squared number is " + sum2);







}

}