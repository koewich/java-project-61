package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Utils.generateRandomNumber;

public class Progression {
    public static final String QUESTION = "What number is missing in the progression?";
    public static final int MIN_PROGRESSION_LEN = 5;
    public static final int MAX_PROGRESSION_LEN = 10;
    public static void start() {
        String[][] rounds = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (var i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            var progressionLength = generateRandomNumber(MIN_PROGRESSION_LEN, MAX_PROGRESSION_LEN);
            var progressionStart = generateRandomNumber(Engine.MIN_RANDOM_NUMBER, Engine.MAX_RANDOM_NUMBER);
            var progressionStep = generateRandomNumber(Engine.MIN_RANDOM_NUMBER, Engine.MAX_RANDOM_NUMBER);
            var hiddenProgressionItemPosition = generateRandomNumber(0, progressionLength - 1);
            int[] progressionArray = new int[progressionLength];
            StringBuilder progressionString = new StringBuilder();
            progressionArray[0] = progressionStart;
            for (var j = 0; j < progressionLength; j++) {
                progressionArray[j] = progressionStart + progressionStep;
                progressionStart = progressionStart +progressionStep;
                if (j == hiddenProgressionItemPosition) {
                    progressionString.append(".. ");
                } else {
                    progressionString.append(progressionArray[j]);
                    progressionString.append(" ");
                }
            }
            rounds[i][0] = String.valueOf(progressionString);
            rounds[i][1] = String.valueOf(progressionArray[hiddenProgressionItemPosition]);
        }
        Engine.start(QUESTION, rounds);
    }
}