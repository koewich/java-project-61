package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        System.out.println("Your choice: " + choice);
        System.out.println();
        switch (choice) {
            case ("1"):
                Cli.greetUser();
                break;
            case ("2"):
                Even.start();
                break;
            case ("3"):
                Calc.start();
            case ("0"):
            default:
                break;
        }
    }
}
