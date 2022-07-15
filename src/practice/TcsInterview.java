package practice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TcsInterview {
    public static void main(String[] args) {
        /*int[] ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        for (int i = 0; i < ints.length / 2; i++) {
            System.out.println(ints[i] + ints[ints.length - i - 1]);
        }*/
        stringSeparator();
    }

    private static void stringSeparator() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder builder = new StringBuilder();

        for (int i =0; i < s.length(); i++) {
            if (s.substring(i, i+1).matches("[a-zA-Z]")) {
                builder.append(s.charAt(i));
            }
        }

        System.out.println(builder);
    }
}
