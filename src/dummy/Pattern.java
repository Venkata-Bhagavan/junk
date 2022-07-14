package dummy;

import java.util.Stack;

public class Pattern {

    public static void main(String[] args) {

        int a = 4;
        /*int b = a * 2;*/

       /* for (int i = 1; i <= a; i++) {
            for (int j = 1; j < a * 2; j++) {
                p(i == j || j == (a * 2 - i) ? i : " ");

            }
            System.out.println();

        }*/
        pattern0();
    }

    private static void pattern0() {
        int n = 6;
        String space = getspace(n);

        for (int row = 1; row <= n; row++) {
            for (int i = 1; i <= n; i++) {
                p(i == row ? row : space);
            }
            for (int i = n-1; i >= 1; i--) {
                p(i==row?row:space);
            }
            System.out.println();
        }
        for (int row = n-1; row >= 1; row--) {
            for (int i = 1; i<=n-1;i++) {
                p(row==i?row:space);
            }
            for (int i = n-1; i>=row;i--) {
                p(row==i?space+row:space);
            }
            System.out.println();
        }

    }

    private static String getspace(int n) {

        return " ".repeat(String.valueOf(n).length());
    }


    private static <T> void p(T s) {
        System.out.print(s);
    }


}
