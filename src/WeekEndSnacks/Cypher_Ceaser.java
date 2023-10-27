package WeekEndSnacks;

public class Cypher_Ceaser {
    public static void main(String[] args) {
        System.out.println(decypt("widedeepweb.hidden.wiki.onionsite/hackerstir.ord",14));

    }

    public static StringBuilder decypt(String words, int shift){
        char[] wordSep = words.toCharArray();
        StringBuilder join = new StringBuilder();
        for (int i = 0; i < wordSep.length; i++) {
            char originalChar = wordSep[i];

                    if (originalChar >= 'A' && originalChar <= 'Z' || originalChar >= 'a' && originalChar <= 'z') {
            wordSep[i] = (char) (originalChar + shift);
            join.append(wordSep[i]);
                    }
        }
        return join;
    }

    public static StringBuilder encypt(String words, int shift){
        char[] wordSep = words.toCharArray();
        StringBuilder join = new StringBuilder();
        for (int i = 0; i < wordSep.length; i++) {
            char originalChar = wordSep[i];

//                    if (originalChar >= 'A' && originalChar <= 'Z' || originalChar >= 'a' && originalChar <= 'z') {
            wordSep[i] = (char) (originalChar - shift);
            join.append(wordSep[i]);
                    }
//        }
        return join;
    }
}
