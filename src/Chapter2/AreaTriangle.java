import java.util.Scanner;

public class AreaTriangle {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("enetr first point of a triangle x1");
double X1 = scanner.nextDouble();
System.out.println("enetr first point of a triangle y1");
double Y1 = scanner.nextDouble();

System.out.println("enetr second point of a triangle x2");
double X2 = scanner.nextDouble();
System.out.println("enetr second point of a triangle y2");
double Y2 = scanner.nextDouble();

System.out.println("enetr third point of a triangle x3");
double X3 = scanner.nextDouble();
System.out.println("enetr third point of a triangle y3");
double Y3 = scanner.nextDouble();

double area = (X1 + Y1 + X2 + Y2 + X3 + Y3) /2;
double sum = (area * 2);

System.out.printf("your answer is %n" + sum);









}
}