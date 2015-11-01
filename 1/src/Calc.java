/**
 * Created by ASUS on 31.10.2015.
 */
import java.util.Scanner;


public class Calc {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2, sum, difference, multiplication, division;

            System.out.println("Enter first number: ");
            n1 = scanner.nextInt();
            System.out.println("Enter second number: ");
            n2 = scanner.nextInt();
            sum = n1 + n2;
            difference = n1 - n2;
            multiplication = n1 * n2;
        System.out.println("Sum:" + sum);
        System.out.println("Difference:" + difference);
        System.out.println("Multiplication:" + multiplication);

         try {
             division = n1 / n2;
             System.out.println("Division:" + division);
         }
        catch (ArithmeticException e){
            System.out.println("Incorrect-Division to zero");
        }
               }

    }



