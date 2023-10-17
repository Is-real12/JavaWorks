import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        String[] names =  new String[5];
//
//        names[0] = "Maisam";
//        names[1] = "joy ";
//        names[2] = "ngozi";
//
//
//
//        names[0] = "FullPpackage"; System.out.println(names[0]);

        String[] fatAssBab = {"Ngozi ", "Wonderfull ", "joyous ", "Beutifull"};
        int[] fatAssBabNumbers = {829648724, 8263784, 28946873, 9846623};

        for (int i = 0; i < fatAssBab.length; i++) {

            System.out.print(fatAssBab[i]);
        }
        System.out.println("\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name: ");

        String name = scanner.next();
        for (int i = 0; i < fatAssBab.length; i++) {

            if(name.equals(fatAssBab[i])){
                System.out.println(fatAssBabNumbers[i]);
            }

        }
    }
}











