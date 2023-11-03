package Chapter7;

public class VariableLenghtArg {
    public static double VLA(int... value){
        int sum = 0;
        for (int i = 0; i < value.length; i++) {
            sum+=value[i];
        }
        return (double) sum / value.length;
    }


}
