package Main;

/**
 * Created by ASUS on 10.11.2015.
 */
import java.util.Scanner;

    public class Average{
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            double total = 0;
            int count = 0;
            System.out.println("Number :");


            while (in.hasNextDouble()) {
                System.out.println("Number:");
                double input = in.nextDouble();
                total = total + input;            //System.out.println("Total is: "+total);
                count++;
            }

            double average = 0;
            if (count > 0) {
                average = total / count;
            }

            System.out.println("Arithmetical mean value is :" + average);
        }
    }


