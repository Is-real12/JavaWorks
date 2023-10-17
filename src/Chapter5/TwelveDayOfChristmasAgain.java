package Chaptter5;

public class TwelveDayOfChristmasAgain {
    public static void main(String[] args) {
        for (int dayString = 1; dayString <= 12; dayString++) {
            switch (dayString){
                case 1:
                    System.out.println("first");
                    break;
                case 2:
                    System.out.println("second");
                    break;

                case 3:
                    System.out.println("third");
                    break;

                case 4:
                    System.out.println("fourth");
                    break;
                case 5:
                    System.out.println("five");
                    break;

                case 6:
                    System.out.println("six");
                    break;

                case 7:
                    System.out.println("seven");
                    break;

                case 8:
                    System.out.println("eight");
                    break;

                case 9:
                    System.out.println("ninth");
                    break;

                case 10:
                    System.out.println("tenth");
                    break;

                case 11:
                    System.out.println("Eleventh");
                    break;

                case 12:
                    System.out.println("twelve");
                    break;


            }
            System.out.println("on the "+dayString+" day of christmas my true love sent to me  ");

            for (int second = dayString; second < 12; second--) {
                switch (second) {
                    case 0:
                        System.out.println("a petridge in a pear tree");
                        break;

                    case 1:
                        System.out.println("Two Turtle doves ");
                        break;

                    case 2:
                        System.out.println("three fresh hen");
                        break;


                    case 3:
                        System.out.println("four broken mad");

                    case 4:
                        System.out.println("two studip dove ");
                        break;

                    case 5:
                        System.out.println("three dum hen");
                        break;


                    case 6:
                        System.out.println("four broken mad");
                        break;

                    case 7:
                        System.out.println("two studip dove ");
                        break;

                    case 8:
                        System.out.println("three dum hen");
                        break;


                    case 9:
                        System.out.println("four broken mad");
                        break;
                    case 10:
                        System.out.println("two studip dove ");
                        break;

                    case 11:
                        System.out.println("four broken mad");
                        break;
                    case 12:
                        System.out.println("two studip dove ");
                        break;
                }
            }

            System.out.println();
        }

    }
}

