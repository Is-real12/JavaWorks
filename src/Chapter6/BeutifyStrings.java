package Chapter6;
//
public class BeutifyStrings {
//    public static void main(String[] args) {
//        System.out.println(terminate("hello world"));
//    }

    public static String terminate(String words) {
        char s;
        StringBuilder modified = new StringBuilder(words);

        for (int i = 0; i < words.length(); i++) {



        }
        int theLenght = modified.length();
        modified.insert(theLenght, '.');


        return modified.toString();
    }

//    public static String capitalize(String words) {

    public static void main(String[] args) {

        String words = "hell world";
        char[] cap = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] small = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        StringBuilder modified = new StringBuilder(words);
        char wor = words.charAt(0);

        for (int i = 0; i < cap.length; i++) {
            if (wor == small[i]) {
               wor = cap[i];
            }

        }
        for (int i = 0; i < words.length(); i++) {
            char forPrint = words.charAt(i);

        }

        System.out.println(wor);
    }
//    }
//    public static String Astheric(int input, char charact) {
//        StringBuilder modified = new StringBuilder(original);
//        modified.insert(position, ch);
//        return modified.toString();
////    }
}