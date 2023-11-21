package Exeption;
import org.junit.platform.commons.function.Try;
import javax.management.relation.InvalidRoleValueException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rubbish");
        int str = scanner.nextInt();
        if (str == 5) throw new InputMismatchException("Kindly be happy i did it ");
//        try{
//            int str = scanner.nextInt();
//        }catch (InputMismatchException ex){
//            System.out.println("Put a better arg ");
//
//        }
    }
}
