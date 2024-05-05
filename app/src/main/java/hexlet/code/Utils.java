package hexlet.code;

public class Utils {
    public static int generateRandomNumber() {
        return (int) ((Math.random() * (Engine.MAX_RANDOM_NUMBER - Engine.MIN_RANDOM_NUMBER)) + Engine.MIN_RANDOM_NUMBER);
    }
    public static int findGreatestCommonDivider(int firstNumber, int secondNumber) {
        while (firstNumber > 0 && secondNumber > 0) {
            if (firstNumber >= secondNumber) {
                firstNumber = firstNumber % secondNumber;
            } else {
                secondNumber = secondNumber % firstNumber;
            }
        }
        return Math.max(firstNumber, secondNumber);
    }
}
