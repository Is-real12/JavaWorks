package ClassWork;

public class FunctionNoInbuilt {

    public static  int withoutMultiplication(int firstMul, int secondMul){
        int result1 = 0;

        if (firstMul<0)
            firstMul = -firstMul;
        if (secondMul<0)
            secondMul = -secondMul;


        for (int i = secondMul; i >= 1; i--) {
            result1 += firstMul;
        }

//        for (int i = firstMul; i >= 1; i--) {
//
//            result1 += secondMul;
//        }
        return result1;
    }
}
