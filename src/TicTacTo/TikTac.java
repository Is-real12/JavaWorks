package TicTacTo;

import java.util.InputMismatchException;
import java.util.Objects;

public class TikTac {
    private Empty empty ;
    private Empty[][] tiki = new Empty[3][3];
    public TikTac(){
        for (int i = 0; i < tiki.length; i++) {
            for (int j = 0; j < tiki.length; j++) {
                this.tiki[i][j] = Empty.EMPTY;
            }
        }
    }

    public boolean getEmpty(){
    for (int i = 0; i < tiki.length ; i++) {
        for (int j = 0; j < tiki.length; j++) {
            if (this.tiki[i][j].equals(Empty.EMPTY)){
                return true;
            }
        }
    }
        return false;
    }


    public void play(String x_or_O, int id) {
        if (x_or_O.equals("X") || x_or_O.equals("x")) {
            initialize(Empty.X, id);

        } else if (x_or_O.equals("O") || x_or_O.equals("o")) {
            initialize(Empty.O, id);
        } else if (id < 0) {
            throw new IllegalArgumentException("Number is lesser than Board: ");
        } else if (id > 9) {
            throw new IllegalArgumentException("Number is greater than Board");
        }else {
            throw new InputMismatchException("Please Enter Between X or O");
        }
    }

    public boolean gameRules(){
        boolean gamesR = false;
        for (int i = 0; i < tiki.length; i++) {
            for (int j = 0; j < tiki.length; j++) {
                if (j == 2) {
                    if (Objects.equals(tiki[j][i], Empty.X) || Objects.equals(tiki[j][i], Empty.O)) {
                       gamesR = true;
                    }

                }else if (!Objects.equals(tiki[i][j], Empty.EMPTY)){
                    gamesR = false;
                }
            }
        }
        return gamesR;
    }


    private void initialize(Empty x_o, int id){
        int count = 0;
        for (int i = 0; i < tiki.length; i++) {
            for (int j = 0; j < tiki.length; j++) {
                count++;
                if ((tiki[i][j]).equals(Empty.EMPTY)){
                    if (count == id) {
                        this.tiki[i][j] = x_o;
                        break;
                    }
                }else {
                    throw new IllegalArgumentException("Board Has Already Been Taken");
                }
            }
        }
    }

    public Empty[][] getTiki() {
        return tiki;
    }

    public String toString(){
        for (int i = 0; i < tiki.length; i++) {
            for (int j = 0; j < tiki.length; j++) {
                System.out.printf("%-5s%s", tiki[i][j], " | ");
            }
            System.out.print("\n____________________________");
            System.out.println();
        }
        return null;
    }

}
