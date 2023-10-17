import java.util.Scanner;
public class  HelloWorld {
public static void main(String [] args){

Scanner scanner = new Scanner(System.in);

System.out.println("enter the radius and lenght of a cylinder");

double radius = scanner.nextDouble();

double lenght = scanner.nextDouble();

double π = 3.14159;

double area = radius * radius * π;

double volume = area * lenght; 


System.out.printf("The area is %.4f %n" ,area);

System.out.printf("The volume  is %.1f " ,volume);




}
}