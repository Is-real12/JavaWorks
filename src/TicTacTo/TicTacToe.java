package TicTacTo;

import java.util.InputMismatchException;
import java.util.Objects;

public class TicTacToe {
    private final Empty[][] tiki = new Empty[3][3];

    public TicTacToe() {
        for (int i = 0; i < tiki.length; i++) {
            for (int j = 0; j < tiki[i].length; j++) {
                this.tiki[i][j] = Empty.EMPTY;
            }
        }
    }

    public boolean getEmpty() {
        for (Empty[] row : tiki) {
            for (Empty cell : row) {
                if (cell == Empty.EMPTY) {
                    return true;
                }
            }
        }
        return false;
    }

    public void play(String x_o, int id) {
        if (id < 1 || id > 9) {
            throw new IllegalArgumentException("Invalid cell number. Choose a number between 1 and 9 rubbbbi.");
        }

        int row = (id - 1) / 3;
        int col = (id - 1) % 3;

        if (tiki[row][col] != Empty.EMPTY) {
            throw new IllegalArgumentException("Cell " + id + " is already taken.");
        }

        Empty secX_O;
        if (Objects.equals(x_o, "X") || Objects.equals(x_o, "x")) {
            secX_O = Empty.X;
        } else if (Objects.equals(x_o, "O") || Objects.equals(x_o, "o")) {
            secX_O = Empty.O;
        } else {
            throw new InputMismatchException("Please Enter X or O");
        }
        tiki[row][col] = secX_O;

    }

    public String checkGameResult() {

        for (int i = 0; i < 3; i++) {
            if (tiki[i][0] != Empty.EMPTY && tiki[i][0] == tiki[i][1] && tiki[i][1] == tiki[i][2]) {
                return (tiki[i][0] == Empty.X) ? "X" : "O";
            }
        }



        for (int i = 0; i < 3; i++) {
            if (tiki[0][i] != Empty.EMPTY && tiki[0][i] == tiki[1][i] && tiki[1][i] == tiki[2][i]) {
                return (tiki[0][i] == Empty.X) ? "X" : "O";
            }
        }


        if (tiki[0][0] != Empty.EMPTY && tiki[0][0] == tiki[1][1] && tiki[1][1] == tiki[2][2]) {
            return (tiki[0][0] == Empty.X) ? "X" : "O";
        }
        if (tiki[0][2] != Empty.EMPTY && tiki[0][2] == tiki[1][1] && tiki[1][1] == tiki[2][0]) {
            return (tiki[0][2] == Empty.X) ? "X" : "O";
        }

        for (Empty[] row : tiki) {
            for (Empty cell : row) {
                if (cell == Empty.EMPTY) {
                    return "";
                }
            }
        }
        for (int i = 0; i < tiki.length ; i++) {
            for (int j = 0; j < tiki.length; j++) {
                if (!tiki[i][j].equals(Empty.EMPTY)) {
                    return "Draw";
                }
            }
        }
       return "";
    }



    public Empty[][] getTiki() {
        return tiki;
    }

    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.play("O", 1);
        ticTacToe.play("O", 5);
        ticTacToe.play("O", 9);

        System.out.println(ticTacToe.checkGameResult());
    }

    public String toString() {
        System.out.println();
        for (Empty[] row : tiki) {
            for (Empty cell : row) {
                System.out.printf("%-5s%s",cell , " | ");
            }
            System.out.print("\n____________________________");
            System.out.println();
        }
        return "";
    }
}
