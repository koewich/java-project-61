package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
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
                break;
            case ("4"):
                GCD.start();
                break;
            case ("5"):
                Progression.start();
                break;
            case ("6"):
                Prime.start();
                break;
            case ("0"):
            default:
                break;
        }
    }
}
