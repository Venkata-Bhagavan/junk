package practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: 13-07-2022 need to validate input

        int input = scanner.nextInt();
        System.out.println(input + " is  " + ((isArmstrong(input) ? "a" : "not" )+ " armstrong number"));

        int[] myInts = new int[6];
        int[] copy =new int[myInts.length];//= Arrays.copyOf(myInts, myInts.length);
        System.arraycopy(myInts, 0, copy, 0, myInts.length);
    }

    private static boolean isArmstrong(int a) {
        int sum = 0, copy = a;
        while (a > 0) {
            sum = sum + (int) Math.pow(a % 10, String.valueOf(a).length());
            a = a / 10;
        }
        return sum == copy;
    }
}
