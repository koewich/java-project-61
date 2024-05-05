package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.generateRandomNumber;

public class Even {
    public static void start() {
        String[][] rounds = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (var i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            var randomNumber = generateRandomNumber(Engine.MIN_RANDOM_NUMBER, Engine.MAX_RANDOM_NUMBER);
            var correctAnswer = isEven(randomNumber) ? "yes" : "no";
            rounds[i][0] = String.valueOf(randomNumber);
            rounds[i][1] = correctAnswer;
        }
        var question = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.start(question, rounds);
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
