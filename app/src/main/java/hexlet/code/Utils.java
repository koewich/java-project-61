package hexlet.code;

public class Utils {
    public static int generateRandomNumber() {
        return (int) ((Math.random() * (Engine.MAX_RANDOM_NUMBER - Engine.MIN_RANDOM_NUMBER)) + Engine.MIN_RANDOM_NUMBER);
    }
}
