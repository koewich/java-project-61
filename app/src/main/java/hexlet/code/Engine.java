package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBER_OF_ROUNDS = 3;
    public static final int MIN_RANDOM_NUMBER = 1;
    public static final int MAX_RANDOM_NUMBER = 100;
    public static void start(String question, String[][] rounds) {
        var userName = Cli.greetUser();
        System.out.println(question);
        var streak = 0;
        var currentRound = 0;
        while (streak < NUMBER_OF_ROUNDS) {
            System.out.println("Question: " + rounds[currentRound][0]);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            var userAnswer = scanner.next().toLowerCase();

            if (userAnswer.equals(rounds[currentRound][1])) {
                System.out.println("Correct!");
                streak++;
                currentRound++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + rounds[currentRound][1] + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " +  userName + "!");
    }
}