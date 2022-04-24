package dummy;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(new Scanner(System.in).nextInt()));

    }

    private static long factorial(int n) {
        if (n>1) return n * factorial(n - 1);
        else return 1;
    }
}
