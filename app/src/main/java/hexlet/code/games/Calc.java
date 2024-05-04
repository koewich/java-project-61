package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Utils.generateRandomNumber;

public class Calc {
    public static void start() {
        String[][] rounds = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (var i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            var firstRandomNumber = generateRandomNumber(1, Engine.MAX_RANDOM_NUMBER);
            var secondRandomNumber = generateRandomNumber(1, Engine.MAX_RANDOM_NUMBER);
            String[] operations = {"+", "-", "*"};
            var rnd = new Random().nextInt(operations.length);
            var randomOperation = operations[rnd];
            var operationString = firstRandomNumber + " " + randomOperation + " " + secondRandomNumber;
            var resultOfOperation = switch (randomOperation) {
                case "+" -> firstRandomNumber + secondRandomNumber;
                case "-" -> firstRandomNumber - secondRandomNumber;
                case "*" -> firstRandomNumber * secondRandomNumber;
                default -> 0;
            };
            rounds[i][0] = operationString;
            rounds[i][1] = String.valueOf(resultOfOperation);
        }
        Engine.start("What is the result of the expression?", rounds);
    }
}
