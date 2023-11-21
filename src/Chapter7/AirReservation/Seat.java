package Chapter7.AirReservation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class Seat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        Random random = new Random();

        int seatSelector = 0;

        boolean[] booleans = new boolean[10];
        ArrayList<Integer> storingSeatGenerator = new ArrayList<>();
        boolean sittaken = true;
        int booleanslength = booleans.length;
        while(booleans.length>0){
            System.out.println("Please type 1 for first class\t of 2 for economy");
            int user_input = scanner.nextInt();
            switch (user_input) {
                case 1:
                    seatSelector = random.nextInt(1, 6);
                    storingSeatGenerator.add(seatSelector);
                    if (!booleans.equals(false)){
                        System.out.println("");
                        sittaken = false;
                    }
                    if (booleans[seatSelector] == true){
                        System.out.println("Sit "+seatSelector +" is Allready taken ");
                    }else {
                        booleanslength--;
                        booleans[seatSelector - 1] = true;
                        System.out.println("you are in seat "+seatSelector);

                    }



                    break;

                        case 2:
                            seatSelector = random.nextInt(6, 11);
                            if (booleans[seatSelector] == true){
                                System.out.println("Sit "+seatSelector +" is Allready taken ");
                                booleanslength++;
                            }else {
                                booleanslength--;
                                booleans[seatSelector - 1] = true;
                                System.out.println("you are in seat "+seatSelector);
                            }




            }



                    System.out.println(Arrays.toString(booleans)+"\n");


//        System.out.println(Arrays.toString(booleans));
            }
        }

    private static void randomGenerator(Random random) {
    }


}