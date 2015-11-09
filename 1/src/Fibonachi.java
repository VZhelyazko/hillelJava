/**
 * Created by ASUS on 09.11.2015.
 */
public class Fibonachi {

    public static void main(String[] args) {
        int choise = fibonachi(30);
        System.out.println("Fibonachi number is :" +choise);
    }
    static int fibonachi ( int i){
        if ((i == 0) || (i==1))
            return 1;
        return fibonachi(i - 1) + fibonachi(i - 2);
    }
}

