package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void start() {
        var userName = Cli.greetUser();
        var streak = 0;
        while (streak < 3) {
            var randomNumber = (int) ((Math.random() * (100 - 1)) + 1);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.next().toLowerCase();

            String correctAnswer = randomNumber % 2 == 0 ? "yes" : "no";

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                streak++;
            }
            else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " +  userName + "!");
    }
}
