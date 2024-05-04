package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void start() {
        var userName = Cli.greetUser();
        var streak = 0;
        while (streak < 3) {
            var firstRandomNumber = (int) ((Math.random() * (100 - 1)) + 1);
            var secondRandomNumber = (int) ((Math.random() * (100 - 1)) + 1);
            String[] operations = {"+", "-", "*"};
            var rnd = new Random().nextInt(operations.length);
            var randomOperation = operations[rnd];
            var operationString = firstRandomNumber + " " + randomOperation + " " + secondRandomNumber;
            System.out.println("What is the result of the expression?");
            System.out.println("Question: " + operationString);
            System.out.print("Your answer: ");
            var resultOfOperation = switch (randomOperation) {
                case "+" -> firstRandomNumber + secondRandomNumber;
                case "-" -> firstRandomNumber - secondRandomNumber;
                case "*" -> firstRandomNumber * secondRandomNumber;
                default -> 0;
            };
            var correctAnswer = String.valueOf(resultOfOperation);
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.next().toLowerCase();
            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                streak++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " +  userName + "!");
    }
}
