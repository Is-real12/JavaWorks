package Chapter6;

public class ForLeap {

        public static boolean isLeapYear(int year) {
            boolean isLeap;

            if ((year % 4 == 0) && (year % 100 != 0 )) {
                isLeap = true;
            } else {
               isLeap = false;
            }

            return isLeap;
        }

        public static void main(String[] args) {
            int year = 20000;
            System.out.println(isLeapYear(year));


        }
    }


