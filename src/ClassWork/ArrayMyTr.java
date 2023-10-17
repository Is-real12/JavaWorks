package ClassWork;

//import TodayTask.PrintScore;

public class ArrayMyTr {
    public static void main(String[] args) {
        char [] []  grade = {{'x', 'o', 'x'},  {'x', 'x', 'o'}, {'o','x','x'}};
        char line = '|';
        for(int i = 0; i<grade.length; i++){
            for (int j = 0; j < grade[i].length; j++) {
                System.out.print(grade[i][j]+ line);

            }
            System.out.println();
        }

    }
}
