package practice;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumber implements MyInterface {
    public static void main(String[] args) {
        // TODO: 10-07-2022 validate input
        int original = new Scanner(System.in).nextInt();
        System.out.println("Original num :" + original);
        System.out.println("Reversed num :" + reverseNum(original));

    }

    /** This method will Reverse and return the integers
     * @param x integer that needs to be reversed*/
    public static int reverseNum(int x) {
       /* int reverse = 0;
        while (x != 0) {
            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }
        return reverse;*/

        return Integer.parseInt(new StringBuilder().append(String.valueOf(x)).reverse().toString());
    }

    protected   int abc(int a) {
        return 0;
    }
    @Override
    public boolean run() {
        return false;
    }

    @Override
    public void sleep(boolean b) {

    }
}
