package Main;

/**
 * Created by ASUS on 11.11.2015.
 */

import java.util.Scanner;

public class Evenodd {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number :");

            int input = scanner.nextInt();
            if (input % 2 == 0) {
                System.out.println("even and not simple number");
            } else //{System.out.println("odd number");
            {
                int y = input / (input - 1);
                if (y != 1) {
                    System.out.println("odd and not simple number");
                } else {
                    System.out.println("odd and simple number");
                }
            }
        }
    }
