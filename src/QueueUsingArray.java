import java.util.Scanner;

public class QueueUsingArray {
    static int ch, max, size = 0;
    static int[] a;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        print("Enter the length of queue");
        max = sc.nextInt();
        a = new int[max];

        while (true) {
            print("Select Options \n" + "1.Insert \t 2. Delete \t 3.Display \t 4. Exit");
            ch = sc.nextInt();
            if (ch == 4) break;
            else switch (ch) {
                case 1 -> insert();
                case 2 -> delete();
                case 3 -> display();
            }
        }
    }

    private static void insert() {
        if (size >= a.length) {
            print("Queue is full");
        } else {
            print("Enter the Element: ");
            a[size] = new Scanner(System.in).nextInt();
            size = size + 1;


        }
    }
    private static void delete() {
        if (size == 0) {
            print("Queue is Empty");
        } else {
            size = size - 1;
            for (int i = 0; i < size; i++) {
                a[i] = a[i + 1];
            }  //if (size >= 0) System.arraycopy(a, 1, a, 0, size);
        }
    }

    private static void display() {
        print("Elements in queue are");
        for (int i = 0; i < size; i++) {
            print(a[i]);
        }
    }

    private static <T> void print(T s) {
        System.out.println(s);

    }
}
