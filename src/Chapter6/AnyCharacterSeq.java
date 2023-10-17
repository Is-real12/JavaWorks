package Chapter6;

public class AnyCharacterSeq {
    public static String Astheric(int input, char charact){
        String saving = "";

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                saving += charact;

            }
            saving += "\n";

        }
        return saving;
    }

    public static void main(String[] args) {
        System.out.println(Astheric(4, '$'));
    }
}
