package MrChiWeekEndSnack;

import java.util.Scanner;



public class Petridge {

    public static void main(String[] args) {
        for (int day = 1; day <= 12; day++) {
            String dayString;

            switch (day) {
                case 1:
                    dayString = "first";
                    break;
                case 2:
                    dayString = "second";
                    break;
                case 3:
                    dayString = "third";
                    break;
                case 4:
                    dayString = "fourth";
                    break;
                case 5:
                    dayString = "fifth";
                    break;
                case 6:
                    dayString = "sixth";
                    break;
                case 7:
                    dayString = "seventh";
                    break;
                case 8:
                    dayString = "eighth";
                    break;
                case 9:
                    dayString = "ninth";
                    break;
                case 10:
                    dayString = "tenth";
                    break;
                case 11:
                    dayString = "eleventh";
                    break;
                case 12:
                    dayString = "twelfth";
                    break;
                default:
                    dayString = "";
            }

            System.out.println("On the " + dayString + " day of Christmas,");
            System.out.println("My true love gave to me:");


            for (int num = day; num > 0; num--) {
                if (num == 1 && day > 1) {
                    System.out.println("And a partridge in a pear tree.");
                } else {
                    switch (num) {
                        case 1:
                            System.out.println("A partridge in a pear tree.");
                            break;
                        case 2:
                            System.out.println("Two turtle doves, and");
                            break;
                        case 3:
                            System.out.println("Three French hens,");
                            break;
                        case 4:
                            System.out.println("Four calling birds,");
                            break;
                        case 5:
                            System.out.println("Five golden rings,");
                            break;
                        case 6:
                            System.out.println("Six geese a-laying,");
                            break;
                        case 7:
                            System.out.println("Seven swans a-swimming,");
                            break;
                        case 8:
                            System.out.println("Eight maids a-milking,");
                            break;
                        case 9:
                            System.out.println("Nine ladies dancing,");
                            break;
                        case 10:
                            System.out.println("Ten lords a-leaping,");
                            break;
                        case 11:
                            System.out.println("Eleven pipers piping,");
                            break;
                        case 12:
                            System.out.println("Twelve drummers drumming,");
                            break;
                    }
                }
            }
        }
    }


                }
