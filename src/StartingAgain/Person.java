package StartingAgain;

import java.util.ArrayList;

public class Person {
    private  ArrayList<Problem>  problem  = new ArrayList<>();
    Problem problems;
    public void setAddProblem(Problem addProblem){
        problem.add(addProblem);
    }

    public ArrayList<Problem> getAddProblem(){
        return problem;
    }

    public boolean solves(ProblemType solve){
        return problems.setSolve(true);
    }

    public  ArrayList<Problem> getUnsolveP(Problem type){
ArrayList<Problem> unso = problem;
        if (!solves(type.getProblemType())){
            for (Problem lool: problem) {
                unso.add(type);
            }
        }
        return unso;
    }

}
