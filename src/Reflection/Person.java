package Reflection;
import java.util.ArrayList;

public class Person {
    private ArrayList<Problem> problems = new ArrayList<>();

    public void addProblem(Problem problem) {
        problems.add(problem);
    }

    public void solve(Problem problem) {
        problem.setSolved(true);
    }


    public ArrayList<Problem> getUnsolvedProblems() {
        ArrayList<Problem> unsolvedProblems = new ArrayList<>();
        for (Problem problem : problems) {
            if (!problem.isSolved()) {
                unsolvedProblems.add(problem);
            }
        }
        return unsolvedProblems;
    }
}
