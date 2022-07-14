package practice;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: 13-07-2022 need to validate input
        int year = scanner.nextInt();

        System.out.println(year + " is a " + (isLeapYear(year) ? "leap year" : "non leap year"));
        /*if (year % 400 == 0 || year % 4 != 0) {
            System.out.println(year + " is not a leap year");
        } else {
            System.out.println(year + " is a leap year");
        } */
    }

    private static boolean isLeapYear(int year) {
        return !(year % 400 == 0 || year % 4 != 0);
    }


}
