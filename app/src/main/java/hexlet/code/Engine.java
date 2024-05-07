package hexlet.code;

import java.util.Scanner;
import static java.lang.System.out;

public class Engine {
    public static final int NUMBER_OF_ROUNDS = 3;
    public static final int MIN_RANDOM_NUMBER = 1;
    public static final int MAX_RANDOM_NUMBER = 100;
    public static void start(String question, String[][] rounds) {
        var userName = Cli.greetUser();
        out.println(question);
        var streak = 0;
        var currRound = 0;
        while (streak < NUMBER_OF_ROUNDS) {
            out.println("Question: " + rounds[currRound][0]);
            out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            var userAnswer = scanner.next().toLowerCase();
            var correctAnswer = rounds[currRound][1];

            if (userAnswer.equals(correctAnswer)) {
                out.println("Correct!");
                streak++;
                currRound++;
            } else {
                out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'");
                out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        out.println("Congratulations, " +  userName + "!");
    }
}
