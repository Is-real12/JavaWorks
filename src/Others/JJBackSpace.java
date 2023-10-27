package Others;

public class JJBackSpace {
    public static void main(String[] args) {
        String LOL = "P#ADC";
        char[] charArray = LOL.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char lister = charArray[i];
            if ('#' != lister){
                lister = charArray[i];
                System.out.print(lister);
            }

        }

    }
}
