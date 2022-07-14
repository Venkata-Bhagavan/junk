package practice;

public class Patterns {
    public static void main(String[] args) {

        pattern2();
    }

    private static void pattern1() {
        int n = 6;
        for (int row = 1; row < n; row++) {
            for (int i = row; i <n ; i++) {
                System.out.print("   ");
            }
            for (int i = 1; i < row; i++) {
                System.out.print(" "+row+" ");
            }
            for (int i = 1; i <=row ; i++) {
                System.out.print(" "+row+" ");
            }
            System.out.println();
        }

        for (int row = n; row >= 1; row--) {
            for (int i = row; i < n; i++) {
                System.out.print("   ");
            }
            for (int i = row; i > 1; i--) {
                System.out.print(" "+row+" ");
            }
            for (int i = row; i >= 1; i--) {
                System.out.print(" "+row+" ");
            }

            System.out.println();
        }


    }

    static private void pattern2() {
        int n = 8;
        for (int row = 1; row < n; row++) {
            for (int i = 1; i < row; i++) {
                System.out.print(" ");
            }
            for (int i = row; i <= n; i++) {
                System.out.print(" "+row);
            }
            System.out.println();
        }
        for (int row = n; row >= 1; row--) {
            for (int i = 1; i<row;i++) {
                System.out.print(" ");
            }
            for (int i = row; i <=n ; i++) {
                System.out.print(" "+row);
            }
            System.out.println();
        }
    }
}
