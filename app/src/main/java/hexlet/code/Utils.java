package hexlet.code;

public class Utils {
    public static int generateRandomNumber(int minNumber, int maxNumber) {
        return (int) ((Math.random() * (maxNumber - minNumber)) + minNumber);
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
