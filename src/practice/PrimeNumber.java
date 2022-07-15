package practice;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: 15-07-2022 Validate input.
        int a = scanner.nextInt();

        System.out.println(a + " is  " + ((isPrime(a) ? "a " : "not ") + "prime number"));

    }

    private static boolean isPrime(int a) {

        if (a==1) return false;
        if (a== 2) return true;
            int f = 0;
            for (int i = 3; i < a; i += 2) {
                if (a % i == 0) {
                    f++;
                }
            }
            return f == 0 && a % 2 != 0;

    }
}
