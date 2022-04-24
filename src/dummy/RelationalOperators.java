package dummy;

import java.util.Scanner;

public class RelationalOperators {
    static int f = 1;
    public static void main(String[] args) {
        System.out.println("enter no. to get factorial");
        int a = new Scanner(System.in).nextInt();
        for (int i = 1; i <= a; i++) f *= i;
        System.out.println("factorial of " + a + "is : " + f);

    }

}
