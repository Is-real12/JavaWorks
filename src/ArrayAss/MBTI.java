package ArrayAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
public class MBTI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Atimes = 0;
        int Btimes = 0;
        ArrayList <String> joinA = new ArrayList<>();
        String[][] allQestion = new String[][]{
                {"A. expend energy, enjoy groups"}, {"B. conserve energy, enjoy one-on-one"},
                {"A. Interpret literally"}, {"B. look for meaning and possibilities"},
                {"A. logical, thinking, questioning"}, {"B. empathetic, feeling, accommodating"},
                {"A. organized, orderly"}, {"B flexible, adaptable"},
                {"A. more outgoing, think out loud"}, {"B. more reserved, think to yourself"},
                {"A. practical, realistic, experiential"}, {"B. imaginative, innovative, theoretical"},
                {"A. candid, straight forward, frank"}, {"B. tactful, kind, encouraging"},
                {"A. plan, schedule"}, {"B. unplanned, spontaneous"},
                {"A. seek many tasks, public activities, interaction with others"}, {"B. seek private, solid"},
                {"A. standard, usual, conventional"}, {"B. different, novel, unique"},
                {"A. firm, tend to criticize, hold the line"}, {"B. gentle, tend to appreciate, conciliate"},
                {"A. regulated, structured"}, {"B. easy-going, live and let live"},
                {"A. external, communicative}, express yourself"}, {"B. internal, reticent, keep to yourself"},
                {"A. focus on here-and-now"}, {"B. look to the future, global perspective, big picture"},
                {"A. tough-minded, just"}, {"B. tender-hearted, merciful"},
                {"A. preparation, plan ahead"}, {"B. go with the flow, adapt as you go"},
                {"A. active, initiate"}, {"B. reflective, deliberate"},
                {"A. facts, things, what is"}, {"B. ideas, dreams, what could be"}, {"philosophical"},
                {"A. matter of fact, issue-oriented"}, {"B. sensitive, people-oriented, compassionate"},
                {"A. control, govern"}, {"B. latitude, freedom"}};
        System.out.print("Enter your name: ");
        String name = scanner.next();
        for (int i = 0; i < allQestion.length; i++) {
                System.out.printf("%-60s", allQestion[i]);
                if (i %2==1 ) {System.out.println();
                    System.out.print("Enter a choice: ");
                    String choice = scanner.next();
                    for (int j = 0; j < 10000; ) {
                        if (choice.equals("A") || choice.equals("B")) {
                            break;
                        } else {
                            System.out.print("Kindly Enter between A and B. Enter a choice: ");
                            choice = scanner.next();
                            j++;
                        }
                    }
                        switch (choice) {
                            case "A":
                                Atimes += 1;
                                joinA.add(Arrays.toString(allQestion[i]));
                                break;
                            case "B":
                                Btimes += 1;
                                joinA.add(Arrays.toString(allQestion[i]));
                                break;
                            default:
                                System.out.println("My response should be between A and B");
                        }
                    }
                if (i == allQestion.length-1){
                    System.out.println("\n" +
                            "\n" +
                            "Extroverted E Vs Introverted I:Questions 1, 5, 9, 13, 17\n" +
                            "Sensing S Vs Intuitive N:\n" +
                            "Questions 2, 6, 10, 14, 18\n" +
                            "Thinking T Vs Feeling F:\n" +
                            "Questions 3, 7, 11, 15, 19\n" +
                            "4, 8, 12, 16, 20\n" +
                            "Judging J Vs Perceptive P:\n" +
                            "Questions\n" +
                            "semicolon\n" +
                            "Property of Semcolon Village Limited.All rights reserved by \n");
                }
                    ;}
        for (int i = 0; i < joinA.size(); i++) {
            System.out.println(joinA.get(i));
            if (i%4==0){
                System.out.println("\nNumber of A Selected "+Atimes);
                System.out.println("Number of B Selected "+Btimes);
                System.out.println("\n");
            }
        }
        System.out.println("""
                    NE
                    Healer
                    The Thought ful Idealist (MBTI)
                    The Mediator (16Personalities)
                    The INFP Personality Type
                    INFPs are imaginative idealists, guided by their own core values and beliefs.
                    TO a Healer, possibilities are paramount; the realism of the moment is only of passing concern .
                    They see potential for a better future, and pursue truth and meaning with their own individual flair
                    INFPs are sensitive, caring, and compassionate, and are deeply concerned with the personal growth of
                    themselves and others. Individualistic and nonjudgmental, INFPs believe that each person must find their
                    own path. They enjoy spending time exploring their own ideas and values, and are gently encouraging to
                    others to do the same. INFPS are creative and often artistic; they enjoy finding new outlets for self-expression.
                    What does INFP stand for?
                    INFP is one of the sixteen personality types created by Katharine Briggs and
                    Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI®). INFP stands
                    for Introversion, iNtuition, Feeling, and Perceiving, which are four core personality
                    traits based on the work of psychologist C.G. Jung.
                    Each of the four letters of the INFP code signifies a key personality trait of this type.
                    INFPs are energized by time alone (Introverted), focuS on ideas and concepts rather than facts and details (iNtuitive),
                     make decisions based on feelings and values (Feeling), and prefer to be spontaneoUs and flexible rather than planned and organized (Perceiving)
                                """);
    }
}
