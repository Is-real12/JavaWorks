import java.util.*;

public class BeforeTikiTAKA {
    public enum testFirst{EMPTY}
    public static void main(String[] args) {
        String[][] tiki = new String[3][3];
        for (int i = 0; i < tiki.length; i++) {
            for (int j = 0; j < tiki.length; j++) {
                tiki[i][j] = String.valueOf(testFirst.EMPTY);
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter X or O ");
        String tin = scanner.next();
        forNowInoGetName(tiki, tin);


    }

    public static void forNowInoGetName(String[][] tiki, String tin){

        Scanner scanner = new Scanner(System.in);
        boolean fearWoman = true;
        while (fearWoman){

//            !tin.equals("x") || tin.equals("o") || tin.equals("X") || tin.equals("O")

            try {
                System.out.print("Enter where to put it: ");

                int id = scanner.nextInt();

                if (id > 9) {
                    System.out.println("Kindly put better number: ");
                } else {
                    if (id < 0) {
                        System.out.println("U neva see anything: ");
                    }
//        int firstId = 0;
//        int secondId = 0;
//        if (id <= tiki[0].length){
//            firstId = 0;
//        }else if (id > tiki[0].length && id <= tiki[1].length){
//            firstId = 1;
//        }else {
//            firstId = 2;
//        }

                    int count = 0;
                    for (int i = 0; i < tiki.length; i++) {
                        for (int j = 0; j < tiki.length; j++) {
                            count++;
                            if (count == id) {
                                tiki[i][j] = tin;
                                break;
                            }

                        }
                    }

                    for (int i = 0; i < tiki.length; i++) {
                        for (int j = 0; j < tiki.length; j++) {
                            System.out.printf("%-5s%s", tiki[i][j], " | ");
                        }
                        System.out.print("\n____________________________");
                        System.out.println();
                    }

                    for (int i = 0; i < tiki.length; i++) {
                        for (int j = 0; j < tiki.length; j++) {
                            if (j == 2) {
                                if (Objects.equals(tiki[j][i], "x") || Objects.equals(tiki[j][i], "o")) {
                                    System.out.println("You Win");
                                    fearWoman = false;

                                } else if (!Objects.equals(tiki[i][j], "EMPTY")) {
                                    System.out.println("Games a draw");
                                }

                            }
                        }
                    }
                }

//            tiki[firstId][id] = tin;
//        System.out.println(firstId);
//        for (int i = 0; i < tiki.length; i++) {
//            for (int j = 0; j < tiki.length; j++) {
//                System.out.print(tiki[i][j]+"   ");
//            }
//            System.out.println();
            }catch (InputMismatchException in){
                System.out.println("I Gat u");
                fearWoman = false;
                forNowInoGetName(tiki, tin);
            }
        }
//        }while (!tin.equals("x") || tin.equals("o") || tin.equals("X") || tin.equals("O"));
//        forNowInoGetName(tiki, tin);
    }
}
