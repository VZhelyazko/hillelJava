package Main;

/**
 * Created by ASUS on 12.11.2015.
 */

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");
        int vav = scanner.nextInt();
        int mac = Calc(vav);
        System.out.println("The sum is :" + mac);
    }
    public static int Calc(int vav) {
        int sum = 0;
        while (vav != 0) {
            sum = sum + (vav % 10);
            vav /= 10;
        }
        return sum;
    }
}
