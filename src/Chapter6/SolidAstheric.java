package Chapter6;

public class SolidAstheric {
    public static String Astheric(int input){
        String saving = "";
        String ash = "*";
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                saving += ash;

            }
            saving += "\n";

        }
        return saving;
    }

    public static void main(String[] args) {
        System.out.println(Astheric(4));
    }

}
