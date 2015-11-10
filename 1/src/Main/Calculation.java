package Main;

/**
 * Created by ASUS on 10.11.2015.
 */

import java.util.Scanner;


public class Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1, n2, sum, difference, multiplication, division;

        System.out.println("Enter first number: ");
        n1 = scanner.nextDouble();
        System.out.println("Enter second number: ");
        n2 = scanner.nextDouble();
        sum = n1 + n2;
        difference = n1 - n2;
        multiplication = n1 * n2;
        System.out.println("Sum:" + sum);
        System.out.println("Difference:" + difference);
        System.out.println("Multiplication:" + multiplication);
        if (n2 == 0) {
            System.out.println("Incorrect-Division to zero");
        } else {
            division = n1 / n2;
            System.out.println("Division:" + division);
        }
    }
}
