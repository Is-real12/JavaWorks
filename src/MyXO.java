import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Arrays;
import java.util.Scanner;

public class MyXO{
    
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        char[] array = new char[9];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Choose your avatar1;  X or O FOR PLAYER ONE");
            String ava = scanner.next();
            System.out.println("Choose your avatar1;  X or O FOR PLAYER ONE");
            String ava2 = scanner.next();
            char avatar1 = ava.charAt(0);
            char avatar2 = ava2.charAt(0);
            System.out.println("""
                            |             |
                    ________|_____________|_____
                            |             |
                            |             |
                    ________|_____________|______
                            |             |
                            |             |
                    """);
            System.out.println("Where would you like FOR PLAYER ONE; ");
            String atLength = scanner.next();
            array[Integer.parseInt(atLength)] = avatar1;
            System.out.printf("""
                       %s   |             |
                    ________|_____________|_____
                            |             |
                            |             |
                    ________|_____________|______
                            |             |
                            |             |
                    """, (Object) array);
            System.out.println("Where would you like FOR PLAYER ONE; ");
            String atLength2 = scanner.next();


            array[Integer.parseInt(atLength2)] = avatar2;

//            System.out.println(array);





        }
        System.out.print(Arrays.toString(array));
    }
}
