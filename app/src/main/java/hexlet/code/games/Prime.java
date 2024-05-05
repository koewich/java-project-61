package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.generateRandomNumber;

public class Prime {
    public static final String QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void start() {
        String[][] rounds = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (var i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            var randomNumber = generateRandomNumber(Engine.MIN_RANDOM_NUMBER, Engine.MAX_RANDOM_NUMBER);
            var correctAnswer = isPrime(randomNumber) ? "yes" : "no";
            rounds[i][0] = String.valueOf(randomNumber);
            rounds[i][1] = correctAnswer;
        }
        Engine.start(QUESTION, rounds);
    }
    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;
        for (var i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

