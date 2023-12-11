package TicTacTo;

import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.Scanner;
import static TicTacTo.TicTacToe.*;

public class TicTacToeMain {

public static TicTacToe tic = new TicTacToe();
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        String[] str = new String[2];
        for (int i = 0; i < 2; i++) {
            System.out.print("Choose your Avatar "+(i+1)+": ");
            String avatar = scanner.next();
           str[i] = avatar;
        }

        tic.toString();
        System.out.println();
        playGame(str);
    }



    public static void playGame(String[] ava){
        Scanner scanner = new Scanner(System.in);
        boolean fearWoman = true;
        int index = 0;
        while (fearWoman) {
            String c = ava[index];
            System.out.print("Where do you want to play in or -1 to stop: ");
            int whereto = scanner.nextInt();
            tic.play(c, whereto);
            System.out.println(tic.toString());
            if (whereto == -1) fearWoman = false;

            index++;

            if (index == 2) break;

            if (tic.checkGameResult().equalsIgnoreCase("X") || tic.checkGameResult().equalsIgnoreCase("O")) {
                System.out.println(tic.checkGameResult() + " Wins yipee");
                System.exit(3);
            } else if (tic.checkGameResult().equalsIgnoreCase("Draw")) {
                System.out.println("The game is a  draw");
                System.exit(3);
            }


        }
        playGame(ava);
//        System.out.println();

    }
}
