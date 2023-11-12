package StartingAgain;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();

        Problem problem = new Problem("Enjoyimg life", ProblemType.EDUCATION);
        Problem problem2 = new Problem("Thank you jesus for life", ProblemType.EDUCATION);

        person.setAddProblem(problem);
        person.setAddProblem(problem2);
//        person.solves(problem);
//        ArrayList<Reflection.Problem> unsolvedProblems = person.getUnsolveP();
//        for (Problem person1: person.getUnsolveP(person.getUnsolveP())) {
//
//        }
//
    }
}
