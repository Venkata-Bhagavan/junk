import java.util.*;

class Adt { // Abstract Data Type

    static int ch, n, pos, e, i, MAX = 20, p, f = 0;
    static String g = "y";
    static int[] b = new int[MAX];
    //static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            print(" main Menu");
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
                default -> print("\n Enter the correct choice:");
            }
            print("\n Do u want to continue::(y/n)");
            sc.nextLine();   // TODO: 23-03-2022 know why this line is needed.
            g = sc.nextLine();
        } while (g.equals("y") || g.equals("Y"));
    }


    static void create() {
        Scanner sc = new Scanner(System.in);
        print("\n Enter the number of nodes");
        n = sc.nextInt();
        for (i = 0; i < n; i++) {
            print("\n Enter the  Element:" + (i + 1));
            b[i] = sc.nextInt();
        }
    }

    static void deletion() {
        Scanner sc = new Scanner(System.in);
        print("\n Enter the position u want to delete::");
        pos = sc.nextInt();
        if (pos >= n)
            print("\n Invalid Location::");
        else {
            for (i = pos + 1; i < n; i++)
                b[i - 1] = b[i];

            n--;
        }
        print("\n The Elements after deletion");
        for (i = 0; i < n; i++)
            print("\t " + b[i]);

    }

    static void search() {
        Scanner sc = new Scanner(System.in);
        print("\n Enter the Element to be searched:");
        e = sc.nextInt();

        for (i = 0; i < n; i++)
            if (b[i] == e)
                f = i;
        if (f != 0)
            print("Value is in the " + f + "Position");
        else
            print("Value " + e + " is not in the list::");


    }

    static void insert() {
        Scanner sc = new Scanner(System.in);
        print("\n Enter the position u need to insert::");
        pos = sc.nextInt();

        if (pos >= n)
            print("\n invalid Location::");
        else {
            for (i = n - 1; i >= pos - 1; i--)
                b[i + 1] = b[i];

            print("\n Enter the element to insert::\n");
            p = sc.nextInt();
            b[pos] = p;
            n++;
        }
        print("\n The list after insertion::\n");
        display();
    }


    static void display() {
        print("\n The Elements of The list ADT are:");
        for (i = 0; i < n; i++)
            print("\n " + b[i]);

    }

    private static void print(String s) {
        System.out.println(s);
    }
}