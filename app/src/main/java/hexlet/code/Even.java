package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var streak = 0;
        while (streak < 3) {
            var randomNumber = (int) ((Math.random() * (100 - 1)) + 1);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            String correctAnswer = randomNumber % 2 == 0 ? "yes" : "no";

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                streak++;
            }
            else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'");
                System.out.println("Let's try again, " + userName + "!");
                streak = 0;
            }
        }
        System.out.println("Congratulations, " +  userName + "!");
    }
}
