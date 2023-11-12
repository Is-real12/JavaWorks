package Reflection;

import java.util.ArrayList;
import java.util.Arrays;

public class Testing {
    public static void main(String[] args) {

                Person person = new Person();

                Problem problem1 = new Problem("Financial issue", ProblemsType.FINANCIAL);
                Problem problem2 = new Problem("Spiritual struggle", ProblemsType.SPIRITUAL);

                person.addProblem(problem1);
                person.addProblem(problem2);
                person.solve(problem1);

                ArrayList<Problem> unsolvedProblems = person.getUnsolvedProblems();
                for (Problem problem : unsolvedProblems) {
                    System.out.println("Unsolved problem: " + problem.getName());
                }
            }
        }
