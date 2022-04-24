import java.util.Scanner;

public class AbstractDataType {
    static int ch, n;

    static String g;
    static int[] a = new int[20]; // make it user defined
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        do {
            print("\n main Menu");
            print(" 1.Create \t 2.Delete \t 3.Search \t 4.Insert \t 5.Display\t 6.Exit ");
            print(" Enter your Choice");
            ch = sc.nextInt();
            switch (ch) {
                case 1 -> create();
                case 2 -> deletion();
                case 3 -> search();
                case 4 -> insert();
                case 5 -> display();
                case 6 -> System.exit(0);
                default -> print(" Enter the correct choice:");
            }
            print("\n Do u want to continue::(y/n)");
            sc.nextLine();   // TODO: 23-03-2022 know why this line is needed.
            g = sc.nextLine();
        } while (g.equals("y") || g.equals("Y"));
    }

    private static void create() {
        print("Enter the no.of nodes");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            print(" Enter the  Element:" + (i + 1));
            a[i] = sc.nextInt();
        }
    }

    private static void deletion() {
        print("Enter the position you want to delete: ");
        int pos = sc.nextInt();
        if (pos > n || pos < 1) {
            print("invalid location");
        } else {

            for (int i = pos - 1; i < n; i++)
                a[i] = a[i + 1];
            n--;

            print(" The Elements after deletion");
            for (int i = 0; i < n; i++)
                print("\t " + a[i]);
        }


    }

    private static void search() {
        print(" Enter the Element to be searched:");
        int s = sc.nextInt();

        StringBuilder position = new StringBuilder();
        for (int i =0; i<n; i++) if (a[i] == s) position.append(i + 1).append("  ");
        print((!position.toString().isEmpty()) ? "The " + s + " is in positions " + position  : s + " not found");

    }

    private static void insert() {
        print("Enter the position you need to insert");

        int pos = sc.nextInt();

        if (pos > n+1 || pos<1) {
            print("Invalid location");
        }  else {
            n++;
            for (int i = n; i >= pos; i--) a[i] = a[i - 1];
            print("Enter no. to Insert");
            int b = sc.nextInt();
            a[pos -1] = b;

        }
    }

    private static void display() {
        print(" The Elements of The list ADT are:");
        for (int i = 0; i < n; i++)
            print(" " + a[i]);

    }

    private static void print(String s) {
        System.out.println(s);
    }
}
