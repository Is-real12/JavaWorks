package StartingAgain;

public class Problem {
    private String name;
    private ProblemType problemType;
    private boolean isSolve;

    public Problem(String name, ProblemType problemType) {
        this.name = name;
        this.problemType = problemType;
    }



    public String getName() {
        return name;
    }

    public ProblemType getProblemType() {
        return problemType;
    }

    public boolean setSolve(boolean solve){
        return true;
    }
    public boolean getIsSolve() {
        return isSolve;
    }
}
