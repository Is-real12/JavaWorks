package Chapter6;

public class IsMultiple {
    public static boolean isMultiple(int firstNum, int secondNum) {

boolean isTrue;
            int remainder = secondNum % firstNum;
            if (remainder == 0) {
               isTrue = true;
            } else {
               isTrue = false;
            }
            return isTrue;
        }
    }

