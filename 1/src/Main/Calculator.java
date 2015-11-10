package Main;

/**
 * Created by ASUS on 11.11.2015.
 */
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int FirstNumberConsole, SecondNumberConsole, result;

        System.out.println("Enter First Number");
        FirstNumberConsole = scanner.nextInt();
        System.out.println("Enter Second Number");
        SecondNumberConsole = scanner.nextInt();
        String operation = scanner.next();
        switch (operation) {
            case "+":
                result = FirstNumberConsole + SecondNumberConsole;
                System.out.println(result);
                break;
            case "-":
                result = FirstNumberConsole - SecondNumberConsole;
                System.out.println(result);
                break;
            case "/":
                result = FirstNumberConsole / SecondNumberConsole;
                System.out.println(result);
                break;
            case "*":
                result = FirstNumberConsole * SecondNumberConsole;
                System.out.println(result);
            default:
                break;

        }

    }
}