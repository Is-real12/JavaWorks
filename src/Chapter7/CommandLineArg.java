package Chapter7;

import java.util.Arrays;

public class CommandLineArg {
    public static void main(String[] args) {
        boolean thereAreArguementBeignPassedIn = false;
int maximum = 0;
int sum  = 0;
int minimum = Integer.parseInt(args[0]);
        for (int i = 0; i < args.length; i++) {
            int[] parse = new int[]{Integer.parseInt(args[i])};
            for (int j = 0; j <parse.length; j++) {
            sum+=parse[j];
                if (parse[j] > maximum){
                    maximum = parse[j];
                }
                if (parse[j] < maximum){
                    minimum = parse[j];
                }
            }

        } double average = (double) sum / args.length;
        System.out.println(maximum);
        System.out.println(minimum);
        System.out.println(average);
    }
}
