package Chaptter5;

import java.util.Scanner;

public class Diamod {

    public static void main(String[] args) {
        Scanner stupid = new Scanner(System.in);
        System.out.println("Enter correct number oo i warn u: ");
        int n = stupid.nextInt();
        if(n > 19){
            System.out.println("not part of the code lower than 19");
        }else {
            if (n % 2 != 0) {
                for (int row = 0; row < n + 1; row++) {
                    for (int j = row; j < n; j++) {
                        System.out.print(" ");
                    }

                    for (int i = 0; i < row; i++) {
                        System.out.print("*");
                    }
                    for (int i = 0; i < row - 1; i++) {
                        System.out.print("*");
                    }


                    System.out.println();


                }

                for (int row = 0; row < n + 1; row++) {
                    for (int i = 0; i < row; i++) {
                        System.out.print(" ");

                    }
                    for (int i = row; i < n - 1; i++) {
                        System.out.print("*");
                    }
                    for (int i = row; i < n; i++) {
                        System.out.print("*");
                    }
                    System.out.println();

                }

            } else {
                System.out.println("if i slap you you will die as if you know the kind stress wey i use write this code");
            }

        }
    }
}

