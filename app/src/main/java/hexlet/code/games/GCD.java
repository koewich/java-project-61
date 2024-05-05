package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.findGreatestCommonDivider;
import static hexlet.code.Utils.generateRandomNumber;

public class GCD {
    public static void start() {
        String[][] rounds = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (var i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            var firstRandomNumber = generateRandomNumber();
            var secondRandomNumber = generateRandomNumber();
            var questionString = firstRandomNumber + " " + secondRandomNumber;
            var correctAnswer = findGreatestCommonDivider(firstRandomNumber, secondRandomNumber);
            rounds[i][0] = questionString;
            rounds[i][1] = String.valueOf(correctAnswer);
        }
        var question = "Find the greatest common divisor of given numbers.";
        Engine.start(question, rounds);
    }
}
