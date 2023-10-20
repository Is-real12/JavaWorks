package ArrayAss;

import java.util.Arrays;

public class FmClass {
    public static void main(String[] args) {
//        System.out.println(anagram("food","fdoo"));
        boolean isTrue = false;
        String stri = "amalai";
        StringBuilder news = new StringBuilder();
        StringBuilder reverse = new StringBuilder();

        String[] newArray = new String[stri.length()];
        for (int i = 0; i < stri.length(); i++) {
            char theSep = stri.charAt(i);
            newArray[i] = String.valueOf(theSep);
            news.append(theSep);
        }

//        System.out.println(Arrays.toString(newArray));
//        System.out.println(news);

        for (int i =  newArray.length-1; 0<= i; i--) {
reverse.append(newArray[i]);

        }
        for (int i = 0; i < reverse.length(); i++) {
            char revSep = reverse.charAt(i);
            for (int j = 0; j < news.length(); j++) {
                char origSep = news.charAt(j);
                if (revSep == origSep){
                    isTrue = true;
                }else {
                    isTrue = false;
                }
            }


        }
        System.out.println(isTrue);
//        System.out.println(reverse);
//        System.out.println(news);
    }

    public static boolean anagram(String first, String second) {
        boolean isTrue = false;
        for (int i = 0; i < second.length(); i++) {
            char secondSep = second.charAt(i);
            for (int j = 0; j < i; j++) {
                char firstSep = first.charAt(j);
                if (secondSep == firstSep && second.length() == first.length()){
                    isTrue = true;
                }else {
                    isTrue = false;
                }
            }
            }

        return isTrue;
    }
    public static boolean palindrome(String first) {
        boolean isTrue = false;
        StringBuilder news = new StringBuilder();
        StringBuilder reverse = new StringBuilder();

        String[] newArray = new String[first.length()];
        for (int i = 0; i < first.length(); i++) {
            char theSep = first.charAt(i);
            newArray[i] = String.valueOf(theSep);
            news.append(theSep);
        }
        for (int i =  newArray.length-1; 0<= i; i--) {
            reverse.append(newArray[i]);

        }
        for (int i = 0; i < reverse.length(); i++) {
            char revSep = reverse.charAt(i);
            for (int j = 0; j < news.length(); j++) {
                char origSep = news.charAt(j);
                if (revSep == origSep){
                    isTrue = true;
                }else {
                    isTrue = false;
                }
            }
        }
        return isTrue;
    }
//

}